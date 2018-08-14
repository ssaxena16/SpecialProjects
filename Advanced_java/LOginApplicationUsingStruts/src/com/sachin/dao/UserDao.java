package com.sachin.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.sachin.hibernate.HibernateUtil;

public class UserDao {

	public static boolean isAthuntication(String userName, String password) {
		System.out.println("TT"+ userName +"  "+password);
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		boolean isUserAuth = false;  
		try {
			session.beginTransaction();
			Query query = session.createQuery("from User where username = :name and password = :pass ");
			query.setParameter("name", userName);
			query.setParameter("pass", password);
			List<Query> record = query.list();
			if (record.size() > 0) {
				isUserAuth = true;
				session.getTransaction().commit();
			}
  		} catch (Exception e) {
			session.getTransaction().rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}

		return isUserAuth;

	}

}
