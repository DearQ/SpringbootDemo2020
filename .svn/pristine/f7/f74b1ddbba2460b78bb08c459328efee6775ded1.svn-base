package com.t05g1.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.t05g1.pojo.User_Shoopc;

public interface User_ShoopcDao {

	int addShoopc(@Param("name")String name, @Param("price")double price, 
			@Param("img")String imgSB, @Param("cid")int cid, @Param("colour")String colour, 
			@Param("edition")String edition, @Param("amount")int amount, @Param("uid")Long u_id);

	List<User_Shoopc> userIdByShoopcInfo(Long u_id);

	List<User_Shoopc> showShoopcById(String str);

	int showShoopc(@Param("colour")String colour, @Param("edition")String edition, @Param("cid")int cid, @Param("uid")Long u_id);

	int addAmountShoopc(@Param("colour")String colour, @Param("edition")String edition, @Param("amount")int amount, @Param("cid")int cid, @Param("uid")Long u_id);

	int addAmount(Integer sid);

	int minusAmount(Integer sid);

	int selShoopc(Integer sid);

	int countUserShoopc(Long u_id);

}
