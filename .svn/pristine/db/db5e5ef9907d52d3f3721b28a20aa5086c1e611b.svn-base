package com.t05g1.util;

import org.apache.shiro.crypto.SecureRandomNumberGenerator;
import org.apache.shiro.crypto.hash.SimpleHash;

public class TestEncryption {

	public static void main(String[] args) {
		String password = "jd12580";
		String salt = new SecureRandomNumberGenerator().nextBytes().toString();
		int times = 2;
		String algorithmName = "md5";
		
		String encodedPassword = new SimpleHash(algorithmName,password,salt,times).toString();
		
		
		
		System.out.printf("原始密码是 %s , 盐是： %s, 运算次数是： %d, 运算出来的密文是：%s ",password,salt,times,encodedPassword);
		
	}
}
