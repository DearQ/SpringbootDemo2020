package com.t05g1.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.t05g1.pojo.User;
import com.t05g1.service.UserService;
import com.t05g1.util.isPcInAndroid;
import com.zhenzi.sms.ZhenziSmsClient;

@Controller
public class UserController {
	
	//注入业务逻辑层
	@Autowired
	private UserService userService;
	
	/**
	 * 用戶账号密码登录
	 * 
	 * @param text 用户传入账号参数
	 * @param u_user 用户的用户名
	 * @param u_phone 用户的电话
	 * @param u_email 用户的邮箱
	 * @param u_pwd 用户的密码
	 * @param mv  ModelAndView
	 * @return  登录成功返回用户信息，失败为空
	 */
	@RequestMapping("login.do")
	public ModelAndView login(
			String text,
			@RequestParam(value="u_user",required = false)String u_user,
			@RequestParam(value="u_phone",required = false)String u_phone,
			@RequestParam(value="u_email",required = false)String u_email,
			String u_pwd,
			ModelAndView mv,
			HttpServletRequest request,
			HttpSession session) throws IOException {
		User user=null;
		String ua =request.getHeader("User-Agent");
		//判断是移动端还是PC端
		if(isPcInAndroid.checkAgentIsMobile(ua)){  
			//来自移动端访问
			user=userService.login(text,u_user,u_phone,u_email,u_pwd);
			
			if(user==null) {
				mv.addObject("msg", 1);
				mv.setViewName("redirect:/userAn/login.html");
			}else {
				session.setAttribute("user", user);
				mv.setViewName("redirect:/");
			}
			
		}else {
			//来自PC端访问
			user=userService.login(text,u_user,u_phone,u_email,u_pwd);
			if(user==null) {
				mv.addObject("msg", 1);
				mv.setViewName("redirect:/userPC/login.html");
			}else {
				session.setAttribute("user", user);
				mv.setViewName("redirect:/");
			}
		}
			  
		
		return mv;
	}
	//电脑用户验证码登录
	@RequestMapping("loginYZPC.do")
	public ModelAndView loginYZPC(String phone,HttpSession session,ModelAndView mv) {
		
		
		User user=user=userService.loginYZ(phone);
		
		if(user==null) {
			mv.setViewName("redirect:/userPC/login.html");
		}else {
			session.setAttribute("user", user);
			mv.setViewName("redirect:/");
		}
		return mv;
	}
	//手机用户验证码登录
	@CrossOrigin(origins = "http://")
	@ResponseBody
	@RequestMapping("loginYZAn.do")
	public String loginYZAn(String phone,HttpSession session) {
		
		User user=user=userService.loginYZ(phone);
		
		if(user==null) {
			return "on";
		}else {
			session.setAttribute("user", user);
			return "ok";
		}
			
		
	}
	//用户注册--判断是否注册
	@ResponseBody
	@RequestMapping("phoneYZ.do")
	public String phoneYZ(String phone) {
		//System.out.println(phone);
		int ret=userService.countUserId(phone);
		if(ret>0) {
			return "no";
		}else {
			return "ok";
		}
	}
	/**
	 * 发送验证码
	 * @param phone 发送的手机号
	 * @param content 提示内容
	 * @return
	 */
	@ResponseBody
	@RequestMapping("yzmInfo.do")
	public Map<String, String> yzmInfo(String phone,String content) {
		//System.out.println("手机号："+phone);
		//短信平台相关参数
		String apiUrl = "https://sms_developer.zhenzikj.com";
		String appId = "103949";
		String appSecret = "e0b29a9f-0c46-4d31-b28b-11f73a03e87f";
		String result=null;
		String verifyCode=null;
		Map<String, String> maps = new HashMap<String,String>();;
		try {
			//生成6位验证码
			verifyCode = String.valueOf(new Random().nextInt(899999) + 100000);
			//发送短信
			ZhenziSmsClient client = new ZhenziSmsClient(apiUrl, appId, appSecret);
			//System.out.println("输出="+client);
			Map<String, String> params = new HashMap<String, String>();
			params.put("number", phone);
			params.put("message", "验证码为:"+verifyCode + content);
			try {
				result = client.send(params);
				maps.put("result", result);
				maps.put("verifyCode", verifyCode);
			} catch (Exception e) {
				maps.put("erro", "0");
				System.out.println("网络异常，掉包了");
			}
			
			
			/*if(result!=null) {
				maps=new HashMap<String,String>();
				maps.put("result", result);
				maps.put("verifyCode", verifyCode);
			}*/
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return maps;
	}
	
	/**
	 * 手机用户注册
	 * @param phone 用户手机号
	 * @param pwd 用户密码
	 * @return ok（注册成功） on（注册失败）
	 */
	@ResponseBody
	@RequestMapping("register.do")
	public String register(String phone,String pwd) {
		

		//System.out.println(text);
		
		 int ret=userService.register(phone,pwd); 
		 if(ret>0) { 
			 return "ok"; 
		 }else {
		 
			 return "on";
		 
		 }
	}
	
	/**
	 * 电脑用户注册
	 * @param phone 用户手机号
	 * @param name 用户昵称
	 * @param pwd 用户密码
	 * @return ok（注册成功） on（注册失败）
	 */
	@ResponseBody
	@RequestMapping("registerPc.do")
	public String registerPc(String phone,String name,String pwd) {
		

		//System.out.println(text);
		
		 int ret=userService.registerPC(phone,name,pwd); 
		 if(ret>0) { 
			 return "ok"; 
		 }else {
		 
			 return "on";
		 
		 }
	}
	/**
	 * 查看用户信息
	 * @param mv
	 * @param session
	 * @param request
	 * @return
	 */
	@RequestMapping("showUserInfo.do")
	public ModelAndView showUserInfo(ModelAndView mv,HttpSession session,HttpServletRequest request) {
		
		User user=(User) session.getAttribute("user");
		//System.out.println(user.getU_photo());
		String ua =request.getHeader("User-Agent");
		//判断是移动端还是PC端
		if(isPcInAndroid.checkAgentIsMobile(ua)){
			//移动端
			mv.addObject("user", user);
			
			mv.setViewName("userAn/perCore.html");
		}else {
			//pc端
			mv.addObject("user", user);
			mv.setViewName("userPC/my.html");
		}
		
		
		return mv;
		
	}
	//pc退出登录
	@RequestMapping("logout.do")
	public String logout(HttpSession session) {
		session.removeAttribute("user");
		//清除session
		session.invalidate();
		return "redirect:/userPC/login.html";
	}
	//an退出登录
	@RequestMapping("logoutAn.do")
	public String logoutAn(HttpSession session) {
		session.removeAttribute("user");
		//清除session
		session.invalidate();
		return "redirect:/userAn/login.html";
	}
}
