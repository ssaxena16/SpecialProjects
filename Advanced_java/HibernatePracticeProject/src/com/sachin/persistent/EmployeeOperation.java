package com.sachin.persistent;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmployeeOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory sessionFactory = null;
		Configuration cfg = new Configuration();
		cfg.configure(EmployeeOperation.class.getResource("/hibernate-conf.xml"));
		sessionFactory = cfg.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction t = session.beginTransaction();
		Employee employee = new Employee();
		employee.setName("Nikhil");

		Regular_Employee regular_employee = new Regular_Employee();
		regular_employee.setName("Mudit");
		regular_employee.setSalary(25000);
		regular_employee.setBonus(5500);

		Contract_Employee contract_employee = new Contract_Employee();
		contract_employee.setName("Rohit");
		contract_employee.setPay_per_hour(880);
		contract_employee.setContract_period("2 month");

		session.persist(employee);
		session.persist(regular_employee);
		session.persist(contract_employee);

		t.commit();
	}

}
