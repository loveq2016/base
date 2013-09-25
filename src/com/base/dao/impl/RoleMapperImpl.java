package com.base.dao.impl;

import javax.annotation.PostConstruct;
import com.base.dao.impl.BaseDaoImpl;
import javax.annotation.Resource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.stereotype.Repository;
import com.base.dao.RoleMapper;
import com.base.model.Role;
import com.base.model.RoleExample;

@Repository("roleMapper")
public class RoleMapperImpl extends BaseDaoImpl<Role, RoleExample> implements
		RoleMapper {
	private SqlSessionFactory mySqlSessionFacotry;

	@Resource(name = "sqlSessionFactory")
	public void setMySessionFacotry(SqlSessionFactory sqlSessionFactory) {
		this.mySqlSessionFacotry = sqlSessionFactory;
	}

	@PostConstruct
	public void injectSqlSessionFactory() {
		super.setSqlSessionFactory(mySqlSessionFacotry);
	}

	@Override
	public String getNamespace() {
		return RoleMapper.class.getName();
	}
}