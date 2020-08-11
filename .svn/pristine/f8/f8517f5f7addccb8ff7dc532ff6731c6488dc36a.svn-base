package com.t05g1.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.t05g1.dao.User_OrderDao;
import com.t05g1.pojo.User_Order;
import com.t05g1.service.User_OrderService;

@Service
public class User_OrderServiceImpl implements User_OrderService {
	
	@Autowired
	private User_OrderDao orderDao;
	
	//新增订单记录
	@Override
	public int addUserOrder(String orderNumber, String productName, String consignee, String money, Integer amount,
			Long u_id, String shopAddress, String phone) {
		// TODO Auto-generated method stub
		return orderDao.addUserOrder(orderNumber,productName,consignee,money,amount,u_id,shopAddress,phone);
	}
	//查询最新订单id
	@Override
	public int orderInfoId(String orderNumber) {
		// TODO Auto-generated method stub
		return orderDao.orderInfoId(orderNumber);
	}
	//为订单加入商品
	@Override
	public int updateShooopcOid(String str, int oid) {
		// TODO Auto-generated method stub
		return orderDao.updateShooopcOid(str, oid);
	}
	//订单支付成功
	@Override
	public int updateOrderPayStatus(String out_trade_no) {
		// TODO Auto-generated method stub
		return orderDao.updateOrderPayStatus(out_trade_no);
	}
	//查看用户所有订单
	public List<User_Order> showOrder(Long u_id) {
		// TODO Auto-generated method stub
		return orderDao.showOrder(u_id);
	}
	//查看用户未支付订单
	@Override
	public List<User_Order> showOrderPayStatus(Long u_id) {
		// TODO Auto-generated method stub
		return orderDao.showOrderPayStatus(u_id);
	}
	//查看用户未发货订单
	@Override
	public List<User_Order> showOrderOrderStatus0(Long u_id) {
		// TODO Auto-generated method stub
		return orderDao.showOrderOrderStatus0(u_id);
	}
	//查看用户未收货订单
	@Override
	public List<User_Order> showOrderOrderStatus1(Long u_id) {
		// TODO Auto-generated method stub
		return orderDao.showOrderOrderStatus1(u_id);
	}

}
