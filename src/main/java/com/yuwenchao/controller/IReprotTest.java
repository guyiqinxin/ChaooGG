package com.yuwenchao.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yuwenchao.bean.UserIReprot;
import com.yuwenchao.utils.JRUtils;

@Controller
public class IReprotTest {

	@RequestMapping("ireport")
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("title", "人员基本信息");
		params.put("USER_NAME", "王五");
		
		UserIReprot iReprot = new UserIReprot("张三", 18);
		List<UserIReprot> list = new ArrayList<>();		
		list.add(iReprot);

		ServletContext servletContext = request.getServletContext();
		System.out.println("servletContext!!!!!!!!!!!!!!!!!!!"+servletContext);
		//ServletContext servletContext = this.getServletConfig().getServletContext();
		String filePath = servletContext.getRealPath("/iReport/User.jasper");
		System.out.println("filePath!!!!!!!!!!!!"+filePath);
		JRUtils.printToPdfView(response, filePath, params, list);
	}
}
