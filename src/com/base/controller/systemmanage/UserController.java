package com.base.controller.systemmanage;

import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import com.base.controller.BaseController;
import com.base.model.User;
import com.base.model.UserExample;
import com.base.service.UserService;
import com.util.pager.Pager;
import com.util.string.StringUtil;

@Controller
@RequestMapping("system/user/")
public class UserController extends BaseController {

	@Resource
	private UserService userService;
	
	
	
	@RequestMapping(value="find")
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
	
	@RequestMapping(value="save")
	@ResponseBody
	public Object save(User user) {
		Map<String, Object> map = getSuccessResult();
		if (user.getId() == null) {
			userService.insert(user);
		} else {
			userService.updateById(user);
		}
		return map;
	}
	
}