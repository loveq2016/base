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

/**
 * 用户管理 小模块 Controller
 * @author willenfoo
 *
 */
@Controller
@RequestMapping("system/user/")
public class UserController extends BaseController {

	@Resource
	private UserService userService;
	
	/**
	 * 显示视图 
	 * @param action 当前的操作，  1000 代表是 显示 用户 数据集合， 1001是添加用户，1002是修改用户
	 * @param modelMap
	 * @return
	 */
	@RequestMapping("showView")
	public String showView(@RequestParam(value="action",defaultValue="1000") String action,ModelMap modelMap) {
		if ("1000".equals(action)) {
			return "system/user/show";
		} else if ("1001".equals(action)) {
			modelMap.put("user", new User());
			return "system/user/edit";
		} else if ("1002".equals(action)) {
			if (getId() != null) {
				User user = userService.selectById(getId());
				modelMap.put("user", user);
			}
			return "system/user/edit";
		} else {
			return null;
		}
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
		if (StringUtil.isNotEmpty(user.getGender())) {
			criteria.andGenderEqualTo(user.getGender());
		}
		if (user.getAge() != null && user.getProvisional() != null) {
			criteria.andAgeBetween(user.getAge(), user.getProvisional());
		} else if (user.getAge() != null && user.getProvisional() == null) {
			criteria.andAgeGreaterThanOrEqualTo(user.getAge());
		} else if (user.getAge() == null && user.getProvisional() != null) {
			criteria.andAgeLessThanOrEqualTo(user.getProvisional());
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
		userService.delete(id);
		return map;
	} 
	
	@RequestMapping(value="isExist")
	@ResponseBody
	public Object isExist(@RequestParam("userName") String userName) {
		Map<String, Object> map = getSuccessResult("该用户名可以注册!");
		if (userService.isExist(userName)) {
			map = getFailureResult("该用户名已经存在!");
		}
		return map;
	}
}