package com.t05g1.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.t05g1.dao.CategoryDao;
import com.t05g1.pojo.Category;
import com.t05g1.service.CategoryService;

@Service
public class CategoryServiceImpl implements CategoryService{

	@Autowired
	private CategoryDao categoryDao;
	
	@Override
	public List<Category> selectByExample() {
		
		return categoryDao.selectByExample();
	}

	@Override
	public List<Category> queryAllDataFromTable(int curr, int limit, String name) {
		// TODO Auto-generated method stub
		curr=(curr-1)*limit;
		return categoryDao.queryAllDataFromTable(curr, limit, name);
	}

	@Override
	public int queryAllCount(String name) {
		// TODO Auto-generated method stub
		return categoryDao.queryAllCount(name);
	}

	@Override
	public int deleteByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return categoryDao.deleteByPrimaryKey(id);
	}

	@Override
	public int insert(Category record) {
		// TODO Auto-generated method stub
		return categoryDao.insert(record);
	}

	@Override
	public int insertSelective(Category record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Category selectByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int updateByPrimaryKeySelective(Category record) {
		// TODO Auto-generated method stub
		return categoryDao.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(Category record) {
		// TODO Auto-generated method stub
		return 0;
	}

}
