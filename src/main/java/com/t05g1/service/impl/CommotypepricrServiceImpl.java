package com.t05g1.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.t05g1.dao.CommtypepricrDao;
import com.t05g1.pojo.Commtypepricr;
import com.t05g1.service.CommotypepricrService;
@Service
public class CommotypepricrServiceImpl implements CommotypepricrService {
	
	@Autowired
	private CommtypepricrDao commotypepricrDao;

	@Override
	public int deleteByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insert(Commtypepricr record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insertSelective(Commtypepricr record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Commtypepricr> selectByExample() {
		// TODO Auto-generated method stub
		return commotypepricrDao.selectByExample();
	}

	@Override
	public Commtypepricr selectByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int updateByPrimaryKeySelective(Commtypepricr record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByPrimaryKey(Commtypepricr record) {
		// TODO Auto-generated method stub
		return 0;
	}

}
