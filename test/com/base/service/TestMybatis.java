package com.base.service;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.base.BaseTest;

public class TestMybatis extends BaseTest {

	public void testSelectList() {
		SqlSessionFactory sessionFactory =  (SqlSessionFactory)context.getBean("sqlSessionFactory");
		SqlSession sqlSession = sessionFactory.openSession();
		
		sqlSession.selectList("com.base.dao.UserMapper.selectByExample");
		
		sqlSession.selectList("com.base.dao.UserMapper.selectByExample");
	}
}
