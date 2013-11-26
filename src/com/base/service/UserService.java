package com.base.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.base.model.User;
import com.base.model.UserExample;
import com.base.service.BaseService;

public interface UserService extends BaseService<User, UserExample>, UserDetailsService {
 
	
	public int insertUser(User user);
}