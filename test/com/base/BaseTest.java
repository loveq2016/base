package com.base;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.junit.Test;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.mock.web.MockServletContext;
import org.springframework.ui.ModelMap;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.XmlWebApplicationContext;

import com.base.model.User;
import com.base.model.UserExample;
import com.base.service.UserService;

import junit.framework.TestCase;

public class BaseTest extends TestCase {
	 
	protected HttpServletRequest request = new MockHttpServletRequest();  
	protected HttpServletResponse response = new MockHttpServletResponse();  
	protected XmlWebApplicationContext context;  
	protected MockServletContext msc;  
    protected ModelMap modelMap = new ModelMap();
    
    protected void setUp() throws Exception {  
        String[] contexts = new String[] {"spring-servlet.xml", "applicationContext.xml"};  
        context = new XmlWebApplicationContext();  
        context.setConfigLocations(contexts);  
        msc = new MockServletContext();  
        context.setServletContext(msc);  
        context.refresh();  
        msc.setAttribute(WebApplicationContext.ROOT_WEB_APPLICATION_CONTEXT_ATTRIBUTE, context);  
    } 
    
    
    
    public static void main(String[] args) {
    	User user = null;
    	 
	}
    
    
    public static <T> T aa(T t) {
    	return t;
    }
}
