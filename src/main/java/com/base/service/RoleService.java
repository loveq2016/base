package com.base.service;

import java.util.List;

import com.base.model.Role;
import com.base.model.RoleExample;
import com.base.service.BaseService;

/**
 * 角色服务层
 * @author willenfoo
 *
 */
public interface RoleService extends BaseService<Role, RoleExample> {
	
	/**
	 * 根据用户id，查询该用户角色list
	 * @param userId 用户id
	 * @return
	 */
	public List<Role> selectByUserId(Integer userId);

	/**
	 * 删除角色，并且删除 关连表 的 关连关系
	 * @param id
	 * @return
	 */
	public int delete(Integer id);
}