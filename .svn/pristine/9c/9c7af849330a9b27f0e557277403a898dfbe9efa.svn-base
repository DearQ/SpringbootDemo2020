package com.t05g1.dao;

import org.apache.ibatis.annotations.Param;

import com.t05g1.pojo.User;

public interface UserDao {

	User login(@Param("name")String u_user, @Param("phone")String u_phone, @Param("email")String u_email, @Param("pwd")String u_pwd);
	
	int selectId();
	
	int UserBlockOrStart(int u_id,int u_type);

	int countUserId(String phone);

	int register(@Param("phone")String phone, @Param("pwd")String pwd, @Param("name")String name);

	User loginYZ(String phone);  

	int registerPC(@Param("user")String user, @Param("phone")String phone, @Param("pwd")String pwd, @Param("name")String name);

}
