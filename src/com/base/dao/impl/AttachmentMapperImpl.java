package com.base.dao.impl;

import javax.annotation.PostConstruct;
import com.base.dao.impl.BaseDaoImpl;
import javax.annotation.Resource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.stereotype.Repository;
import com.base.dao.AttachmentMapper;
import com.base.model.Attachment;
import com.base.model.AttachmentExample;

@Repository("attachmentMapper")
public class AttachmentMapperImpl extends
		BaseDaoImpl<Attachment, AttachmentExample> implements AttachmentMapper {
	
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
		return AttachmentMapper.class.getName();
	}
}