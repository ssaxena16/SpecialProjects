package com.sachin.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.sachin.hibernate.HibernateUtil;
import com.sachin.persistence.User;

public class UserDao {

	public boolean getLoginResult(String username, String password) {
		boolean result = false;
		Session session = HibernateUtil.getSessionFactory().openSession();
		try {

			session.beginTransaction();
			Query query = session.createQuery("from User where username = :name and password = :pass ");
			query.setParameter("name", username);
			query.setParameter("pass", password);
			List<User> record = query.list();
			System.out.println("" + record);
			if (record.size() > 0) {
				result = true;
			}
			session.beginTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
			session.getTransaction().rollback();
		} finally {
			session.close();
		}

		return result;
	}

	public User getUser(String name) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		User user = null;
		try {
			session.beginTransaction();
			user = (User)session.createQuery("from User where username like :name").setParameter("name", "%" + name + "%").uniqueResult();
			session.getTransaction().commit();
		} catch (Exception e) {
			System.err.println("Error getting Users :" + e);
			session.getTransaction().rollback();
		} finally {
			session.close();
		}
		return user;
	}
	public List<User> getUsers(String name) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		List<User> users = null;
		try {
			session.beginTransaction();
			users = session.createQuery("from User where username like :name" ).setParameter("name", "%" + name + "%").list();
			session.getTransaction().commit();
		} catch (Exception e) {
			System.err.println("Error getting Users :" + e);
			session.getTransaction().rollback();
		} finally {
			session.close();
		}
		return users;
	}

	public String addNewUser(String addUsername, String addPassword) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		try {
			session.beginTransaction();
			User user = new User();
			user.setUsername(addUsername);
			user.setPassword(addPassword);
			session.save(user);
			session.getTransaction().commit();
		} catch (Exception e) {
			System.err.println("Error creating User :" + e.getMessage());
			session.getTransaction().rollback();
			return "failure";
		} finally {
			session.close();
		}
		return "success";
	}
	public String updateUser(String prevUserName, String newUserName, String newPassword)
	{
		Session session = HibernateUtil.getSessionFactory().openSession();
		User user = null;
		try {
			session.beginTransaction();
			user = (User) session.createQuery("from User where username like :name")
					.setParameter("name", "%" + prevUserName + "%").uniqueResult();
			user.setUsername(newUserName);
			user.setPassword(newPassword);
			session.update(user);
			session.getTransaction().commit();
			
		} catch (Exception e) {
			System.err.println("Error creating User :" + e.getMessage());
			session.getTransaction().rollback();
			return "failure";
		}
		finally {
			session.close();
		}
		return "success";
	}

	public void deleteUser(String userName) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		User user = null;
		try {
			session.beginTransaction();
			user = (User) session.createQuery("from User where username like :name")
					.setParameter("name", userName).uniqueResult();
			session.delete(user);
			session.getTransaction().commit();
		} catch (Exception e) {
			System.err.println("Error creating User :" + e.getMessage());
			session.getTransaction().rollback();

		} finally {
			session.close();
		}
	}
}
