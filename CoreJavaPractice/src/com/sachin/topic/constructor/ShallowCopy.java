package com.sachin.topic.constructor;

import java.util.HashMap;
import java.util.Map;

public class ShallowCopy {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		Employee employee = new Employee();
		employee.setId(101);
		employee.setName("Harshit");
		HashMap<String, String> prop = new HashMap<String, String>();
		prop.put("Depatment", "Software");
		prop.put("Salary", "40000");
		prop.put("profile", "Developer");

		employee.setProps(prop);
		Employee employeeClone = (Employee) employee.clone();
		employee.setName("Abhishek");
		prop.put("Timing", "9 hours");
		employee.setProps(prop);

		System.out.println("------------Employee Object -----------");
		System.out.println(employee.getId());
		System.out.println(employee.getName());
		System.out.println(employee.getProps());

		System.out.println("------------Clone Employee Object -----------");
		System.out.println(employeeClone.getId());
		System.out.println(employeeClone.getName());
		System.out.println(employeeClone.getProps());

	}

}

class Employee implements Cloneable {
	int id;
	String name;
	Map<String, String> props = new HashMap<String, String>();

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Map<String, String> getProps() {
		return props;
	}

	public void setProps(Map<String, String> props) {
		this.props = props;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

}
