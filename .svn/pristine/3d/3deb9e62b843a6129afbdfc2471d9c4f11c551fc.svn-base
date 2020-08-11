package com.t05g1.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.t05g1.pojo.User_Order;

public interface User_OrderDao {

	int addUserOrder(@Param("orderNumber")String orderNumber, @Param("productName")String productName, 
			@Param("consignee")String consignee, @Param("money")String money, 
			@Param("amount")Integer amount,@Param("uid")Long u_id,
			@Param("shopAddress")String shopAddress, @Param("phone")String phone);

	int orderInfoId(String orderNumber);

	int updateShooopcOid(@Param("str")String str, @Param("oid")int oid);

	List<User_Order> showOrder(Long u_id);

	int updateOrderPayStatus(String out_trade_no);

	List<User_Order> showOrderPayStatus(Long u_id);

	List<User_Order> showOrderOrderStatus0(Long u_id);

	List<User_Order> showOrderOrderStatus1(Long u_id);


}
