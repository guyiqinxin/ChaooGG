package com.yuwenchao.utils;

import java.math.BigDecimal;
import java.util.Random;

public class RandowTest {
	//随机生成5000到10000的数
	public static void main(String[] args) {
		int max=35;
		int min=20;
		Random random = new Random();
		int s = random.nextInt(max)%(max-min+1) + min;	
		System.out.println(s);
		
	}

}
