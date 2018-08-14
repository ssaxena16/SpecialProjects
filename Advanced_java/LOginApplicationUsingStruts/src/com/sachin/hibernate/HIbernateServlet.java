package com.sachin.hibernate;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class HIbernateServlet implements ServletContextListener {

	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void contextInitialized(ServletContextEvent arg0) {
		// TODO Auto-generated method stub
		HibernateUtil.intialize();

	}

}
