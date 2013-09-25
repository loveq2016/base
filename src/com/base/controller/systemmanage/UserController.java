package com.base.controller.systemmanage;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.*;
import org.springframework.web.bind.annotation.*;

import com.base.controller.BaseController;
import com.base.model.User;
import com.base.model.UserExample;
import com.base.service.ServiceMapping;
import com.base.service.UserService;
import com.util.mybatis.RowBounds;
import com.util.pager.Pager;
import com.util.string.StringUtil;

@Controller
public class UserController extends BaseController {

	@Resource
	private UserService userService;
	
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
	
	@RequestMapping(value="system/user/find",method=RequestMethod.POST)
	@ResponseBody
	public Object find(User user) {
		Map<String, Object> map = getSuccessResult();
		UserExample example = new UserExample();
		example.setOrderByClause(" id desc ");
		UserExample.Criteria criteria = example.createCriteria();
		if (StringUtil.isNotEmpty(user.getUserName())) {
			criteria.andUserNameLike("%"+user.getUserName()+"%");
		}
		Pager pager = userService.selectByPager(example, getOffset()-1, getPageSize());
		map.put(total, pager.getTotal());
		map.put(rows, pager.getList());
		return map;
	}
	
	
	
}