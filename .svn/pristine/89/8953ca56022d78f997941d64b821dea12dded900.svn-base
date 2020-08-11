package com.t05g1.dao;

import com.t05g1.pojo.Commodity;
import com.t05g1.pojo.Property;
import com.t05g1.pojo.PropertyExample;
import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface PropertyDao {
	
    int deleteByPrimaryKey(Integer id);

    int insert(Property record);

    int insertSelective(Property record);

    List<Property> selectByExample(PropertyExample example);
    
    /**
     * 查看商品列表带分页
     * @param page
     * @param limit
     * @param keyWord
     * @return
     */
    List<Property> queryAllDataFromTable(@Param("curr") int curr, @Param("limit") int limit, @Param("cid")int cid);
    /**
     * 统计商品总数
     * @param keyWord
     * @return
     */
    int queryAllCount( @Param("cid")int cid);

    Property selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Property record);

    int updateByPrimaryKey(Property record);
}