package com.sachin.hibernate;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	public static SessionFactory sessionFactory;

	public static void intialize() {
		Configuration cfg = new Configuration();
		cfg.configure(HibernateUtil.class.getResource("/hibernate-conf.xml"));
		sessionFactory = cfg.buildSessionFactory();

	}

	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public static void shutDown() {
		sessionFactory = null;
	}

}
