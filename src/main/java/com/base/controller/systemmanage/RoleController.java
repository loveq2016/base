package com.base.controller.systemmanage;

import java.util.Map;

import javax.annotation.Resource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import com.base.controller.BaseController;
import com.base.model.Role;
import com.base.model.RoleExample;
import com.base.model.UserRoleExample;
import com.base.service.RoleService;
import com.base.service.UserRoleService;
import com.base.util.Constants;
import com.util.pager.Pager;
import com.util.string.StringUtil;

/**
 * 角色管理 模块 Controller
 * @author willenfoo
 *
 */
@Controller
@RequestMapping("system/role/")
public class RoleController extends BaseController {

	
	/**
	 * 显示视图 
	 * @param action 当前的操作，  1000 代表是 显示 角色 数据集合， 1001是添加角色，1002是修改角色
	 * @param modelMap
	 * @return
	 */
	@RequestMapping("showView/{actionCode}")
	public String showView(@PathVariable String actionCode, ModelMap modelMap) {
		if ("1000".equals(actionCode)) {
			return "system/role/show";
		} else if ("1001".equals(actionCode)) {
			modelMap.put("role", new Role());
			return "system/role/edit";
		} else if ("1002".equals(actionCode)) {
			if (getId() != null) {
				try {
					Role role = roleService.selectById(getId());
					modelMap.put("role", role);
				} catch (Exception e) {
					e.printStackTrace();
					LOG.error(Constants.DB_ERROR_TEXT, e);
					throw new RuntimeException(Constants.DB_ERROR_TEXT);
				}
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
		if (StringUtil.isNotEmpty(role.getName())) {
			criteria.andNameLike("%"+role.getName().trim()+"%");
		}
		Pager pager;
		try {
			pager = roleService.selectByPager(example, getOffset() - 1, getPageSize());
		} catch (Exception e) {
			e.printStackTrace();
			LOG.error(Constants.DB_ERROR_TEXT, e);
			throw new RuntimeException(Constants.DB_ERROR_TEXT);
		}
		map.put(total, pager.getTotal());
		map.put(rows, pager.getList());
		return map;
	}

	/**
	 * 添加角色
	 * @param user
	 * @return
	 */
	@RequestMapping(value = "add")
	@ResponseBody
	public Object add(Role role) {
		Map<String, Object> map = getSuccessResult();
		try {
			roleService.insert(role);
		} catch (Exception e) {
			e.printStackTrace();
			LOG.error(Constants.DB_ERROR_TEXT, e);
			throw new RuntimeException(Constants.DB_ERROR_TEXT);
		}
		return map;
	}
	
	/**
	 * 更新角色
	 * @param user
	 * @return
	 */
	@RequestMapping(value = "update")
	@ResponseBody
	public Object update(Role role) {
		Map<String, Object> map = getSuccessResult();
		try {
			if (role.getId() != null) {
				roleService.updateById(role);
			}
		} catch (Exception e) {
			e.printStackTrace();
			LOG.error(Constants.DB_ERROR_TEXT, e);
			throw new RuntimeException(Constants.DB_ERROR_TEXT);
		}
		return map;
	}
	
	/**
	 * 删除用户
	 * @param id
	 * @return
	 */
	@RequestMapping(value="delete")
	@ResponseBody
	public Object delete(@RequestParam("id") Integer id) {
		Map<String, Object> map = getSuccessResult();
		try {
			roleService.delete(id);
		} catch (Exception e) {
			e.printStackTrace();
			LOG.error(Constants.DB_ERROR_TEXT, e);
			throw new RuntimeException(Constants.DB_ERROR_TEXT);
		}
		return map;
	} 

	/**
	 * 根据角色id跟用户id删除  关连关系
	 * @param roleId
	 * @param userId
	 * @return
	 */
	@RequestMapping(value = "delUserRole")
	@ResponseBody
	public Object delUserRole(@RequestParam("roleId") Integer roleId,
			@RequestParam("userId") Integer userId) {
		Map<String, Object> map = getSuccessResult();
		UserRoleExample example = new UserRoleExample();
		UserRoleExample.Criteria criteria = example.createCriteria();
		criteria.andUserIdEqualTo(userId);
		criteria.andRoleIdEqualTo(roleId);
		try {
			userRoleService.deleteByExample(example);
		} catch (Exception e) {
			e.printStackTrace();
			LOG.error(Constants.DB_ERROR_TEXT, e);
			throw new RuntimeException(Constants.DB_ERROR_TEXT);
		}
		return map;
	}
	
	/**
	 * 根据用户id查询该用户的角色
	 * @param userId
	 * @return
	 */
	@RequestMapping(value = "findByUserId")
	@ResponseBody
	public Object findByUserId(@RequestParam("userId") Integer userId) {
		Map<String, Object> map = getSuccessResult();
		try {
			map.put(rows,roleService.selectByUserId(userId));
		} catch (Exception e) {
			e.printStackTrace();
			LOG.error(Constants.DB_ERROR_TEXT, e);
			throw new RuntimeException(Constants.DB_ERROR_TEXT);
		}
		return map;
	}
	
	@Resource
	private RoleService roleService; //角色服务层

	@Resource
	private UserRoleService userRoleService; //用户角色服务层
 
	private final static Log LOG = LogFactory.getLog(RoleController.class);
}