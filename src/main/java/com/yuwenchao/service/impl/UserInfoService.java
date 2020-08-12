package com.yuwenchao.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yuwenchao.bean.UserInfo;
import com.yuwenchao.bean.UserInfoExample;
import com.yuwenchao.bean.UserInfoExample.Criteria;
import com.yuwenchao.mapper.UserInfoMapper;
import com.yuwenchao.utils.MD5Util;

@Service
public class UserInfoService {

	@Autowired
	UserInfoMapper mapper;

	public UserInfo login(UserInfo user) {
		UserInfoExample example = new UserInfoExample();
		//加密
		String pwad = MD5Util.digestPwad(user.getUserpswd());
		example.createCriteria().andLoginacctEqualTo(user.getLoginacct())
		.andUserpswdEqualTo(pwad);	
		List<UserInfo> list = mapper.selectByExample(example);
		return list.size()==1?list.get(0):null;
	}
	
	public UserInfo LoginAjaxController(String loginacct) {
		UserInfoExample example = new UserInfoExample();
		example.createCriteria().andLoginacctEqualTo(loginacct);
		List<UserInfo> list = mapper.selectByExample(example);
		
		
		
		return list.size()==1?list.get(0):null;
	}
	
	
	
}
