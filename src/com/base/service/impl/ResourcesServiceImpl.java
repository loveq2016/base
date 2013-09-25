package com.base.service.impl;

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
}