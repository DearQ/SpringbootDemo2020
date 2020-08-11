package com.t05g1.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.t05g1.dao.DeliveryDao;
import com.t05g1.pojo.Delivery;
import com.t05g1.pojo.DeliveryExample;
import com.t05g1.service.DeliveryService;

@Service
public class DeliveryServiceImpl implements DeliveryService {
	
	@Autowired
	private DeliveryDao deliveryDao;

	@Override
	public int deleteByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insert(Delivery record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insertSelective(Delivery record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Delivery> selectByExample() {
		// TODO Auto-generated method stub
		DeliveryExample example = new DeliveryExample();
		example.setOrderByClause("id desc");
		return deliveryDao.selectByExample(example);
	}

	@Override
	public Delivery selectByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int updateByPrimaryKeySelective(Delivery record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByPrimaryKey(Delivery record) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	

}
