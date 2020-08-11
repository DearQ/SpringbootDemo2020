package com.t05g1.service.impl;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.t05g1.dao.UserDao;
import com.t05g1.pojo.User;
import com.t05g1.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserDao userDao;
	//用户账号密码登录
	@Override
	public User login(String text, String u_user, String u_phone, String u_email, String u_pwd) {
		
    	String str=text;
        //判断text是否为邮箱
        String expr = "[\\w!#$%&'*+/=?^_`{|}~-]+(?:\\.[\\w!#$%&'*+/=?^_`{|}~-]+)*@(?:[\\w](?:[\\w-]*[\\w])?\\.)+[\\w](?:[\\w-]*[\\w])?";
        
        //判断text是否为手机号
        Pattern pattern = Pattern
                .compile("^((13[0-9])|(14[5,7])|(15[0-3,5-9])|(17[0,3,5-8])|(18[0-9])|166|198|199|(147))\\d{8}$");
        Matcher matcher = pattern.matcher(str);

        if (str.matches(expr)) {
        	u_email=text;
        }else if(matcher.matches()) {
        	u_phone=text;
        }else {
        	u_user=text;
        }
        text=null;
		
		return userDao.login(u_user,u_phone,u_email,u_pwd);
	}
	//用户验证码登录
	@Override
	public User loginYZ(String phone) {
		// TODO Auto-generated method stub
		return userDao.loginYZ(phone);
	}
	//判断用户是否存在
	@Override
	public int countUserId(String phone) {
		// TODO Auto-generated method stub
		return userDao.countUserId(phone);
	}
	//添加用户信息
	public int register(String phone, String pwd) {
		//生成随机数
		String text = String.valueOf(new Random().nextInt(999999999) + 1000000000);
		String phones=String.valueOf(phone);
		String strh = phones.substring(phones.length() -4,phones.length());
		String name="jd_"+text+strh;
		phones=null;
		strh=null;
		text=null;
		return userDao.register(phone,pwd,name);
	}
	//添加用户信息
	@Override
	public int registerPC(String phone, String name, String pwd) {
		//生成随机数
		String text = String.valueOf(new Random().nextInt(999999999) + 1000000000);
		String phones=String.valueOf(phone);
		String strh = phones.substring(phones.length() -4,phones.length());
		String user="jd_"+text+strh;
		phones=null;
		strh=null;
		text=null;
		return userDao.registerPC(user,phone,pwd,name);
	}
	
	
}
