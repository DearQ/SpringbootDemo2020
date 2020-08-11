package com.t05g1.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.t05g1.pojo.User;
import com.t05g1.pojo.User_Colour;
import com.t05g1.pojo.User_Commodity;
import com.t05g1.pojo.User_Commtypepricr;
import com.t05g1.pojo.User_Images;
import com.t05g1.service.User_ColourService;
import com.t05g1.service.User_CommodityService;
import com.t05g1.service.User_CommtypepricrService;
import com.t05g1.service.User_ImagesService;
import com.t05g1.service.User_ShoopcService;

@Controller
public class User_ImagesController {

	
	@Autowired
	private User_ImagesService user_ImagesService;

	
	@ResponseBody
	@RequestMapping("showImagesByUri.do")
	public List<User_Images> showImagesByUri(Integer imgId,ModelAndView mv,Integer cId,HttpServletRequest request,HttpSession session){
		List<User_Images> imagesList=user_ImagesService.showImagesByUri(imgId);
		//定义图片路径
		for(int i=0;i<imagesList.size();i++) { 
			
			String uri="{gallery: 'gal1', smallimage: '"+imagesList.get(i).getUriDa()+"',largeimage: '"+imagesList.get(i).getUriZ()+"'}";
			imagesList.get(i).setUriDZ(uri);
			
		}
		//System.out.println(imagesList.get(0).getUriDZ());
		return imagesList;
		/*
		 * //取到用户信息 User user=(User) session.getAttribute("user");
		 * 
		 * //来自PC端访问 //查看商品基本信息 User_Commodity
		 * uscomm=user_CommodityService.commodityByIdInfo(cId);
		 * 
		 * List<User_Images> imagesList=user_ImagesService.showImagesByUri(imgId);
		 * //查看商品版本 List<User_Commtypepricr>
		 * CommtypepricrList=user_CommtypepricrService.showCommtypepricrCommId(cId);
		 * //查看商品颜色 List<User_Colour>
		 * colourList=user_ColourService.showColourBycommId(cId); //查看商品属性
		 * User_Commodity
		 * uscomms=user_CommodityService.commodityByIdPropertyByValueInfo(cId);
		 * User_Commodity
		 * uscomms1=user_CommodityService.commodityByIdPropertyByValueInfo1(cId);
		 * User_Commodity
		 * uscomms2=user_CommodityService.commodityByIdPropertyByValueInfo2(cId);
		 * User_Commodity
		 * uscomms3=user_CommodityService.commodityByIdPropertyByValueInfo3(cId);
		 * User_Images us=new User_Images(); //查看购物车数量 int
		 * conutShoopc=user_ShoopcService.countUserShoopc(user.getU_id()); //定义图片路径
		 * for(int i=0;i<imagesList.size();i++) {
		 * 
		 * String uri="{gallery: 'gal1', smallimage: '"+imagesList.get(i).getUriDa()
		 * +"',largeimage: '"+imagesList.get(i).getUriZ()+"'}";
		 * imagesList.get(i).setUriDZ(uri);
		 * 
		 * } //定义商品属性 for(int i=0;i<uscomms.getProperties().size();i++) {
		 * 
		 * String
		 * attribute=uscomms.getProperties().get(i).getName()+uscomms.getPropertyValues(
		 * ).get(i).getValue();
		 * uscomms.getPropertyValues().get(i).setNameValue(attribute);
		 * //System.out.println(uscomms.getPropertyValues().get(i).getNameValue());
		 * 
		 * } if(uscomms1!=null) { for(int i=0;i<uscomms1.getProperties().size();i++) {
		 * 
		 * String attribute=uscomms1.getProperties().get(i).getName()+uscomms1.
		 * getPropertyValues().get(i).getValue();
		 * uscomms1.getPropertyValues().get(i).setNameValue(attribute);
		 * //System.out.println(uscomms.getPropertyValues().get(i).getNameValue());
		 * 
		 * } mv.addObject("attribute1",uscomms1.getPropertyValues()); }
		 * if(uscomms2!=null) { for(int i=0;i<uscomms2.getProperties().size();i++) {
		 * 
		 * String attribute=uscomms2.getProperties().get(i).getName()+uscomms2.
		 * getPropertyValues().get(i).getValue();
		 * uscomms2.getPropertyValues().get(i).setNameValue(attribute);
		 * //System.out.println(uscomms.getPropertyValues().get(i).getNameValue());
		 * 
		 * } mv.addObject("attribute2",uscomms2.getPropertyValues()); }
		 * 
		 * if(uscomms3!=null) { for(int i=0;i<uscomms3.getProperties().size();i++) {
		 * 
		 * String attribute=uscomms3.getProperties().get(i).getName()+uscomms3.
		 * getPropertyValues().get(i).getValue();
		 * uscomms3.getPropertyValues().get(i).setNameValue(attribute);
		 * //System.out.println(uscomms.getPropertyValues().get(i).getNameValue());
		 * 
		 * } mv.addObject("attribute3",uscomms3.getPropertyValues()); }
		 * 
		 * //System.out.println(17/5); mv.addObject("uscomm", uscomm);
		 * mv.addObject("imagesList", imagesList); mv.addObject("CommtypepricrList",
		 * CommtypepricrList); mv.addObject("colourList", colourList);
		 * mv.addObject("attribute",uscomms.getPropertyValues());
		 * mv.addObject("conutShoopc", conutShoopc);
		 * 
		 * 
		 * mv.setViewName("userPC/goods.html");
		 * //System.out.println(imagesList.get(0).getUriDZ()); return mv;
		 */
	}
}
