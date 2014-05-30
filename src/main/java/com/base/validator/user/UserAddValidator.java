package com.base.validator.user;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.base.model.User;

public class UserAddValidator implements Validator {

	public static final String[] FIELDS = {"userName", "password", "mail", "mobile", "fullName", "age", "gender", "description"};
	
	@Override
	public boolean supports(Class<?> clazz) {
		return User.class.equals(clazz);
	}

	@Override
	public void validate(Object object, Errors errors) {
		
	}

}
