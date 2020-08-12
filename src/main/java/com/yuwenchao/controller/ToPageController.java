package com.yuwenchao.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ToPageController {
//所有路径的跳转Controller
	protected static final Logger logger = LoggerFactory.getLogger(ToPageController.class);
	
	@RequestMapping("topageone")
	public String toPageOne() {
		
		return "success";
	}
	
	@RequestMapping("toLoginPage")
	public String toLoginPage() {
		return "login";
	}
	
	
	@RequestMapping("toEmpPage")
	public String toEmpPage() {
		return "EmployeeInfo/employeelist";
	}
	
	
	@RequestMapping("toiReportPage")
	public String toiReportPage() {
		return "iReportPage/iReportList";
	}
	
	
	
	@RequestMapping("toshowempVoCondition")
	public String toshowempVoCondition() {
		return "iReportPage/firstEmpVoCondition";
	}
	
	//上传
	@RequestMapping("toupload")
	public String toupload() {
		return "uploadPage/upload";
	}
	
}
