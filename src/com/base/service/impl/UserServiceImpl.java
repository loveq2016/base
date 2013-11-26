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
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.base.service.impl.BaseServiceImpl;
import com.base.model.Authorities;
import com.base.model.AuthoritiesExample;
import com.base.model.Resources;
import com.base.model.ResourcesExample;
import com.base.model.Role;
import com.base.model.RoleExample;
import com.base.model.User;
import com.base.model.UserExample;
import com.base.dao.impl.UserMapperImpl;
import com.base.dao.UserMapper;
import com.base.service.AuthoritiesService;
import com.base.service.ResourcesService;
import com.base.service.RoleService;
import com.base.service.UserService;
import com.base.util.Config;
import com.util.http.HttpUtil;
import com.util.md5.Md5Util;

@Service("userService")
public class UserServiceImpl extends
		BaseServiceImpl<User, UserExample, UserMapperImpl> implements
		UserService {
	
	private UserMapper userMapper;

	@Resource
	private RoleService roleService;
	
	@Resource
	private AuthoritiesService authoritiesService;
	
	@Resource
	private ResourcesService resourcesService;
	
	private final static Log log = LogFactory.getLog(UserServiceImpl.class);
	
	@Resource
	public void setUserMapper(UserMapper userMapper) {
		this.userMapper = userMapper;
		super.setBaseDao((UserMapperImpl) userMapper);
	}

	@Override
	public UserDetails loadUserByUsername(String userName)
			throws UsernameNotFoundException {
		log.info("用户登录，用户名是===" + userName);
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
			//4. 用户名跟密码验证正确, 根据用户ID查找到该用户有那些角色
			RoleExample roleExample = new RoleExample();
			roleExample.setColumn(" r.id, r.name ");
			roleExample.setJoin(" as r join tb_user_role as ur on r.id = ur.role_id ");
			
			RoleExample.Criteria roleCriteria = roleExample.createCriteria();
			roleCriteria.addCriterion(" ur.user_id = ", user.getId(), "user_id");
			
			List<Role> roles = roleService.selectByExample(roleExample);
			
			List<Integer> roleIds = new ArrayList<Integer>();
			for (Role role : roles) {
				roleIds.add(role.getId());
				log.debug("该用户的角色=====" +role.getName());
			}
			
			//5. 根据角色id, 查找到该角色有那些权限
			AuthoritiesExample authoritiesExample = new AuthoritiesExample();
			authoritiesExample.setDistinct(true);
			authoritiesExample.setColumn(" a.id, a.name ");
			authoritiesExample.setJoin(" as a join tb_role_authorities as ra on a.id = ra.authorities_id ");
			
			AuthoritiesExample.Criteria authoritiesCriteria = authoritiesExample.createCriteria();
			authoritiesCriteria.addCriterion(" ra.role_id in ", roleIds, "role_id");
			List<Authorities> authoritiess = authoritiesService.selectByExample(authoritiesExample);
			
			List<GrantedAuthority> auths = new ArrayList<GrantedAuthority>();//权限名称集合, 该用户有那些权限
			GrantedAuthority grantedAuthority = new SimpleGrantedAuthority("ROLE_USER");
			auths.add(grantedAuthority);
			
			List<Integer> authIds = new ArrayList<Integer>();
			for (Authorities authorities : authoritiess) {
				grantedAuthority = new SimpleGrantedAuthority(authorities.getName());
				auths.add(grantedAuthority);
				authIds.add(authorities.getId());
				
				log.debug("该用户的权限=====" +authorities.getName());
			}
			
			user.setAuthorities(auths);
			
			//6. 根据权限id, 查找到该权限能访问那些模块
			ResourcesExample resourcesExample = new ResourcesExample();
			resourcesExample.setDistinct(true);
			resourcesExample.setColumn("r.id, r.name ,r.link_url, r.parent_id");
			resourcesExample.setJoin(" as r join tb_authorities_resources as ar on r.id = ar.resources_id ");
			
			ResourcesExample.Criteria resourcesCriteria = resourcesExample.createCriteria();
			resourcesCriteria.addCriterion(" ar.authorities_id in ", authIds, "authorities_id");
			
			List<Resources> resourcess = resourcesService.selectByExample(resourcesExample);
			
			if (log.isDebugEnabled()) {
				for (Resources resources : resourcess) {
					log.debug("该用户能访问的模块=====" +resources.getName());
				}
			}
			
			user.setResourcess(resourcess);
		}
		return user;
	}
 
	public int insertUser(User user) {
		
		//插入用户前, 检查该用户名是否已经存在
		User checkUser = new User();
		checkUser.setUserName(user.getUsername());
		checkUser = selectByModel(checkUser);
		if (checkUser != null) {
			//存在直接抛出异常
			throw new RuntimeException();
		}
		return 1;
	}
	
}