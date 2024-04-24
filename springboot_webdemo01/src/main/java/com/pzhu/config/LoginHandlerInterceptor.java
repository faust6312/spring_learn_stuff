package com.pzhu.config;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class LoginHandlerInterceptor implements HandlerInterceptor {
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
		Object loginUser = request.getSession().getAttribute("loginUser");//这里去获取LoginController中的loginUser
		if (loginUser == null) {
			request.setAttribute("msg", "没有权限，请先登录");
			request.getRequestDispatcher("/index.html").forward(request, response);
			return false;
		} else {
			return true;
		}
	}

	}


