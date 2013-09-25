package com.base.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.base.model.User;
import com.base.util.Config;
import com.util.string.StringUtil;

public class ValidateInterceptor extends HandlerInterceptorAdapter {

	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler) throws Exception {
		User user = (User)request.getSession().getAttribute(Config.USER);		
		// 1、请求到登录页面,注销,首页  放行
		String path = request.getServletPath(); 
		if ("/login".equals(path)) {
			return true;
		} else if ("/forward".equals(path)) {
			String address = request.getParameter("address");
			if ("login".equals(address)) {
				return true;
			} else if ("common/403".equals(address)) {
				return true;
			} else if ("common/405".equals(address)) {
				return true;
			} else if ("common/500".equals(address)) {
				return true;
			}
		} else if ("/logout".equals(path)) {
			return true;
		} else if ("/index".equals(path) && user != null) {
			return true;
		}
		
		// 2、如果用户已经登录,并且验证其权限，有权限就 放行
		if (user != null) {
			//2.1、查询该用户是否有访问当前URL的权限
			String permissions = "";
			if (StringUtil.isEmpty(permissions)) {
				return true;
			} else {
				//如果查不到这个path路径，就没有访问这个URL的权限
				if (permissions.indexOf(path) == -1) {
					response.sendRedirect(request.getContextPath()+"/forward?address=common/403");
					return false;
				} else {
					return true;
				}
			}
		}

		// 3、非法请求 即这些请求需要登录后才能访问 ,重定向到登录页面
		response.sendRedirect(request.getContextPath()+"/forward?address=login&modelName=user");
		return false;
	}
}
