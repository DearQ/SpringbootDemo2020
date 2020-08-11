package com.t05g1.service;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.t05g1.pojo.Commodity;
import com.t05g1.pojo.Order;

public interface OrderService {
	
	int deleteByPrimaryKey(Integer id);

    int insert(Order record);

    int insertSelective(Order record);

    List<Order> selectByExample();

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
    List<Order> queryAllDataFromTable(int curr, int limit,String orderNumber ,int orderStatus,int payStatus,int payMode);
    /**
     * 统计订单总数
     * @param 
     * @return
     */
    int queryAllCount(String orderNumber ,int orderStatus,int payStatus,int payMode);
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
    int insertSelective(String orderNumber,String productName,String consignee,String money,Integer amount,Integer buyerId,Integer payMode,Integer distrMode,String shopAddress,String phone); 
    /**
     * 统计订单金额
     * @return
     */
    int sumMoney();

}
