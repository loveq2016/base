package com.base.validator.user;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.base.enums.user.Gender;
import com.base.model.User;
import com.base.validator.BaseValidator;

public class UserUpdateValidator extends BaseValidator implements Validator {

	public static final String[] FIELDS = {"id", "userName", "mail", "mobile", "fullName", "age", "gender", "description"};
	
	@Override
	public boolean supports(Class<?> clazz) {
		return User.class.equals(clazz);
	}

	@Override
	public void validate(Object object, Errors errors) {
		super.validate(object,FIELDS, errors);
	}

}
