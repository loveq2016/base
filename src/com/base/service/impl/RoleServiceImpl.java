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

	@Override
	public List<Role> selectByUserId(Integer userId) {
		RoleExample roleExample = new RoleExample();
		roleExample.setColumn(" r.id, r.name, r.description, r.creator, r.creation_time, r.retention, r.ext ");
		roleExample.setJoin(" as r join tb_user_role as ur on r.id = ur.role_id ");
		RoleExample.Criteria roleCriteria = roleExample.createCriteria();
		roleCriteria.addCriterion(" ur.user_id = ", userId, "user_id");
		return selectByExample(roleExample);
	}
}