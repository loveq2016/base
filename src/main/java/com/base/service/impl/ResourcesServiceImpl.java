package com.base.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import com.base.service.impl.BaseServiceImpl;
import com.base.model.Resources;
import com.base.model.ResourcesExample;
import com.base.dao.impl.ResourcesMapperImpl;
import com.base.dao.ResourcesMapper;
import com.base.service.ResourcesService;

@Service("resourcesService")
public class ResourcesServiceImpl extends
		BaseServiceImpl<Resources, ResourcesExample, ResourcesMapperImpl>
		implements ResourcesService {
	private ResourcesMapper resourcesMapper;
	
	@Resource
	public void setResourcesMapper(ResourcesMapper resourcesMapper) {
		this.resourcesMapper = resourcesMapper;
		super.setBaseDao((ResourcesMapperImpl) resourcesMapper);
	}

	@Override
	public List<Resources> selectByRoleIds(List<Integer> roleIds) {
		ResourcesExample example = new ResourcesExample();
		example.setDistinct(true);
		example.setColumn(" r.id, r.name, r.link_url, r.parent_id, r.sequence,r.code, r.type");
		example.setJoin(" as r left join tb_role_resources as rr on r.id = rr.resources_id ");
		example.setOrderByClause(" r.sequence ");
		
		ResourcesExample.Criteria criteria = example.createCriteria();
		criteria.addCriterion(" rr.role_id in ", roleIds, "role_id");
		return selectByExample(example);
	}

	@Override
	public List<Resources> selectByRoleId(Integer roleId) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(roleId); 
		return selectByRoleIds(list);
	}
}