package com.t05g1.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.t05g1.dao.User_ReceivingAddressDao;
import com.t05g1.pojo.User_ReceivingAddress;
import com.t05g1.service.User_ReceivingAddressService;

@Service
public class User_ReceivingAddressServiceImpl implements User_ReceivingAddressService {
	
	@Autowired
	private User_ReceivingAddressDao receivingAddressDao;
	
	//查看结算用户所有收货地址
	@Override
	public List<User_ReceivingAddress> showReceivingAddressByuid(Long u_id) {
		// TODO Auto-generated method stub
		return receivingAddressDao.showReceivingAddressByuid(u_id);
	}
	//用户添加收货地址
	@Override
	public int addReceivingAddress(User_ReceivingAddress rAddress) {
		// TODO Auto-generated method stub
		return receivingAddressDao.addReceivingAddress(rAddress);
	}
	//查看结算用户要修改收货地址
	@Override
	public User_ReceivingAddress ReceivingAddressByidInfo(int raid) {
		// TODO Auto-generated method stub
		return receivingAddressDao.ReceivingAddressByidInfo(raid);
	}
	
	//修改收货地址
	@Override
	public int updateReceivingAddress(User_ReceivingAddress rAddress) {
		// TODO Auto-generated method stub
		return receivingAddressDao.updateReceivingAddress(rAddress);
	}
	
	//删除收货地址
	@Override
	public int delReceivingAddress(int raid) {
		// TODO Auto-generated method stub
		return receivingAddressDao.delReceivingAddress(raid);
	}

}
