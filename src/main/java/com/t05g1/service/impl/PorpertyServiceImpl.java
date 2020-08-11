package com.t05g1.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.t05g1.dao.PropertyDao;
import com.t05g1.pojo.Property;
import com.t05g1.pojo.PropertyExample;
import com.t05g1.service.PropertyService;

@Service
public class PorpertyServiceImpl implements PropertyService{

	@Autowired
	private PropertyDao propertyDao;
	
	
	@Override
	public int deleteByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return propertyDao.deleteByPrimaryKey(id);
	}

	@Override
	public int insert(Property record) {
		// TODO Auto-generated method stub
		return propertyDao.insert(record);
	}

	@Override
	public int insertSelective(Property record) {
		// TODO Auto-generated method stub
		return propertyDao.insertSelective(record);
	}

	@Override
	public List<Property> selectByExample(Integer cid) {
		// TODO Auto-generated method stub
		 PropertyExample example =new PropertyExample();
	     example.createCriteria().andCidEqualTo(cid);
	     example.setOrderByClause("id desc");
	     
		return propertyDao.selectByExample(example);
	}

	@Override
	public Property selectByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return propertyDao.selectByPrimaryKey(id);
	}

	@Override
	public int updateByPrimaryKeySelective(Property record) {
		// TODO Auto-generated method stub
		return propertyDao.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(Property record) {
		// TODO Auto-generated method stub
		return propertyDao.updateByPrimaryKey(record);
	}

	@Override
	public List<Property> queryAllDataFromTable(int curr, int limit, int cid) {
		// TODO Auto-generated method stub
		curr=(curr-1)*limit;
		return propertyDao.queryAllDataFromTable(curr, limit, cid);
	}

	@Override
	public int queryAllCount(int cid) {
		// TODO Auto-generated method stub
		return propertyDao.queryAllCount(cid);
	}
	
	//测试属性
	  @Override
	    public void update(Property p) {
	        propertyDao.updateByPrimaryKeySelective(p);
	    }

	    @Override
	    public Property get(int id) {
	        return propertyDao.selectByPrimaryKey(id);
	    }

	    @Override
	    public List list(int cid) {
	        PropertyExample example =new PropertyExample();
	        example.createCriteria().andCidEqualTo(cid);
	        example.setOrderByClause("id desc");
	        return propertyDao.selectByExample(example);
	    }


}
