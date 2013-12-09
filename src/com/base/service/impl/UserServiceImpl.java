package com.base.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.security.authentication.AuthenticationServiceException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.base.service.impl.BaseServiceImpl;
import com.base.model.Resources;
import com.base.model.Role;
import com.base.model.User;
import com.base.model.UserExample;
import com.base.dao.impl.UserMapperImpl;
import com.base.dao.UserMapper;
import com.base.service.ResourcesService;
import com.base.service.RoleService;
import com.base.service.UserService;
import com.base.util.Config;
import com.base.util.Constants;
import com.util.http.HttpUtil;
import com.util.md5.Md5Util;

@Service("userService")
public class UserServiceImpl extends
		BaseServiceImpl<User, UserExample, UserMapperImpl> implements
		UserService {
	
	@SuppressWarnings("unused")
	private UserMapper userMapper;

	@Resource
	private RoleService roleService;
	
	@Resource
	private ResourcesService resourcesService;
	
	private final static Log LOG = LogFactory.getLog(UserServiceImpl.class);
	
	@Resource
	public void setUserMapper(UserMapper userMapper) {
		this.userMapper = userMapper;
		super.setBaseDao((UserMapperImpl) userMapper);
	}

	@Override
	public UserDetails loadUserByUsername(String userName)
			throws UsernameNotFoundException {
		LOG.info("用户登录，用户名是===" + userName);
		//1. 验证用户输入的验证码是否正确
		User user = new User();
		user.setUserName(userName);
		user = selectByModel(user);
		//2. 检查用户名是否在数据库中存在
		if (user == null) {
			throw new AuthenticationServiceException(Config.USER_NAME_DOES_NOT_EXIST);
		} else {
			//3. 用户存在,查看密码是否正确
			if (!user.getPassword().equals(Md5Util.getMD5(HttpUtil.getRequest().getParameter("password")))) {
				throw new AuthenticationServiceException(Config.PASSWORD_WRONG);
			}
			
			List<Resources> resourcess = null;
			List<GrantedAuthority> auths = new ArrayList<GrantedAuthority>();//权限名称集合, 该用户有那些权限
			GrantedAuthority grantedAuthority = new SimpleGrantedAuthority("ROLE_USER");
			auths.add(grantedAuthority);
			
			//4. 用户名跟密码验证正确, 根据用户ID查找到该用户有那些角色, 如果用户名是admin，可以访问所有资源
			if (Constants.ADMIN.equals(userName)) {
				LOG.info("admin可以访问所有资源");
				resourcess = resourcesService.selectByExample(null);
			} else {
				List<Role> roles = roleService.selectByUserId(user.getId());
				List<Integer> roleIds = new ArrayList<Integer>();
				for (Role role : roles) {
					roleIds.add(role.getId());
					LOG.info("该用户的角色=====" +role.getName());
				}
				
				if (roleIds != null && !roleIds.isEmpty()) {
					//5. 根据角色id, 查找到该角色可以访问那些资源
					resourcess = resourcesService.selectByRoleIds(roleIds);
				}
			}
			if (resourcess != null && !resourcess.isEmpty()) {
				for (Resources resources : resourcess) {
					grantedAuthority = new SimpleGrantedAuthority(resources.getCode());
					auths.add(grantedAuthority);
					LOG.info("该用户能访问的模块=====" +resources.getName());
				}
				user.setResourcess(resourcess);
				user.setAuthorities(auths);
			}
		}
		return user;
	}
 
	public int insertUser(User user) {
		//插入用户前, 检查该用户名是否已经存在
		if (isExist(user.getUserName())) {
			LOG.error("不能注册,用户名已经存在,用户是====" + user.getUserName());
			throw new RuntimeException();
		} else {
			return insert(user);
		}
	}

	@Override
	public boolean isExist(String userName) {
		User checkUser = new User();
		checkUser.setUserName(userName);
		checkUser = selectByModel(checkUser);
		if (checkUser != null) {
			//存在直接抛出异常
			LOG.error("用户名已经存在,用户是====" + userName);
			return true;
		}
		return false;
	}
	
}