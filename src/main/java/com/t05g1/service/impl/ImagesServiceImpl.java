package com.t05g1.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.t05g1.dao.ImagesDao;
import com.t05g1.pojo.Images;
import com.t05g1.pojo.ImagesExample;
import com.t05g1.service.ImagesService;

@Service
public class ImagesServiceImpl implements ImagesService {
	
	@Autowired
	private ImagesDao imageDao;

	@Override
	public int deleteByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return imageDao.deleteByPrimaryKey(id);
	}

	@Override
	public int insert(Images record) {
		// TODO Auto-generated method stub
		return imageDao.insert(record);
	}

	@Override
	public int insertSelective(Images record) {
		// TODO Auto-generated method stub
		return imageDao.insertSelective(record);
	}

	@Override
	public List<Images> selectByExample(ImagesExample example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Images selectByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return imageDao.selectByPrimaryKey(id);
	}

	@Override
	public int updateByPrimaryKeySelective(Images record) {
		// TODO Auto-generated method stub
		return imageDao.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(Images record) {
		// TODO Auto-generated method stub
		return imageDao.updateByPrimaryKey(record);
	}

	@Override
	public List<Images> selectById(int curr, int limit, int commId) {
		// TODO Auto-generated method stub
		curr=(curr-1)*limit;
		return imageDao.selectById(curr, limit, commId);
	}

	@Override
	public int queryAllCount(int commId) {
		// TODO Auto-generated method stub
		return imageDao.queryAllCount(commId);
	}

	@Override
	public Integer insertByAll(Integer colourId, Integer commId, String uriDa, String uriZ, String uriX) {
		// TODO Auto-generated method stub
		System.out.println("jin");
		return imageDao.insertByAll(colourId, commId, uriDa, uriZ, uriX);
	}


}
