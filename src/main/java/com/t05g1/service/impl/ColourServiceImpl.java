package com.t05g1.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.t05g1.dao.ColourDao;
import com.t05g1.pojo.Colour;
import com.t05g1.service.ColourService;
@Service
public class ColourServiceImpl implements ColourService {
	
	@Autowired
	private ColourDao colourDao;

	@Override
	public int deleteByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insert(Colour record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insertSelective(Colour record) {
		// TODO Auto-generated method stub
		return colourDao.insertSelective(record);
	}

	@Override
	public List<Colour> selectByExample() {
		// TODO Auto-generated method stub
		return colourDao.selectByExample();
	}

	@Override
	public Colour selectByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return colourDao.selectByPrimaryKey(id);
	}

	@Override
	public int updateByPrimaryKeySelective(Colour record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByPrimaryKey(Colour record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Colour> selectColorById(Integer commoId) {
		// TODO Auto-generated method stub
		return colourDao.selectColorById(commoId);
	}

	@Override
	public List<Colour> selectByExampleByid(Integer id) {
		// TODO Auto-generated method stub
		return colourDao.selectColorById(id);
	}

}
