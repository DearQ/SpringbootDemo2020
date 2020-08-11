package com.t05g1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.t05g1.pojo.User_Commodity;
import com.t05g1.service.User_CommodityService;

@Controller
public class CommodityController {
	
	
	@Autowired
	private User_CommodityService user_CommodityService;
	
	@RequestMapping("showcommodity.do")
	public ModelAndView showcommodity(ModelAndView mv) {
		List<User_Commodity> ucomList=user_CommodityService.showcommodity();
		mv.addObject("ucomList", ucomList);
		mv.setViewName("userAn/index.html");
		return mv;
	}
}
