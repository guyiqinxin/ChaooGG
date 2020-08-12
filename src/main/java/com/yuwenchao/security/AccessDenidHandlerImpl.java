package com.yuwenchao.security;



import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.web.access.AccessDeniedHandler;
import org.springframework.stereotype.Component;

/**
 * 自定义的无权访问的处理器
 * @author lfy
 *
 */
@Component
public class AccessDenidHandlerImpl implements AccessDeniedHandler {

	@Override
	public void handle(HttpServletRequest request, HttpServletResponse response,
			AccessDeniedException accessDeniedException) throws IOException, ServletException {
		// TODO Auto-generated method stub
		request.setAttribute("msg", accessDeniedException.getMessage());
		
		//必须区别对待ajax和普通请求
		
		//
		if("XMLHttpRequest".equals(request.getHeader("X-Requested-With"))){
			//ajax请求
			String msg = "403";
			response.getWriter().write(msg);
		}else{
			//普通请求
			request.getRequestDispatcher("/WEB-INF/views/error/403.jsp").forward(request, response);
		}
		
	}

}
