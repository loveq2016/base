package com.base.validator;

import java.lang.reflect.Method;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CodeIsExistValidator implements ConstraintValidator<CodeIsExist, Integer> {

    private Class<?> validatorClass;
  
    public void initialize(CodeIsExist constraintAnnotation) {
        this.validatorClass = constraintAnnotation.value();
    }

    public boolean isValid(Integer value, ConstraintValidatorContext constraintContext) {
    	if (value == null) {
			return true;
		}
		try {
			Method isExist = validatorClass.getMethod("isExist", Integer.class);
			return (Boolean)isExist.invoke(validatorClass, value);
		} catch (Exception e) {
			e.printStackTrace();
		} 
		return false;
    }

}