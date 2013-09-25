package com.base.util;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class InitData implements ServletContextListener  {

	public void contextDestroyed(ServletContextEvent event) {
		
	}

	public void contextInitialized(ServletContextEvent event) {
		ServletContext application = event.getServletContext();
		System.setProperty("path", application.getRealPath("/"));
	}

 
}
