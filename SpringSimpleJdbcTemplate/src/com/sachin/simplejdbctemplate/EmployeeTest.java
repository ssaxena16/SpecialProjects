package com.sachin.simplejdbctemplate;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		EmployeeDao employeeDao = (EmployeeDao)applicationContext.getBean("employeedaobean");
		int result = employeeDao.updateEmployee(new Employee(103, "Ajay", 26000));
		if(result>0)
		{
			System.out.println("Record has been updated");
		}

	}

}
