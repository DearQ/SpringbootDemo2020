package com.t05g1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.t05g1.pojo.User_Commtypepricr;
import com.t05g1.service.User_CommtypepricrService;

@Controller
public class User_CommtypepricrController {
	
	
	@Autowired
	private User_CommtypepricrService user_CommtypepricrService;
	/**
	 * 按版本id查询价格
	 * @param typeId  版本id
	 * @return  返回对应价格
	 */
	@ResponseBody
	@RequestMapping("CommtypepricrByprive.do")
	private double CommtypepricrByprive(Integer typeId) {
		User_Commtypepricr cotypr=user_CommtypepricrService.CommtypepricrByprive(typeId);
		return cotypr.getPrice();
	}
}
