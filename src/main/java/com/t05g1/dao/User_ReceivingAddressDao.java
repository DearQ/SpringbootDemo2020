package com.t05g1.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.t05g1.pojo.User_ReceivingAddress;

public interface User_ReceivingAddressDao {

	List<User_ReceivingAddress> showReceivingAddressByuid(Long u_id);

	int addReceivingAddress(@Param("rAddress")User_ReceivingAddress rAddress);

	User_ReceivingAddress ReceivingAddressByidInfo(int raid);

	int updateReceivingAddress(@Param("rAddress")User_ReceivingAddress rAddress);

	int delReceivingAddress(int raid);

}
