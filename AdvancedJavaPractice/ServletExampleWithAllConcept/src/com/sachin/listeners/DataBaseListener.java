package com.sachin.listeners;

import java.sql.SQLException;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import com.sahin.db.DBConfigurationUtil;

public class DataBaseListener implements ServletContextListener {

	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void contextInitialized(ServletContextEvent e) {
		// TODO Auto-generated method stub
		ServletContext context = e.getServletContext();
		System.out.println("Driver  "+context.getInitParameter("dbDriver"));
		DBConfigurationUtil.intialize(context.getInitParameter("dbDriver"), context.getInitParameter("dbPath"),
				context.getInitParameter("dbUserName"), context.getInitParameter("dbPassword"));

	}

}
