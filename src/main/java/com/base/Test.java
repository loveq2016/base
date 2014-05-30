package com.base;

import java.util.HashMap;
import java.util.Map;

import com.base.model.User;
import com.util.validator.ValidatorUtils;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		User user = new User();
		user.setGender(11);
		user.setUserName("fullName");
		
		Map<String, Object> map = new HashMap<String, Object>();
		
		boolean flag = ValidatorUtils.validateAll(user, map);
		
		System.out.println(flag);
	}

}
