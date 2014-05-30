package com.base.service;


import java.util.List;

import com.base.model.RoleResources;
import com.base.model.RoleResourcesExample;
import com.base.service.BaseService;

/**
 * 角色资源服务层
 * @author willenfoo
 *
 */
public interface RoleResourcesService extends
		BaseService<RoleResources, RoleResourcesExample> {
	
	 /**
	  * 插入角色资源的关连关系，首先删除角色资源的关连关系
	  * @param roleId 角色id
	  * @param list 
	  * @return
	  */
	 public int saveRoleResources(int roleId, List<RoleResources> list);
	 
}