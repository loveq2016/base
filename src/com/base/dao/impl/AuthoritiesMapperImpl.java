package com.base.dao.impl;

import javax.annotation.PostConstruct;
import com.base.dao.impl.BaseDaoImpl;
import javax.annotation.Resource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.stereotype.Repository;
import com.base.dao.AuthoritiesMapper;
import com.base.model.Authorities;
import com.base.model.AuthoritiesExample;

@Repository("authoritiesMapper")
public class AuthoritiesMapperImpl extends
		BaseDaoImpl<Authorities, AuthoritiesExample> implements
		AuthoritiesMapper {
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
		return AuthoritiesMapper.class.getName();
	}
}