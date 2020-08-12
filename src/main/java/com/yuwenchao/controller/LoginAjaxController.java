package com.yuwenchao.controller;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.yuwenchao.bean.UserInfo;
import com.yuwenchao.service.impl.UserInfoService;

@RestController
public class LoginAjaxController {
  
	protected static final Logger logger = LoggerFactory.getLogger(LoginAjaxController.class);
	
	@Autowired
	UserInfoService  service;
	
	@ResponseBody
	@RequestMapping("checkLoginacct")
	public UserInfo checkLoginacct(String loginacct) {
		UserInfo userInfo = service.LoginAjaxController(loginacct);	
		logger.debug("用户信息："+userInfo);
		return userInfo;
	}
	
	
	
}
