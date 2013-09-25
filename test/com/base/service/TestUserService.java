package com.base.service;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.base.BaseTest;
import com.base.model.User;

public class TestUserService extends BaseTest {

	@Test
	public void testAdd() {
		UserService userService = (UserService)context.getBean("userService");
		
	 
	}

	@Test
    public void test() {
    	UserService userService = (UserService)context.getBean("userService");

    	List<User> list = new ArrayList<User>();
    	
    	for (int i = 0; i < 4; i++) {
    		User user = new User();
    		user.setUserName("will"+i);
    		user.setPassword("passwd"+i);
    		
    		list.add(user);
		}
    	System.out.println(userService.batchInsert(list));
    	
    	 
    }
}
