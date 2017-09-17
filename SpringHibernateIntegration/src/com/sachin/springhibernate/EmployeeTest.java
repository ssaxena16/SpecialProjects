package com.sachin.springhibernate;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class EmployeeTest {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		Resource resource = new ClassPathResource("applicationContext.xml");
		BeanFactory factory = new XmlBeanFactory(resource);
		EmployeeDao employeeDao = (EmployeeDao) factory.getBean("d");
		Employee employee = new Employee();
		int id;
		String name;
		int salary;
		System.out.println("1 : Insert");
		System.out.println("2 : Update");
		System.out.println("3 : delete");
		System.out.println("4 : ViewRecords");
		System.out.println("5 : Exit");

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int choice;
		do {
			System.out.println("Select choice");
			choice = Integer.parseInt(br.readLine());
			switch (choice) {
			case 1:
				System.out.println("Please fill the detail for Create a new Employee");
				System.out.println("Please Enter id");
				id = Integer.parseInt(br.readLine());
				System.out.println("Please Enter Name");
				name = br.readLine();
				System.out.println("Please Enter Salary");
				salary = Integer.parseInt(br.readLine());
				employee.setId(id);
				employee.setName(name);
				employee.setSalary(salary);
				employeeDao.saveEmployee(employee);
				break;
			case 2:
				System.out.println("Please fill required fields for Update the employee data");
				System.out.println("Please Enter Employee Id");
				id = Integer.parseInt(br.readLine());
				employee = employeeDao.getEmployeeByIdWIthoutload(id);
				System.out.println("Please Enter new Employee Name");
				name = br.readLine();
				employee.setName(name);
				System.out.println("Please Enter new Employee Salary");
				salary = Integer.parseInt(br.readLine());
				employee.setSalary(salary);
				employeeDao.updateEmployee(employee);
				break;
			case 3:
				System.out.println("Please fill required field for delete the Employee data");
				System.out.println("Please Enter Employee Id");
				id = Integer.parseInt(br.readLine());
				employee = employeeDao.getEmployeeById(id);
				employeeDao.deleteEmployee(employee);
				break;
			case 4:
				System.out.println("There are the following Employees");
				for (Employee emp : employeeDao.getEmployeeList()) {
					System.out.println("  " + emp.getId() + "    " + emp.getName() + "   " + emp.getSalary());
				}
				break;

			default:
				break;
			}

		} while (choice != 5);

	}

}
