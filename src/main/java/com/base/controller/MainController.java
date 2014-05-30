package com.base.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MainController {

	/**
	 * 用户无权限访问地址  页面
	 * @return
	 */
	@RequestMapping(value="accessDenied")
	public String accessDenied() {
		return "common/403";
	}
	
	/**
	 * 首页  页面
	 * @param modelMap
	 * @return
	 */
	@RequestMapping(value="index",method=RequestMethod.GET)
	public String index(ModelMap modelMap) {
		return "index";
	}
	 
	/**
	 * 登录  页面
	 * @param modelMap
	 * @return
	 */
	@RequestMapping(value="login",method=RequestMethod.GET)
	public String login(ModelMap modelMap) {
		return "login";
	}
	
	/**
	 * session超时
	 * @param modelMap
	 * @return
	 */
	@RequestMapping(value="timeout",method=RequestMethod.GET)
	public String timeout() {
		return "timeout";
	}
	
}
