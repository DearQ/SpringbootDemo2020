package com.t05g1.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.t05g1.dao.User_CommodityDao;
import com.t05g1.pojo.Commodity;
import com.t05g1.pojo.User_Commodity;
import com.t05g1.service.User_CommodityService;

@Service
public class User_CommodityServiceImpl implements User_CommodityService {
	
	@Autowired
	private User_CommodityDao ucomDao;
	@Override
	public List<User_Commodity> showcommodity() {
		
		return ucomDao.showcommodity();
	}
	@Override
	public List<User_Commodity> showcommoditybySeckill() {
		// TODO Auto-generated method stub
		return ucomDao.showcommoditybySeckill();
	}
	//查询商品和分类品牌
	@Override
	public User_Commodity commodityByIdInfo(Integer cId) {
		// TODO Auto-generated method stub
		return ucomDao.commodityByIdInfo(cId);
	}
	//查询商品属性
	@Override
	public User_Commodity commodityByIdPropertyByValueInfo(Integer cId) {
		// TODO Auto-generated method stub
		return ucomDao.commodityByIdPropertyByValueInfo(cId);
	}
	@Override
	public User_Commodity commodityByIdPropertyByValueInfo1(Integer cId) {
		// TODO Auto-generated method stub
		return ucomDao.commodityByIdPropertyByValueInfo1(cId);
	}
	@Override
	public User_Commodity commodityByIdPropertyByValueInfo2(Integer cId) {
		// TODO Auto-generated method stub
		return ucomDao.commodityByIdPropertyByValueInfo2(cId);
	}
	@Override
	public User_Commodity commodityByIdPropertyByValueInfo3(Integer cId) {
		// TODO Auto-generated method stub
		return ucomDao.commodityByIdPropertyByValueInfo3(cId);
	}
	
	@Override
	public List<Commodity> selCommodityByName(String c_name) {
		// TODO Auto-generated method stub
		return ucomDao.selCommodityByName(c_name);
	}
	
	

}
