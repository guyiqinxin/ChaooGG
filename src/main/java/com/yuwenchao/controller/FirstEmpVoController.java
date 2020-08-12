package com.yuwenchao.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Default;
import com.yuwenchao.iReport.vo.FirstEmpVo;
import com.yuwenchao.service.impl.FirstEmpVoService;
import com.yuwenchao.utils.JRUtils;

@Controller
public class FirstEmpVoController {
  
	
	@Autowired
	FirstEmpVoService service;
	
	/*
	 * 1.报表字体统一改为宋体
	 * 2.关于报表打印如果控制台报错Unknown property ' ' on class 
	 * 需要删除修改.jrxml文件中的这个字段
       <fieldDescription><![CDATA[]]></fieldDescription>
       3.报表的字段属性和VO属性保持一致。
	 */
	
	 
	@RequestMapping("showempVo")
	public void showempVo(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {		
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("title", "人员基本信息");
		params.put("username", "超级管理员");		  
		List<FirstEmpVo> list = service.getAllEmp();
		ServletContext servletContext = request.getServletContext();
		String filePath = servletContext.getRealPath("/iReport/FirstEmpVo.jasper");
		JRUtils.printToPdfView(response, filePath, params, list);
		
	}
	
	
	@RequestMapping("showempVoCondition")
	public void showempVoCondition(HttpServletRequest request, HttpServletResponse response,
			@RequestParam(value = "id",defaultValue ="")Integer id,
			@RequestParam(value = "firstName",defaultValue = "")String firstName,
			@RequestParam(value = "firstAge",defaultValue = "")Integer firstAge,
			@RequestParam(value = "firstGender",defaultValue = "")String firstGender,
			@RequestParam(value = "firstEmail",defaultValue = "")String firstEmail,
			@RequestParam(value = "firstPhone",defaultValue = "")String firstPhone,
			@RequestParam(value = "firstAddress",defaultValue = "")String firstAddress,
			@RequestParam(value = "firstSalary",defaultValue = "")Double firstSalary,
			@RequestParam(value = "deptName",defaultValue = "")String deptName,
			@RequestParam(value = "deptNature",defaultValue = "")String deptNature,
			Model model
			) throws ServletException, IOException {	
		model.addAttribute("id", id);
		model.addAttribute("firstName", firstName);
		model.addAttribute("firstAge", firstAge);
		model.addAttribute("firstGender", firstGender);
		model.addAttribute("firstEmail", firstEmail);
		model.addAttribute("firstPhone", firstPhone);
		model.addAttribute("firstAddress", firstAddress);
		model.addAttribute("firstSalary", firstSalary);
		model.addAttribute("deptName", deptName);
		model.addAttribute("deptNature", deptNature);
		System.out.println("员工id:"+id);
		System.out.println("输入员工姓名："+firstName);
		System.out.println("输入员工邮箱："+firstEmail);
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("title", "人员基本信息");
		params.put("username", "超级管理员");		  
		List<FirstEmpVo> list = service.getAllEmpCondition(id,firstName,firstAge,firstGender,firstEmail,
				firstPhone,firstAddress,firstSalary,deptName,deptNature);
		ServletContext servletContext = request.getServletContext();
		String filePath = servletContext.getRealPath("/iReport/FirstEmpVo.jasper");
		JRUtils.printToPdfView(response, filePath, params, list);
		
	}
	
	
	@RequestMapping("showempVoone")
	public void showempVoone(HttpServletRequest request, HttpServletResponse response,
			@RequestParam(value = "firstName")String firstName,
			@RequestParam(value = "firstEmail")String firstEmail) throws ServletException, IOException {		
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("title", "人员基本信息");
		params.put("username", "超级管理员");	
		System.out.println("传入参数："+firstName);
		List<FirstEmpVo> list = service.getAllEmpConditionone1(firstName,firstEmail);
		ServletContext servletContext = request.getServletContext();
		String filePath = servletContext.getRealPath("/iReport/FirstEmpVo.jasper");
		JRUtils.printToPdfView(response, filePath, params, list);
		
	}
	

}
