package com.base.dao.impl;

import javax.annotation.PostConstruct;
import com.base.dao.impl.BaseDaoImpl;
import javax.annotation.Resource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.stereotype.Repository;
import com.base.dao.DataDictionaryMapper;
import com.base.model.DataDictionary;
import com.base.model.DataDictionaryExample;

@Repository("dataDictionaryMapper")
public class DataDictionaryMapperImpl extends
		BaseDaoImpl<DataDictionary, DataDictionaryExample> implements
		DataDictionaryMapper {
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
		return DataDictionaryMapper.class.getName();
	}
}