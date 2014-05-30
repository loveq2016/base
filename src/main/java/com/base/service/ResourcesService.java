package com.base.service;

import java.util.List;

import com.base.model.Resources;
import com.base.model.ResourcesExample;
import com.base.service.BaseService;

/**
 * 资源服务层
 * @author willenfoo
 *
 */
public interface ResourcesService extends
		BaseService<Resources, ResourcesExample> {
	
	/**
	 * 根据角色ids，查询资源
	 * @param roleIds
	 * @return
	 */
	public List<Resources> selectByRoleIds(List<Integer> roleIds);
	
	/**
	 * 根据角色id，查询资源
	 * @param roleId
	 * @return
	 */
	public List<Resources> selectByRoleId(Integer roleId);
}