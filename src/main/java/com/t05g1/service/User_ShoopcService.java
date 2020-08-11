package com.t05g1.service;

import java.util.List;

import com.t05g1.pojo.User_Shoopc;

public interface User_ShoopcService {

	int addShoopc(String name, double price, String img, int cid, String colour, String edition, int amount, Long u_id);

	List<User_Shoopc> userIdByShoopcInfo(Long u_id);

	List<User_Shoopc> showShoopcById(String str);

	int showShoopc(String colour, String edition, int cid, Long u_id);

	int addAmountShoopc(String colour, String edition, int amount, int cid, Long u_id);

	int addAmount(Integer sid);

	int minusAmount(Integer sid);

	int selShoopc(Integer sid);

	int countUserShoopc(Long u_id);

}
