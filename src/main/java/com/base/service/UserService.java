package com.base.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.base.model.User;
import com.base.model.UserExample;
import com.base.service.BaseService;

/**
 * 用户服务层
 * @author willenfoo
 *
 */
public interface UserService extends BaseService<User, UserExample>, UserDetailsService {
 
	/**
	 * 插入用户，如果用户名已经存在，抛出SystemException异常
	 * @param user
	 * @return
	 */
	public int insertUser(User user);
	
	/**
	 * 判断用户名是否存在
	 * @param userName 用户名
	 * @return 存在返回true, 否则返回false
	 */
	public boolean isExist(String userName);
	
	/**
	 * 删除用户, 把该用户的关连关系删除
	 * @param id 用户id
	 * @return
	 */
	public int delete(Integer id);
}