package com.yuwenchao.utils;


import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;


/*
 * 
 *应用启动的监听器
 *
 */
public class AppStartUpListener implements ServletContextListener {
	
	
	
	/**
	 * 项目启动  //要注册到web.xml中
	 */
	@Override
	public void contextInitialized(ServletContextEvent sce) {
		
		
		//相当于当前项目的application域
		ServletContext servletContext = sce.getServletContext();
		//logger.debug("项目启动完成");
		String path = servletContext.getContextPath();
		//保存项目路径
		servletContext.setAttribute("APP_PATH", path);
		//logger.info("项目启动完成");
	}
	/**
	 * 项目停止
	 */
	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		// TODO Auto-generated method stub
		
	}

}
