package com.base.service.impl;

import java.util.List;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import com.base.service.impl.BaseServiceImpl;
import com.base.model.Role;
import com.base.model.RoleExample;
import com.base.model.UserRole;
import com.base.model.UserRoleExample;
import com.base.dao.impl.UserRoleMapperImpl;
import com.base.dao.UserRoleMapper;
import com.base.service.UserRoleService;

@Service("userRoleService")
public class UserRoleServiceImpl extends
		BaseServiceImpl<UserRole, UserRoleExample, UserRoleMapperImpl>
		implements UserRoleService {
	private UserRoleMapper userRoleMapper;

	@Resource
	public void setUserRoleMapper(UserRoleMapper userRoleMapper) {
		this.userRoleMapper = userRoleMapper;
		super.setBaseDao((UserRoleMapperImpl) userRoleMapper);
	}
	
	
}