package com.t05g1.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.t05g1.dao.User_ShoopcDao;
import com.t05g1.pojo.User_Shoopc;
import com.t05g1.service.User_ShoopcService;

@Service
public class User_ShoopcServiceImpl implements User_ShoopcService {

	@Autowired
	private User_ShoopcDao shoopcDao;
	//查询购物车是否有重复商品
	@Override
	public int showShoopc(String colour, String edition, int cid, Long u_id) {
		// TODO Auto-generated method stub
		return shoopcDao.showShoopc(colour,edition,cid,u_id);
	}
	@Override
	public int addAmountShoopc(String colour, String edition, int amount, int cid, Long u_id) {
		// TODO Auto-generated method stub
		return shoopcDao.addAmountShoopc(colour,edition,amount,cid,u_id);
	}
	//添加商品到购物车
	@Override
	public int addShoopc(String name, double price, String imgSB, int cid, String colour, String edition, int amount,
			Long u_id) {
		// TODO Auto-generated method stub
		return shoopcDao.addShoopc(name, price, imgSB, cid, colour, edition, amount, u_id);
	}
	//用户查看购物车
	@Override
	public List<User_Shoopc> userIdByShoopcInfo(Long u_id) {
		// TODO Auto-generated method stub
		return shoopcDao.userIdByShoopcInfo(u_id);
	}
	//用户选择购物车商品结算
	@Override
	public List<User_Shoopc> showShoopcById(String str) {
		// TODO Auto-generated method stub
		return shoopcDao.showShoopcById(str);
	}
	
	//增加数量
	@Override
	public int addAmount(Integer sid) {
		// TODO Auto-generated method stub
		return shoopcDao.addAmount(sid);
	}
	
	//减少数量
	@Override
	public int minusAmount(Integer sid) {
		// TODO Auto-generated method stub
		return shoopcDao.minusAmount(sid);
	}
	@Override
	public int selShoopc(Integer sid) {
		// TODO Auto-generated method stub
		return shoopcDao.selShoopc(sid);
	}
	//统计用户购物车数量
	@Override
	public int countUserShoopc(Long u_id) {
		// TODO Auto-generated method stub
		return shoopcDao.countUserShoopc(u_id);
	}
	

}
