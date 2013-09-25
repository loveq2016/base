package com.base.service.impl;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import com.base.service.impl.BaseServiceImpl;
import com.base.model.AuthoritiesResources;
import com.base.model.AuthoritiesResourcesExample;
import com.base.dao.impl.AuthoritiesResourcesMapperImpl;
import com.base.dao.AuthoritiesResourcesMapper;
import com.base.service.AuthoritiesResourcesService;

@Service("authoritiesResourcesService")
public class AuthoritiesResourcesServiceImpl
		extends
		BaseServiceImpl<AuthoritiesResources, AuthoritiesResourcesExample, AuthoritiesResourcesMapperImpl>
		implements AuthoritiesResourcesService {
	private AuthoritiesResourcesMapper authoritiesResourcesMapper;

	@Resource
	public void setAuthoritiesResourcesMapper(
			AuthoritiesResourcesMapper authoritiesResourcesMapper) {
		this.authoritiesResourcesMapper = authoritiesResourcesMapper;
		super.setBaseDao((AuthoritiesResourcesMapperImpl) authoritiesResourcesMapper);
	}
}