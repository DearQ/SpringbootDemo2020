package com.t05g1.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.t05g1.pojo.Category;

public interface CategoryService {
	   /***
	    * 查看分类列表
	    * @return
	    */
	   List<Category> selectByExample();
	
	   /**
	    * 查看商品分类带分页
	    * @param page
	    * @param limit
	    * @param keyWord
	    * @return
	    */
	   List<Category> queryAllDataFromTable(int curr, int limit, String name);
	   /**
	    * 统计商品分类总数
	    * @param keyWord
	    * @return
	    */
	   int queryAllCount(String name);
		/***
		 * 删除
		 * @param id
		 * @return
		 */
	   int deleteByPrimaryKey(Integer id);
        /***
         * 添加
         * @param record
         * @return
         */
	    int insert(Category record);

	    int insertSelective(Category record);

	    Category selectByPrimaryKey(Integer id);
        /***
         * 修改商品类型
         * @param record
         * @return
         */
	    int updateByPrimaryKeySelective(Category record);

	    int updateByPrimaryKey(Category record);

}
