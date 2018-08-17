package com.sachin.persistent;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class QuestionAnswerAction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration conf = new Configuration();
		conf.configure(QuestionAnswerAction.class.getResource("/hibernate-conf.xml"));
		SessionFactory sessionFactory = conf.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction t = session.beginTransaction();
		
		Question question = new Question();
		
		// Using this code for bag and list.
		/*question.setQuestion("What are the books of java?");
		List<String > list = new ArrayList<String>();
		list.add("Black Book");
		list.add("Core java");
		question.setAnswer(list);*/
		
		Set<String > set = new HashSet<>();
		set.add("Core Book");
		set.add("Black Book");
		question.setQuestion("Whar are the jaa books");
		question.setAnswer(set);
		session.persist(question);
		t.commit();
		
		session.close();
		sessionFactory.close();
		
		
		
		

	}

}
