package com.sachin.springhibernate;

import java.util.ArrayList;
import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;

public class EmployeeDao {
	HibernateTemplate hibernateTemplate;

	public void setTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	public void saveEmployee(Employee e) {
		hibernateTemplate.save(e);
		System.out.println("Record has been saved");
	}

	public void updateEmployee(Employee e) {
		hibernateTemplate.update(e);
		System.out.println("Record has been updated");
	}

	public void deleteEmployee(Employee e) {
		hibernateTemplate.delete(e);
		System.out.println("Recod has been deleted");
	}

	public Employee getEmployeeById(int id) {
		Employee employee = hibernateTemplate.load(Employee.class, id);
		return employee;
	}

	// Case of update using getEmployeeByIdWIthoutload
	public Employee getEmployeeByIdWIthoutload(int id) {
		Employee employee = hibernateTemplate.get(Employee.class, id);
		return employee;
	}

	public List<Employee> getEmployeeList() {
		List<Employee> list = new ArrayList<Employee>();
		list = hibernateTemplate.loadAll(Employee.class);
		return list;

	}
}
