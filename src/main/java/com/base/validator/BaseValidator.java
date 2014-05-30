package com.base.validator;

import org.springframework.validation.Errors;

import com.util.validator.ValidatorUtils;

public abstract class BaseValidator {

	public void validate(Object object,String[] fields, Errors errors) {
		ValidatorUtils.validate(object, fields, errors);
	}
}
