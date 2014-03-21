package com.base.service;

import java.util.List;

import com.base.model.Role;
import com.base.model.RoleExample;
import com.base.service.BaseService;

public interface RoleService extends BaseService<Role, RoleExample> {
	public List<Role> selectByUserId(Integer userId);

	public int delete(Integer id);
}