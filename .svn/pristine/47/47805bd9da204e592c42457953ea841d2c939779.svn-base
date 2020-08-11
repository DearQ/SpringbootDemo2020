package com.t05g1.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.t05g1.pojo.User;
import com.t05g1.pojo.User_ReceivingAddress;
import com.t05g1.pojo.User_Shoopc;
import com.t05g1.service.User_ReceivingAddressService;
import com.t05g1.service.User_ShoopcService;
import com.t05g1.util.isPcInAndroid;

@Controller
public class User_ShoopcController {

	@Autowired
	private User_ShoopcService user_ShoopcService;
	@Autowired
	private User_ReceivingAddressService user_ReceivingAddressService;
	
	/**
	 * 用户加入购物车
	 * @param name 商品名称
	 * @param price  商品价格
	 * @param img  商品图
	 * @param cid  商品id
	 * @param colour 商品颜色
	 * @param edition 商品版本
	 * @param amount 商品数量
	 * @param session  用户信息
	 * @return  uidNo-用户未登录  ok-加入购物车成功  no--加入失败
	 */
	@ResponseBody
	@RequestMapping("addShoopc.do")
	public String addShoopc(String name,double price,
			@RequestParam(value="img",required=false)String img,
			int cid,
			@RequestParam(value="colour",required=false)String colour,
			String edition,
			int amount,
			HttpSession session) {
		String imgSB=img.substring(25);
		User user=(User) session.getAttribute("user");
		//System.out.println(name+price+imgSB+cid+colour+edition+amount);
		if (user==null) {
			return "uidNo";
		}else {
			int count=user_ShoopcService.showShoopc(colour,edition,cid,user.getU_id());
			if(count>0) {
				int ret=user_ShoopcService.addAmountShoopc(colour,edition,amount,cid,user.getU_id());
				if(ret>0) {
					return "ok";
				}else {
					return "no";
				}
			}else {
				int ret=user_ShoopcService.addShoopc(name,price,imgSB,cid,colour,edition,amount,user.getU_id());
				
				if(ret>0) {
					return "ok";
				}else {
					return "no";
				}
			}
			
			
		}
		
	}
	/**
	 * 用户查看购物车
	 * @param mv  商品信息 
	 * @param session 用户信息
	 * @return 商品信息
	 */
	@RequestMapping("userIdByShoopcInfo.do")
	public ModelAndView userIdByShoopcInfo(ModelAndView mv,HttpSession session,HttpServletRequest request) {
		//判断用户是否登录
		User user=(User) session.getAttribute("user");
		//判断是移动端还是PC端
		String ua =request.getHeader("User-Agent");
		if(isPcInAndroid.checkAgentIsMobile(ua)){
			//来自移动端访问

			if (user!=null) {
				List<User_Shoopc>  shoopcList=user_ShoopcService.userIdByShoopcInfo(user.getU_id());
				mv.addObject("shoopcList", shoopcList);
				mv.addObject("shoopcListL", shoopcList.size());
				mv.setViewName("userAn/shoppingCar.html");
			}else {
				mv.addObject("shoopcListL", 0);
				mv.setViewName("userAn/shoppingCar.html");
			}
		}else {
			//来自PC端访问
			
			if (user!=null) {
				List<User_Shoopc> shoopcList=user_ShoopcService.userIdByShoopcInfo(user.getU_id());
				mv.addObject("shoopcList", shoopcList);
				mv.setViewName("userPC/shopping.html");
			}else {
				mv.setViewName("userPC/shopping.html");
			}
		}
		
		
		return mv;
	}
	//增加数量
	@ResponseBody
	@RequestMapping("addAmount.do")
	public String addAmount(Integer sid) {
		int ret = user_ShoopcService.addAmount(sid);
		//System.out.println(sid);
		return "ok";
	}
	//减少数量
	@ResponseBody
	@RequestMapping("minusAmount.do")
	public String minusAmount(Integer sid) {
		int ret = user_ShoopcService.minusAmount(sid);
		//System.out.println(sid);
		return "ok";
	}
	/**
	 * 删除购物车商品
	 * @param sid  商品id
	 * @param mv
	 * @return
	 */
	@RequestMapping("selShoopc.do")
	public ModelAndView selShoopc(Integer sid,ModelAndView mv) {
		
		int ret=user_ShoopcService.selShoopc(sid);
		mv.addObject("ret", ret);
		mv.setViewName("redirect:/userIdByShoopcInfo.do");
		return mv;
	}
	/**
	 * PC用户选择商品结算--显示用户结算商品
	 * @param str  购物车商品 id
	 * @return
	 */
	@ResponseBody
	@RequestMapping("showShoopcById.do")
	public List<User_Shoopc> showShoopcById(String str){
		
		//System.out.println(str);
		return user_ShoopcService.showShoopcById(str);
		
		
	}
	/**
	 * 查看结算用户所有收货地址
	 * @param session  用户信息
	 * @return 地址信息
	 */
	@ResponseBody
	@RequestMapping("showReceivingAddressByuid.do")
	public List<User_ReceivingAddress> showReceivingAddressByuid(HttpSession session){
		User user=(User) session.getAttribute("user");
		//System.out.println("uid="+user.getU_id());
		//List<User_ReceivingAddress> ralist= user_ReceivingAddressService.showReceivingAddressByuid(user.getU_id());
		return user_ReceivingAddressService.showReceivingAddressByuid(user.getU_id());
	}
	/**
	 * 用户添加收货地址
	 * @param session 用户信息
	 * @return  添加状态
	 */
	@ResponseBody
	@RequestMapping("addReceivingAddress.do")
	public String addReceivingAddress(User_ReceivingAddress rAddress,HttpSession session) {
		
		User user=(User) session.getAttribute("user");
		rAddress.setUid(user.getU_id());
		int ret=user_ReceivingAddressService.addReceivingAddress(rAddress);
		if(ret>0) {
			return "ok";
		}else {
			return "no";
		}
	}
	/**
	 * 查看结算用户要修改收货地址
	 * @param raid 地址id
	 * @return 地址信息
	 */
	@ResponseBody
	@RequestMapping("ReceivingAddressByidInfo.do")
	public User_ReceivingAddress ReceivingAddressByidInfo(int raid) {
		User_ReceivingAddress ura=user_ReceivingAddressService.ReceivingAddressByidInfo(raid);
		return ura;
	}
	/**
	 * 用户修改收货地址
	 * @return  添加状态
	 */
	@ResponseBody
	@RequestMapping("updateReceivingAddress.do")
	public String updateReceivingAddress(User_ReceivingAddress rAddress) {
	
		int ret=user_ReceivingAddressService.updateReceivingAddress(rAddress);
		if(ret>0) {
			return "ok";
		}else {
			return "no";
		}
	}
	/**
	 * 删除收货地址
	 * @param raid 地址id
	 * @return 地址信息
	 */
	@ResponseBody
	@RequestMapping("delReceivingAddress.do")
	public String delReceivingAddress(int raid) {
		int ret=user_ReceivingAddressService.delReceivingAddress(raid);
		if(ret>0) {
			return "ok";
		}else {
			return "ok";
		}
	}
	
	
	/**
	 * An用户选择商品结算
	 * @param str  购物车商品 id
	 * @return
	 */
	@RequestMapping("showShoopcByIdAn.do")
	public ModelAndView showShoopcByIdAn(String str,String countPrice,ModelAndView mv,HttpSession session){
		//判断用户是否登录
		User user=(User) session.getAttribute("user");
		if(user!=null) {
			List<User_Shoopc> shoopcList=user_ShoopcService.showShoopcById(str);
			mv.addObject("shoopcList", shoopcList);
			mv.addObject("countPrice", countPrice);
			mv.addObject("amount", shoopcList.size());
			mv.addObject("str", str);
			mv.setViewName("userAn/myOrder.html");
		}else {
			mv.setViewName("redirect:/userAn/login.html");
		}
		
		return mv;
		
		
	}
	/**
	 * 用户添加收货地址
	 * @param session 用户信息
	 * @return  添加状态
	 */
	@ResponseBody
	@RequestMapping("addReceivingAddressAn.do")
	public ModelAndView addReceivingAddressAn(User_ReceivingAddress rAddress,HttpSession session,ModelAndView mv) {
		
		User user=(User) session.getAttribute("user");
		if(user!=null) {
			rAddress.setUid(user.getU_id());
			int ret=user_ReceivingAddressService.addReceivingAddress(rAddress);
			mv.setViewName("redirect:/showShoopcByIdAn.do");
		}else {
			mv.setViewName("redirect:/userAn/login.html");
		}
		
		return mv;

	}
	
	
}
