package com.t05g1.service;

import java.util.List;


import com.t05g1.pojo.Brand;
import com.t05g1.pojo.Property;

public interface PropertyService {
	
	    int deleteByPrimaryKey(Integer id);

	    int insert(Property record);

	    int insertSelective(Property record);

	    List<Property> selectByExample(Integer cid);
	    
	    
	    /**
	     * 查看商品列表带分页
	     * @param page
	     * @param limit
	     * @param keyWord
	     * @return
	     */
	    List<Property> queryAllDataFromTable(int curr,int limit,int cid);
	    /**
	     * 统计商品总数
	     * @param keyWord
	     * @return
	     */
	    int queryAllCount(int cid);

	    Property selectByPrimaryKey(Integer id);

	    int updateByPrimaryKeySelective(Property record);

	    int updateByPrimaryKey(Property record);
	    
	    
	    
	    //测试属性
	    
	    void update(Property c);
	    Property get(int id);
	    List list(int cid);

}
