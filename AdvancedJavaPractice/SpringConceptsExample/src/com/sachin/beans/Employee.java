package com.sachin.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;

public class Employee {
	private String name;
	private int age;
	@Autowired
	private Designation designation;

	/*public Employee( Designation designation) {
		this.designation = designation;
	}

*/	
	
	public String getName() {
		return name;
	}
	
    @Required
	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Designation getDesignation() {
		return designation;
	}

	public void setDesignation(Designation designation) {
		this.designation = designation;
	}

	public void display() {
		System.out.println(" " + name + " " + age + " " + designation.designationName);
	}

}
