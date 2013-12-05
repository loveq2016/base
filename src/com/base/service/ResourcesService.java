package com.base.service;

import java.util.List;

import com.base.model.Resources;
import com.base.model.ResourcesExample;
import com.base.service.BaseService;

public interface ResourcesService extends
		BaseService<Resources, ResourcesExample> {
	
	public List<Resources> selectByRoleIds(List<Integer> roleIds);
	
	public List<Resources> selectByRoleId(Integer roleId);
}