package com.base.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.ServletWebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.util.io.AjaxOutPut;
import com.util.jackson.JacksonUtil;

@ControllerAdvice
public class ResponseExceptionHandler extends ResponseEntityExceptionHandler {
	
	@ExceptionHandler
	protected void handleConflict(RuntimeException e, ServletWebRequest request) {  
        AjaxOutPut.renderText(request.getResponse(), JacksonUtil.writeValueAsString(BaseController.getFailureResult()));
    } 
	
	
	protected boolean isAjaxRequest(HttpServletRequest req) {
	    String requestType = req.getHeader("X-Requested-With"); 
	    if ("XMLHttpRequest".equals(requestType)) { 
	        return true; 
	    } else { 
	        return false; 
	    }
	}
}
