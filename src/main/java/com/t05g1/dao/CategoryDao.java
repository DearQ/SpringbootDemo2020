package com.t05g1.dao;

import com.t05g1.pojo.Category;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface CategoryDao {
	
	/**
     * 查看商品类型列表带分页
     * @param page
     * @param limit
     * @param keyWord
     * @return
     */
    List<Category> queryAllDataFromTable(@Param("curr") int curr, @Param("limit") int limit, @Param("name") String name);
    /**
     * 统计商品分类总数
     * @param keyWord
     * @return
     */
    int queryAllCount(@Param("name") String name);
	
    int deleteByPrimaryKey(Integer id);

    int insert(Category record);

    int insertSelective(Category record);

    List<Category> selectByExample();

    Category selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Category record);

    int updateByPrimaryKey(Category record);
}