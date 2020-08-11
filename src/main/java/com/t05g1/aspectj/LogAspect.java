package com.t05g1.aspectj;

import com.alibaba.fastjson.JSONObject;
import com.t05g1.annotation.Log;
import com.t05g1.pojo.SystemLog;
import com.t05g1.service.ISystemLogService;
import com.t05g1.util.IpUtils;
import org.apache.shiro.SecurityUtils;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 * @author qzs
 * @organization
 * @date 2020/01/05 0030 16:35
 * @desc TODO
 */
@Aspect
@Component
public class LogAspect {

    @Resource
    private ISystemLogService logService;
    /**
     * 此处的切点是注解的方式，也可以用包名的方式达到相同的效果
     * '@Pointcut("execution(* com.wwj.springboot.service.impl.*.*(..))")'
     */
    @Pointcut("@annotation(com.t05g1.annotation.Log)")
    public void operationLog(){}


    /**
     * 环绕增强，相当于MethodInterceptor
     */
    @Around("operationLog()")
    public Object doAround(ProceedingJoinPoint joinPoint) throws Throwable {
        Object res = null;
        long time = System.currentTimeMillis();
        try {
            res =  joinPoint.proceed();
            time = System.currentTimeMillis() - time;
            return res;
        } finally {
            try {
                //方法执行完成后增加日志
                addOperationLog(joinPoint,res,time);
            }catch (Exception e){
                System.out.println("LogAspect 操作失败：" + e.getMessage());
                e.printStackTrace();
            }
        }
    }

    private void addOperationLog(JoinPoint joinPoint, Object res, long time){
        //获得登录用户信息
        String systemUser = (String) SecurityUtils.getSubject().getPrincipal();
        MethodSignature signature = (MethodSignature)joinPoint.getSignature();
        SystemLog operationLog = new SystemLog();
        //获取内网地址IpUtils.intranetIp()
        //获取外网地址IpUtils.internetIp()
        operationLog.setIpAddress(IpUtils.intranetIp());
        operationLog.setRunTime(time);
        operationLog.setReturnValue(JSONObject.toJSONString(res));
        operationLog.setId(UUID.randomUUID().toString());
        
        
        Object[] args = joinPoint.getArgs();
        Object[] arguments  = new Object[args.length]; 
        for (int i = 0; i < args.length; i++) {
            if (args[i] instanceof ServletRequest || args[i] instanceof ServletResponse || args[i] instanceof MultipartFile) {
                //ServletRequest不能序列化，从入参里排除，否则报异常：java.lang.IllegalStateException: It is illegal to call this method if the current request is not in asynchronous mode (i.e. isAsyncStarted() returns false)
                //ServletResponse不能序列化 从入参里排除，否则报异常：java.lang.IllegalStateException: getOutputStream() has already been called for this response
                continue;
            }
            arguments[i] = args[i];
        }
        String paramter = "";
        if (arguments != null) {
            try {
                paramter = JSONObject.toJSONString(arguments);
            } catch (Exception e) {
                paramter = arguments.toString();
            }
        }
        
        
        operationLog.setArgs(paramter);
        operationLog.setCreateTime(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
        operationLog.setMethod(signature.getDeclaringTypeName() + "." + signature.getName());
        operationLog.setUserId(1+"");
        operationLog.setUserName(systemUser);
        Log annotation = signature.getMethod().getAnnotation(Log.class);
        if(annotation != null){
        	
        	  
            Object[] args1 = joinPoint.getArgs();
            Object[] arguments1  = new Object[args.length];
            for (int i = 0; i < args.length; i++) {
                if (args[i] instanceof ServletRequest || args[i] instanceof ServletResponse || args[i] instanceof MultipartFile) {
                    //ServletRequest不能序列化，从入参里排除，否则报异常：java.lang.IllegalStateException: It is illegal to call this method if the current request is not in asynchronous mode (i.e. isAsyncStarted() returns false)
                    //ServletResponse不能序列化 从入参里排除，否则报异常：java.lang.IllegalStateException: getOutputStream() has already been called for this response
                    continue;
                }
                arguments1[i] = args1[i];
            }
            Object[] par =null;
            if (arguments1 != null) {
                try {
                    par = (Object[]) JSONObject.toJSON(arguments1);
                } catch (Exception e) {
                    par = arguments1;
                }
            }
            operationLog.setLogLevel(annotation.level());
            operationLog.setLogDescribe(getDetail(((MethodSignature)joinPoint.getSignature()).getParameterNames(),par,annotation));
            operationLog.setOperationType(annotation.operationType().getValue());
            operationLog.setOperationUnit(annotation.operationUnit().getValue());
        }
        //TODO 这里保存日志
        System.out.println("记录日志:" + operationLog.toString());
        int i = logService.addLog(operationLog);
        System.out.println(i);
    }

    /**
     * 对当前登录用户和占位符处理
     * @param argNames 方法参数名称数组
     * @param args 方法参数数组
     * @param annotation 注解信息
     * @return 返回处理后的描述
     */
    private String getDetail(String[] argNames, Object[] args, Log annotation){
        //获得登录用户信息
        String systemUser = (String) SecurityUtils.getSubject().getPrincipal();
        Map<Object, Object> map = new HashMap<>(4);
        for(int i = 0;i < argNames.length;i++){
            map.put(argNames[i],args[i]);
        }

        String detail = annotation.detail();
        try {
            detail = systemUser + "执行了" + annotation.detail();
            for (Map.Entry<Object, Object> entry : map.entrySet()) {
                Object k = entry.getKey();
                Object v = entry.getValue();
                detail = detail.replace("{{" + k + "}}", JSONObject.toJSONString(v));
            }
        }catch (Exception e){
            e.printStackTrace();
        }
         return detail;
    }

    @Before("operationLog()")
    public void doBeforeAdvice(JoinPoint joinPoint){
        System.out.println("进入方法前执行.....");

    }

    /**
     * 处理完请求，返回内容
     * @param ret
     */
    @AfterReturning(returning = "ret", pointcut = "operationLog()")
    public void doAfterReturning(Object ret) {
        System.out.println("方法的返回值 : " + ret);
    }

    /**
     * 后置异常通知
     */
    @AfterThrowing("operationLog()")
    public void throwss(JoinPoint jp){
        System.out.println("方法异常时执行.....");
    }


    /**
     * 后置最终通知,final增强，不管是抛出异常或者正常退出都会执行
     */
    @After("operationLog()")
    public void after(JoinPoint jp){
        System.out.println("方法最后执行.....");
    }
}
