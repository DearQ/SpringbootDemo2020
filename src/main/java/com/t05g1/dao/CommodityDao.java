package com.t05g1.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.t05g1.pojo.Commodity;

public interface CommodityDao {
	/**
	 * 查看商品列表
	 * @return
	 */
	List<Commodity> findAllcommodityList();
	/**
	 * 查看商品列表带分页
	 * @param curr
	 * @param limit
	 * @return
	 */
	List<Commodity> findAllcommodityListPage(@Param("c_name")String c_name, @Param("c_categoryId")int c_categoryId,@Param("c_brandId")int c_brandId);
     /**
      * 查看商品总数
      * @return
      */
    int commodityAllCountxx();
    /**
     * 查看商品列表带分页
     * @param page
     * @param limit
     * @param keyWord
     * @return
     */
    List<Commodity> queryAllDataFromTable(@Param("curr") int curr, @Param("limit") int limit, @Param("c_name") String c_name, @Param("c_categoryId")int c_categoryId,@Param("c_brandId")int c_brandId);
    /**
     * 统计商品总数
     * @param keyWord
     * @return
     */
    int queryAllCount(@Param("c_name") String c_name, @Param("c_categoryId")int c_categoryId);
    /***
     * 添加商品
     * @param commodity
     * @return
     */
    int addProduct(Commodity commodity);
    /***
     * 按ID删除商品
     * @param id
     * @return
     */
    int deleteProductById(Integer c_id);
    /***
     * 批量删除商品
     * @param c_id
     * @return
     */
    int deleteProductsById(String c_ids);
    /***
     * 改变商品状态
     * @param c_state
     * @return
     */
    int isState(Integer c_id,String c_state);
    /***
     * 查看商品详情
     * @return
     */
    Commodity selectProductDetail(Integer c_id);
    /***
     * 修改商品
     * @param commodity
     * @return
     */
    int updateProduct(Commodity commodity);
    /**
     * 获取id
     * @param name
     * @return
     */
    Commodity selectId(String name); 
}
