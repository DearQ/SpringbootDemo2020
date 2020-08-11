package com.t05g1.dao;

import com.t05g1.pojo.Commodity;
import com.t05g1.pojo.Order;
import com.t05g1.pojo.OrderExample;
import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface OrderDao {
	
    int deleteByPrimaryKey(Integer id);

    int insert(Order record);

    int insertSelective(Order record);

    List<Order> selectByExample(OrderExample example);

    Order selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Order record);

    int updateByPrimaryKey(Order record);    
    /**
     * 查看订单列表
     * @param curr
     * @param limit
     * @param orderNumber
     * @param orderStatus
     * @param payStatus
     * @param payMode
     * @return
     */  
    List<Order> queryAllDataFromTable(@Param("curr")int curr, @Param("limit")int limit, @Param("orderNumber") String orderNumber , @Param("orderStatus")int orderStatus,@Param("payStatus")int payStatus,@Param("payMode")int payMode);
    /**
     * 统计订单总数
     * @param 
     * @return
     */
    int queryAllCount(@Param("orderNumber") String orderNumber , @Param("orderStatus")int orderStatus,@Param("payStatus")int payStatus,@Param("payMode")int payMode);
    /**
     * 添加订单
     * @param orderNumber
     * @param productName
     * @param consignee
     * @param money
     * @param amount
     * @param buyerId
     * @param payMode
     * @param distrMode
     * @param shopAddress
     * @param phone
     * @return
     */
    int insertSelective(@Param("orderNumber")String orderNumber,@Param("productName")String productName,@Param("consignee")String consignee,@Param("money")String money,@Param("amount")Integer amount
    		,@Param("buyerId")Integer buyerId,@Param("payMode")Integer payMode,@Param("distrMode")Integer distrMode,@Param("shopAddress")String shopAddress,@Param("phone")String phone);
    /**
     * 统计订单金额
     * @return
     */
    int sumMoney();
    
}