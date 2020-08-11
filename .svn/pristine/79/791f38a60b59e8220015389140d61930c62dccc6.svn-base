package com.t05g1.controller;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.alipay.api.AlipayApiException;
import com.alipay.api.AlipayClient;
import com.alipay.api.domain.AlipayTradePagePayModel;
import com.alipay.api.domain.AlipayTradeWapPayModel;
import com.alipay.api.request.AlipayTradePagePayRequest;
import com.alipay.api.request.AlipayTradeWapPayRequest;
import com.t05g1.config.AlipayConfig;
import com.t05g1.pojo.User;
import com.t05g1.pojo.User_Order;
import com.t05g1.service.User_OrderService;
import com.t05g1.util.AliPayUtil;
import com.t05g1.util.isPcInAndroid;

@Controller
public class User_OrderController {
	
	
	@Autowired
	private User_OrderService user_OrderService;
	
	/**
	 * PC用户提交订单
	 * @param orderNumber 订单编号
	 * @param productName 商品名称
	 * @param consignee   收获人姓名
	 * @param money		     订单金额
	 * @param amount      订单数量
	 * @param shopAddress 收获地址
	 * @param phone       联系人
	 * @param str         订单商品id
	 * @param session     用户信息
	 * @return   
	 */
	@Transactional
	@ResponseBody
	@RequestMapping("addUserOrder.do")
	public String addUserOrder(String orderNumber,String productName,
			String consignee,String money,Integer amount,
			String shopAddress,String phone,
			String str,HttpSession session) {
		User user=(User) session.getAttribute("user");
		//System.out.println(orderNumber+productName+consignee+money+amount+user.getU_id()+shopAddress+phone);
		//新增订单记录
		int ret = user_OrderService.addUserOrder(orderNumber,productName,consignee,money,amount,user.getU_id(),shopAddress,phone);
		//查询此订单
		int oid=user_OrderService.orderInfoId(orderNumber);
		//为订单加入商品
		int upoid=user_OrderService.updateShooopcOid(str,oid);
		if (ret>0&&oid>0&&upoid>0) {
			return "ok";
		}else {
			return "no";
		}
		
	}
	/**
	 * an用户提交订单
	 * @param orderNumber 订单编号
	 * @param productName 商品名称
	 * @param consignee   收获人姓名
	 * @param money		     订单金额
	 * @param amount      订单数量
	 * @param shopAddress 收获地址
	 * @param phone       联系人
	 * @param str         订单商品id
	 * @param session     用户信息
	 * @return   
	 */
	@Transactional
	@RequestMapping("addUserOrderAn.do")
	public ModelAndView addUserOrderAn(String orderNumber,String productName,
			String consignee,String money,Integer amount,
			String shopAddress,String phone,
			String str,HttpSession session,ModelAndView mv) {
		User user=(User) session.getAttribute("user");
		//System.out.println(orderNumber+productName+consignee+money+amount+user.getU_id()+shopAddress+phone);
		//新增订单记录
		int ret = user_OrderService.addUserOrder(orderNumber,productName,consignee,money,amount,user.getU_id(),shopAddress,phone);
		//查询此订单
		int oid=user_OrderService.orderInfoId(orderNumber);
		//为订单加入商品
		int upoid=user_OrderService.updateShooopcOid(str,oid);
		mv.addObject("orderNumber", orderNumber);
		mv.addObject("productName", productName);
		mv.addObject("money", money);
		mv.addObject("amount", amount);
		
		mv.setViewName("redirect:/userAn/pay.html");
		return mv;
		
	}
    /*** PC用户调用支付*/
	@ResponseBody
    @RequestMapping(value = "/goAlipay.do", produces = "text/html; charset=UTF-8")
    public String goAlipay(String orderNumber,String productName,String money,Integer amount) throws IOException, AlipayApiException {
        //获得初始化的AlipayClient
        AlipayClient alipayClient = AliPayUtil.alipayClient;
        // 订单模型
        String productCode = "FAST_INSTANT_TRADE_PAY";
        AlipayTradePagePayModel model = new AlipayTradePagePayModel();
        model.setOutTradeNo(orderNumber);
        model.setSubject(productName);
        model.setTotalAmount(money);
        model.setBody("共"+amount+"件商品");
        model.setProductCode(productCode);

        AlipayTradePagePayRequest pagePayRequest = new AlipayTradePagePayRequest();
        pagePayRequest.setReturnUrl(AlipayConfig.return_url);
        pagePayRequest.setNotifyUrl(AlipayConfig.notify_url);
        pagePayRequest.setBizModel(model);
        //请求
        String result = alipayClient.pageExecute(pagePayRequest).getBody();
        //System.out.println(result);
        return result;
        
    }
    /*** An用户调用支付*/
	@ResponseBody
    @RequestMapping(value = "/gotoPayPage.do", produces = "text/html; charset=UTF-8")
    public void gotoPayPage(String orderNumber,String productName,String money,Integer amount,HttpServletResponse response) throws IOException, AlipayApiException {
        //获得初始化的AlipayClient
        AlipayClient alipayClient = AliPayUtil.alipayClient;
        // 订单模型
        String productCode="QUICK_WAP_WAY";
        AlipayTradeWapPayModel wapPayModel=new AlipayTradeWapPayModel();
        wapPayModel.setOutTradeNo(orderNumber);
        wapPayModel.setSubject(productName);
        wapPayModel.setTotalAmount(money);
        wapPayModel.setBody("共"+amount+"件商品");
        wapPayModel.setProductCode(productCode);

        AlipayTradeWapPayRequest wapPayRequest =new AlipayTradeWapPayRequest();
        wapPayRequest.setReturnUrl(AlipayConfig.return_url);
        wapPayRequest.setNotifyUrl(AlipayConfig.notify_url);
        wapPayRequest.setBizModel(wapPayModel);

        // 调用SDK生成表单, 并直接将完整的表单html输出到页面
        String form = alipayClient.pageExecute(wapPayRequest).getBody();
        //System.out.println(form);
        response.setContentType("text/html;charset=" + AlipayConfig.charset);
        response.getWriter().write(form);
        response.getWriter().flush();
        response.getWriter().close();
        
    }
	 
	
	/*** 同步回调*/
    @RequestMapping("/return_url")
    public ModelAndView return_url(HttpServletResponse response, HttpServletRequest request,ModelAndView mv) throws IOException, AlipayApiException {
    	//System.out.println(">>>>>>>>支付成功, 进入同步通知接口...");
        boolean verifyResult = AliPayUtil.rsaCheckV1(request);
        if (verifyResult) {
            //商户订单号
            String out_trade_no = AliPayUtil.getByte(request.getParameter("out_trade_no"));
            //支付宝交易号
            String trade_no = AliPayUtil.getByte(request.getParameter("trade_no"));
            System.out.println("商户订单号："+out_trade_no+"，支付宝交易号:"+trade_no);
            //订单支付成功
            int ret=user_OrderService.updateOrderPayStatus(out_trade_no);
            //mv.addObject("out_trade_no", out_trade_no);
            mv.setViewName("redirect:/showOrder.do");
        } else {
        	mv.setViewName("redirect:/showOrder.do");
        }
        return mv;
    }
    /*** 异步回调*/
    @ResponseBody
    @RequestMapping(value = "/notify_url", method = RequestMethod.POST)
    public String notify_url(HttpServletResponse response, HttpServletRequest request) throws IOException, AlipayApiException {
    	//System.out.println(">>>>>>>>支付成功, 进入异步通知接口...");
        // 一定要验签，防止黑客篡改参数
        Map<String, String[]> parameterMap = request.getParameterMap();
        StringBuilder notifyBuild = new StringBuilder(">>>>>>>>>> alipay notify >>>>>>>>>>>>>>\n");
        parameterMap.forEach((key, value) -> notifyBuild.append(key + "=" + value[0] + "\n"));
        notifyBuild.append(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        //System.out.println(notifyBuild.toString());
        boolean flag = AliPayUtil.rsaCheckV1(request);
        if (flag) {
            /**
             * TODO 需要严格按照如下描述校验通知数据的正确性
             *
             * 商户需要验证该通知数据中的out_trade_no是否为商户系统中创建的订单号，
             * 并判断total_amount是否确实为该订单的实际金额（即商户订单创建时的金额），
             * 同时需要校验通知中的seller_id（或者seller_email) 是否为out_trade_no这笔单据的对应的操作方（有的时候，一个商户可能有多个seller_id/seller_email），
             *
             * 上述有任何一个验证不通过，则表明本次通知是异常通知，务必忽略。
             * 在上述验证通过后商户必须根据支付宝不同类型的业务通知，正确的进行不同的业务处理，并且过滤重复的通知结果数据。
             * 在支付宝的业务通知中，只有交易通知状态为TRADE_SUCCESS或TRADE_FINISHED时，支付宝才会认定为买家付款成功。
             */

            //交易状态
            String tradeStatus = AliPayUtil.getByte(request.getParameter("trade_status"));
            // 商户订单号
            String out_trade_no = AliPayUtil.getByte(request.getParameter("out_trade_no"));
            //支付宝交易号
            String trade_no = AliPayUtil.getByte(request.getParameter("trade_no"));
            //付款金额
            String total_amount = AliPayUtil.getByte(request.getParameter("total_amount"));
            //System.out.println("交易状态:"+tradeStatus+",商户订单号:"+out_trade_no+",支付宝交易号:"+trade_no+",付款金额:"+total_amount+"");
            // TRADE_FINISHED(表示交易已经成功结束，并不能再对该交易做后续操作);
            // TRADE_SUCCESS(表示交易已经成功结束，可以对该交易做后续操作，如：分润、退款等);
            if (tradeStatus.equals("TRADE_FINISHED")) {
                //判断该笔订单是否在商户网站中已经做过处理
                //如果没有做过处理，根据订单号（out_trade_no）在商户网站的订单系统中查到该笔订单的详细，
                // 并判断total_amount是否确实为该订单的实际金额（即商户订单创建时的金额），并执行商户的业务程序
                //请务必判断请求时的total_fee、seller_id与通知时获取的total_fee、seller_id为一致的
                //如果有做过处理，不执行商户的业务程序
            	//System.out.println("aaaa");
                //注意：
                //如果签约的是可退款协议，退款日期超过可退款期限后（如三个月可退款），支付宝系统发送该交易状态通知
                //如果没有签约可退款协议，那么付款完成后，支付宝系统发送该交易状态通知。
            } else if (tradeStatus.equals("TRADE_SUCCESS")) {
                //判断该笔订单是否在商户网站中已经做过处理
                //如果没有做过处理，根据订单号（out_trade_no）在商户网站的订单系统中查到该笔订单的详细，
                // 并判断total_amount是否确实为该订单的实际金额（即商户订单创建时的金额），并执行商户的业务程序
                //请务必判断请求时的total_fee、seller_id与通知时获取的total_fee、seller_id为一致的
                //如果有做过处理，不执行商户的业务程序
            	//System.out.println("bbbb");
                //注意：
                //如果签约的是可退款协议，那么付款完成后，支付宝系统发送该交易状态通知。

            }
            return "success";
        }
        return "fail";	
    }
    /**查看用户订单*/
    @RequestMapping("showOrder.do")
    public ModelAndView showOrder(ModelAndView mv,HttpSession session,HttpServletRequest request) {
    	
    	User user=(User) session.getAttribute("user");
    	if(user!=null) {
    		//全部订单
        	List<User_Order> orderList=user_OrderService.showOrder(user.getU_id());
        	mv.addObject("orderList", orderList);
        	//待支付
        	List<User_Order> orderListPayStatus=user_OrderService.showOrderPayStatus(user.getU_id());
        	if (orderListPayStatus!=null) {
        		mv.addObject("orderListPayStatus", orderListPayStatus);
    		}
        	//待发货
        	List<User_Order> orderListOrderStatus0=user_OrderService.showOrderOrderStatus0(user.getU_id());
        	if (orderListOrderStatus0!=null) {
        		mv.addObject("orderListOrderStatus0", orderListOrderStatus0);
    		}
        	//待收货
        	List<User_Order> orderListOrderStatus1=user_OrderService.showOrderOrderStatus1(user.getU_id());
        	if (orderListOrderStatus1!=null) {
        		mv.addObject("orderListOrderStatus1", orderListOrderStatus1);
    		}
        	String ua =request.getHeader("User-Agent");
        	//判断是移动端还是PC端
        	if(isPcInAndroid.checkAgentIsMobile(ua)){
        		//来自移动端访问
        		mv.setViewName("userAn/wholeOrder.html");
        	}else {
        		//来自PC端访问
        		mv.setViewName("userPC/myOrder.html");
        	}
    	}else {
    		String ua =request.getHeader("User-Agent");
        	//判断是移动端还是PC端
        	if(isPcInAndroid.checkAgentIsMobile(ua)){
        		//来自移动端访问
        		mv.setViewName("redirect:/userAn/login.html");
        	}else {
        		//来自PC端访问
        		mv.setViewName("redirect:/userPC/login.html");
        	}
    	}
    	
    	return mv;
    }
}
