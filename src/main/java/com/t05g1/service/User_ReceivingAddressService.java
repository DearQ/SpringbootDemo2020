package com.t05g1.service;

import java.util.List;

import com.t05g1.pojo.User_ReceivingAddress;

public interface User_ReceivingAddressService {

	List<User_ReceivingAddress> showReceivingAddressByuid(Long u_id);

	int addReceivingAddress(User_ReceivingAddress rAddress);

	User_ReceivingAddress ReceivingAddressByidInfo(int raid);

	int updateReceivingAddress(User_ReceivingAddress rAddress);

	int delReceivingAddress(int raid);

}
