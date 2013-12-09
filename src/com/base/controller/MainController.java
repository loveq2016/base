package com.base.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MainController {

	/**
	 * 用户登录
	 * @param user
	 * @param modelMap
	 * @return
	 */
	@RequestMapping(value="login")
	public String login() {
		return "login";
	}
	
	/**
	 * 用户无权限访问地址
	 * @return
	 */
	@RequestMapping(value="accessDenied")
	public String accessDenied() {
		return "common/403";
	}
	
	/**
	 * 首页
	 * @param user
	 * @param modelMap
	 * @return
	 */
	@RequestMapping(value="index",method=RequestMethod.GET)
	public String index(ModelMap modelMap) {
		return "index";
	}
	
	
}
