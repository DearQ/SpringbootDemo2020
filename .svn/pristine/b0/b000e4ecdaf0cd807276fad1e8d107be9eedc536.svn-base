package com.t05g1.service;

import java.util.List;

import com.t05g1.pojo.User_Order;

public interface User_OrderService {

	int addUserOrder(String orderNumber, String productName, String consignee, String money, Integer amount, Long u_id,
			String shopAddress, String phone);

	int orderInfoId(String orderNumber);

	int updateShooopcOid(String str, int oid);
	
	int updateOrderPayStatus(String out_trade_no);

	List<User_Order> showOrder(Long u_id);

	List<User_Order> showOrderPayStatus(Long u_id);

	List<User_Order> showOrderOrderStatus0(Long u_id);

	List<User_Order> showOrderOrderStatus1(Long u_id);

	

}
