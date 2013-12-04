package com.base.controller.systemmanage;

import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import com.base.controller.BaseController;
import com.base.model.Role;
import com.base.model.RoleExample;
import com.base.model.UserRoleExample;
import com.base.service.RoleService;
import com.base.service.UserRoleService;
import com.util.pager.Pager;
import com.util.string.StringUtil;

@Controller
@RequestMapping("system/role/")
public class RoleController extends BaseController {

	@Resource
	private RoleService roleService;

	@Resource
	private UserRoleService userRoleService;
 
	@RequestMapping(value = "find")
	@ResponseBody
	public Object find(Role role) {
		Map<String, Object> map = getSuccessResult();
		RoleExample example = new RoleExample();
		example.setOrderByClause(" id desc ");
		RoleExample.Criteria criteria = example.createCriteria();

		Pager pager = roleService.selectByPager(example, getOffset() - 1,
				getPageSize());
		map.put(total, pager.getTotal());
		map.put(rows, pager.getList());
		return map;
	}

	@RequestMapping(value = "save")
	@ResponseBody
	public Object save(Role role) {
		Map<String, Object> map = getSuccessResult();
		if (role.getId() == null) {
			roleService.insert(role);
		} else {
			roleService.updateById(role);
		}
		return map;
	}

	@RequestMapping(value = "delUserRole")
	@ResponseBody
	public Object assignRole(@RequestParam("roleId") Integer roleId,
			@RequestParam("userId") Integer userId) {
		Map<String, Object> map = getSuccessResult();
		UserRoleExample example = new UserRoleExample();
		UserRoleExample.Criteria criteria = example.createCriteria();
		criteria.andUserIdEqualTo(userId);
		criteria.andRoleIdEqualTo(roleId);
		userRoleService.deleteByExample(example);
		return map;
	}
	
	@RequestMapping(value = "findByUserId")
	@ResponseBody
	public Object findByUserId(@RequestParam("userId") Integer userId) {
		Map<String, Object> map = getSuccessResult();
		map.put(rows,roleService.selectByUserId(userId));
		return map;
	}
	
}