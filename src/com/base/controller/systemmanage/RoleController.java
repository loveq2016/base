package com.base.controller.systemmanage;

import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import com.base.controller.BaseController;
import com.base.model.Role;
import com.base.model.RoleExample;
import com.base.service.RoleService;
import com.util.pager.Pager;
import com.util.string.StringUtil;

@Controller
@RequestMapping("system/role/")
public class RoleController extends BaseController {

	@Resource
	private RoleService roleService;
	
	
	
	@RequestMapping(value="find")
	@ResponseBody
	public Object find(Role role) {
		Map<String, Object> map = getSuccessResult();
		RoleExample example = new RoleExample();
		example.setOrderByClause(" id desc ");
		RoleExample.Criteria criteria = example.createCriteria();
		 
		Pager pager = roleService.selectByPager(example, getOffset()-1, getPageSize());
		map.put(total, pager.getTotal());
		map.put(rows, pager.getList());
		return map;
	}
	
	@RequestMapping(value="save")
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
	
}