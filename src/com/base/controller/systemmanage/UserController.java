package com.base.controller.systemmanage;

import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
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
	
	@RequestMapping("showView")
	public String showView(@RequestParam(value="action",defaultValue="1000") String action,ModelMap modelMap) {
		if ("1000".equals(action)) {
			return "system/user/show";
		} else if ("1001".equals(action)) {
			return "system/user/edit";
		}
		return "system/user/show";
	}
	
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
			userService.insertUser(user);
		} else {
			userService.updateById(user);
		}
		return map;
	}
	
	@RequestMapping(value="delete")
	@ResponseBody
	public Object delete(@RequestParam("id") Integer id) {
		Map<String, Object> map = getSuccessResult();
		userService.deleteById(id);
		return map;
	} 
	
	@RequestMapping(value="isExist")
	@ResponseBody
	public Object isExist(@RequestParam("userName") String userName) {
		Map<String, Object> map = getSuccessResult();
		if (userService.isExist(userName)) {
			map = getFailureResult();
		}
		return map;
	}
}