package com.t05g1.service;

import com.t05g1.pojo.User;

public interface UserService {

	User login(String text, String u_user, String u_phone, String u_email, String u_pwd);

	int countUserId(String phone);

	int register(String phone, String pwd);

	User loginYZ(String phone);

	int registerPC(String phone, String name, String pwd);
	
	
	
}
