package com.base.service.impl;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import com.base.service.impl.BaseServiceImpl;
import com.base.model.RoleResources;
import com.base.model.RoleResourcesExample;
import com.base.dao.impl.RoleResourcesMapperImpl;
import com.base.dao.RoleResourcesMapper;
import com.base.service.RoleResourcesService;

@Service("roleResourcesService")
public class RoleResourcesServiceImpl
		extends
		BaseServiceImpl<RoleResources, RoleResourcesExample, RoleResourcesMapperImpl>
		implements RoleResourcesService {
	private RoleResourcesMapper roleResourcesMapper;

	@Resource
	public void setRoleResourcesMapper(RoleResourcesMapper roleResourcesMapper) {
		this.roleResourcesMapper = roleResourcesMapper;
		super.setBaseDao((RoleResourcesMapperImpl) roleResourcesMapper);
	}
}