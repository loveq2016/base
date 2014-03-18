package com.base.controller.systemmanage;

import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import com.base.controller.BaseController;
import com.base.model.Role;
import com.base.model.RoleExample;
import com.base.model.UserRoleExample;
import com.base.service.RoleService;
import com.base.service.UserRoleService;
import com.util.pager.Pager;

/**
 * 角色管理 小模块 Controller
 * @author willenfoo
 *
 */

@Controller
@RequestMapping("system/role/")
public class RoleController extends BaseController {

	@Resource
	private RoleService roleService;

	@Resource
	private UserRoleService userRoleService;
 
	/**
	 * 显示视图 
	 * @param action 当前的操作，  1000 代表是 显示 角色 数据集合， 1001是添加角色，1002是修改角色
	 * @param modelMap
	 * @return
	 */
	@RequestMapping("showView")
	public String showView(@RequestParam(value="action",defaultValue="1000") String action,ModelMap modelMap) {
		if ("1000".equals(action)) {
			return "system/role/show";
		} else if ("1001".equals(action)) {
			modelMap.put("user", new Role());
			return "system/role/edit";
		} else if ("1002".equals(action)) {
			if (getId() != null) {
				Role role = roleService.selectById(getId());
				modelMap.put("role", role);
			}
			return "system/role/edit";
		} else {
			return null;
		}
	}
	
	/**
	 *  查询角色
	 * @param role
	 * @return
	 */
	@RequestMapping(value = "find")
	@ResponseBody
	public Object find(Role role) {
		Map<String, Object> map = getSuccessResult();
		RoleExample example = new RoleExample();
		example.setOrderByClause(" id desc ");
		RoleExample.Criteria criteria = example.createCriteria();

		Pager pager = roleService.selectByPager(example, getOffset() - 1, getPageSize());
		map.put(total, pager.getTotal());
		map.put(rows, pager.getList());
		return map;
	}

	/**
	 * 保存角色，id存在时更新，否则插入
	 * @param user
	 * @return
	 */
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
	public Object delUserRole(@RequestParam("roleId") Integer roleId,
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