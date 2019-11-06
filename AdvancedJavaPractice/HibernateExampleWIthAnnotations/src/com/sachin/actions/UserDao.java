package com.sachin.actions;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.Projections;

import com.sachin.entites.User;
import com.sachin.hibernate.HibernateUtil;

public class UserDao {
	public static void main(String args[]) {
		getUsers();
	}

	public static void getUsers() {
		Session session = HibernateUtil.getSessionfactory().openSession();
		Transaction transaction = session.beginTransaction();
		Query query = session.createQuery("from User");
		List<User> list = query.list();
		for (User user : list) {
			System.out.println("  " + user.getId() + "  " + user.getUserName() + "  " + user.getPassword());

		}

		Criteria criteria = session.createCriteria(User.class);
		criteria.setProjection(Projections.property("userName"));

		List<String> list1 = criteria.list();
		for (String user : list1) {
			System.out.println("  " + user + "  ");

		}

		transaction.commit();
		session.close();
	}

}
