package com.yuwenchao.utils;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//该工具类为Security安全框架中的密码加密工具
public class BCryptUtils {
	
	public static void main(String[] args) {
		BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
		String password = passwordEncoder.encode("123456");
		System.out.println("加密后密码："+password);
		//$2a$10$cXDqfrsGdQ1HA6Ya2p5/j.MKiL807hB7yf1RNSL3j9d8NKmfB2dXK
	}
       
}
