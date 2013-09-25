package com.base.util;

import javax.servlet.http.HttpSession;

import com.util.http.HttpUtil;


public class SessionUtil {

	public static HttpSession getHttpSession() {
		return HttpUtil.getRequest().getSession();
	}
	
	public static void setAttribute(String name,Object value) {
		getHttpSession().setAttribute(name, value);
	}
	
	public static Object getAttribute(String name) {
		return getHttpSession().getAttribute(name);
	}
}
