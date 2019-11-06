package com.sachin.hibernate;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

	public static SessionFactory getSessionfactory() {
		Configuration config = new Configuration();
		config.configure("/hibernate-conf.xml");
		return config.buildSessionFactory();
	}

}
