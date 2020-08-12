package com.yuwenchao.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.yuwenchao.bean.UserInfo;
import com.yuwenchao.service.impl.UserInfoService;

@Controller
public class UserInfoContrller {
 
	@Autowired
	UserInfoService service;
	
	@RequestMapping("login")
	public String login(UserInfo user,HttpServletRequest request, HttpServletResponse response,Model model) {
		//防止表单数据重复提交、防止用户恶意攻击
				//获取 浏览器提交的注册验证码参数
				String code = request.getParameter("code").toUpperCase();
				//获取服务器存储的 验证码字符串
				HttpSession session = request.getSession();
				String serverCode = (String) session.getAttribute("KAPTCHA_SESSION_KEY");
				//判断验证码是否正确  或请求是否为重复提交的
				if(code!=null && code.equals(serverCode)) {
					//调用业务逻辑进行登录
					UserInfo loginuser=service.login(user);
					
				if(loginuser==null) {
					//登录失败			
					/*
					 * String loginacct = loginuser.getLoginacct();
					 * System.out.println("用户名"+loginacct);
					 * model.addAttribute("loginacct","用户名取不出来");
					 */
					model.addAttribute("errorMsg", "用户名或密码错误！！");
					//request.setAttribute("errorMsg", "用户名或密码错误！！");
					return "forward:/login.jsp";
				}
				//牵扯到页面共享session  
				//注意重定向session   转发model
				session.setAttribute("loginuser", loginuser);
					return "redirect:/toEmpPage";//此处可用安全框架增强
				}else {
					model.addAttribute("errorMsg", "验证码错误！！");
					//request.setAttribute("errorMsg", "验证码错误！！");
					return "forward:/login.jsp";
				}
		
	}
	
	
	@RequestMapping("newlogin")
	public String newlogin(UserInfo user,@RequestParam("code")String code,@RequestParam("loginacct")String loginacct,HttpSession session,Model model) {
		model.addAttribute("code", code);
		code =code.toUpperCase();
		String serverCode = (String) session.getAttribute("KAPTCHA_SESSION_KEY");
		UserInfo loginuser=service.login(user);	
		System.out.println("验证："+code+serverCode);
		
		if(loginuser==null){
			model.addAttribute("loginacct", loginacct);
			model.addAttribute("errorMsg", "用户名或密码错误!");
			return "forward:/login.jsp";
		}else if(!code.equals(serverCode)) {
			model.addAttribute("loginacct", loginacct);
			model.addAttribute("errorMsg", "验证码错误!");
			return "forward:/login.jsp";
		}else {
			session.setAttribute("loginuser", loginuser);
			return "redirect:/toEmpPage";//此处可用安全框架增强
		}
		
	}
}
