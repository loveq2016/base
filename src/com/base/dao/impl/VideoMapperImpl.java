package com.base.dao.impl;

import javax.annotation.PostConstruct;
import com.base.dao.impl.BaseDaoImpl;
import javax.annotation.Resource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.stereotype.Repository;
import com.base.dao.VideoMapper;
import com.base.model.Video;
import com.base.model.VideoExample;

@Repository("videoMapper")
public class VideoMapperImpl extends BaseDaoImpl<Video, VideoExample> implements
		VideoMapper {
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
		return VideoMapper.class.getName();
	}
}