package com.base.util;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;


public class InitData implements ServletContextListener  {

	public void contextDestroyed(ServletContextEvent event) {
		
	}

	public void contextInitialized(ServletContextEvent event) {
		ServletContext application = event.getServletContext();
		System.setProperty("path", application.getRealPath("/"));
		
		Set<Class<?>> set = PackageUtils.getClasses("com.base.enums");
		for (Class<?> class1 : set) {
			Method m;
			try {
				m = class1.getDeclaredMethod("values", null);
				Object[] result = (Object[]) m.invoke(class1, null);
				 for (Object object : result) {
					Method mapMethod = object.getClass().getDeclaredMethod("getMap", null);
					mapMethod.setAccessible(true);
					Object mapObject = mapMethod.invoke(object, null);
					
					Method keyMethod = object.getClass().getDeclaredMethod("getKey", null);
					keyMethod.setAccessible(true);
					Object keyObject = keyMethod.invoke(object, null);
					application.setAttribute(keyObject.toString(), mapObject);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}  
		}
	}

}
