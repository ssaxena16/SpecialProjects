package com.sachin.jdbctemplate;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeTest {

	public static void main(String args[]) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		EmployeeDao employeeDao = (EmployeeDao) applicationContext.getBean("employeedao");
		/*
		 * With jdbcTemplate(Insert,Delete,Update)
		 * 
		 * int result= employeeDao.saveEmployee(new
		 * Employee(102,"Sumit",25000)); int result=
		 * employeeDao.updateEmplyee(new Employee(102,"Mohit",30000)); int
		 * result = employeeDao.deleteEmployee(new Employee(102,"Mohit",30000));
		 * if(result > 0) { //System.out.println(
		 * "A  record has been updated into database"); System.out.println(
		 * "A  record has been Deleted from  database"); }
		 */

		// Using PreparedStatement
		/*
		 * boolean dataresult =
		 * employeeDao.saveEmployeeWithPreparedStatement(new Employee(103,
		 * "Rbhit", 21000)); if (!dataresult) { System.out.println(
		 * "Recod has been inserted with Prepared Statement"); }
		 */

		// Get List of Employee Using ResultSetxxtractor
		for (Employee emp : employeeDao.getEmployeesList()) {
			System.out.println("" + emp.getId() + "    " + emp.getName() + "    " + emp.getSalary());
		}
		System.out.println("");
		// Get List of Employee Using ResultMapper
		for (Employee emp : employeeDao.getEmployeesListWithRowMapper()) {
			System.out.println(" " + emp.getId() + "    " + emp.getName() + "    " + emp.getSalary());
		}
	}
}
