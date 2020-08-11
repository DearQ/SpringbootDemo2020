package com.t05g1.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.t05g1.dao.OrderDao;
import com.t05g1.pojo.Order;
import com.t05g1.pojo.OrderExample;
import com.t05g1.service.OrderService;

@Service
public class OrderServiceImpl implements OrderService {
	
	@Autowired
	private OrderDao orderDao;

	@Override
	public int deleteByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return orderDao.deleteByPrimaryKey(id);
	}

	@Override
	public int insert(Order record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insertSelective(Order record) {
		// TODO Auto-generated method stub
		return orderDao.insertSelective(record);
	}

	@Override
	public List<Order> selectByExample() {
		// TODO Auto-generated method stub
		OrderExample example = new OrderExample();
	    example.setOrderByClause("id desc");		
		return orderDao.selectByExample(example);
	}

	@Override
	public Order selectByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int updateByPrimaryKeySelective(Order record) {
		// TODO Auto-generated method stub
		return orderDao.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(Order record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Order> queryAllDataFromTable(int curr, int limit, String orderNumber, int orderStatus,
			int payStatus, int payMode) {
		// TODO Auto-generated method stub
		curr=(curr-1)*limit;
		return orderDao.queryAllDataFromTable(curr, limit, orderNumber, orderStatus, payStatus, payMode);
	}

	@Override
	public int queryAllCount(String orderNumber, int orderStatus, int payStatus, int payMode) {
		// TODO Auto-generated method stub
		return orderDao.queryAllCount(orderNumber, orderStatus, payStatus, payMode);
	}

	@Override
	public int insertSelective(String orderNumber, String productName, String consignee, String money, Integer amount,
			Integer buyerId, Integer payMode, Integer distrMode, String shopAddress, String phone) {
		// TODO Auto-generated method stub
		return orderDao.insertSelective(orderNumber, productName, consignee, money, amount, buyerId, payMode, distrMode, shopAddress, phone);
	}

	@Override
	public int sumMoney() {
		// TODO Auto-generated method stub
		return orderDao.sumMoney();
	}
	
	

}
