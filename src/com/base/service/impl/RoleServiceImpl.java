package com.base.service.impl;

import java.util.List;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import com.base.service.impl.BaseServiceImpl;
import com.base.model.Role;
import com.base.model.RoleExample;
import com.base.dao.impl.RoleMapperImpl;
import com.base.dao.RoleMapper;
import com.base.service.RoleService;

@Service("roleService")
public class RoleServiceImpl extends
		BaseServiceImpl<Role, RoleExample, RoleMapperImpl> implements
		RoleService {
	private RoleMapper roleMapper;

	@Resource
	public void setRoleMapper(RoleMapper roleMapper) {
		this.roleMapper = roleMapper;
		super.setBaseDao((RoleMapperImpl) roleMapper);
	}

	
}