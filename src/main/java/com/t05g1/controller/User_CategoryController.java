package com.t05g1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.t05g1.pojo.User_Brand;
import com.t05g1.pojo.User_Category;
import com.t05g1.service.User_BrandService;
import com.t05g1.service.User_CategoryService;

@Controller
public class User_CategoryController {
	
	@Autowired
	private User_CategoryService user_CategoryService;
	@Autowired
	private User_BrandService user_BarndService;
	
	@RequestMapping("showCategory.do")
	public ModelAndView showCategory(ModelAndView mv) {
		List<User_Category> ucat=user_CategoryService.showCategory();
		//System.out.println(ucat.get(0).getUcomm().get(0).getC_uri());
		List<User_Brand> ubra=user_BarndService.showBrand();
		mv.addObject("ucat", ucat);
		mv.addObject("ubra", ubra);
		mv.setViewName("userAn/classify.html");
		return mv;
	}
}
