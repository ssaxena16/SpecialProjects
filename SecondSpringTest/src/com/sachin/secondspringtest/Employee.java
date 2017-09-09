package com.sachin.secondspringtest;

public class Employee {
	private int id;
	private String name;
	public Employee(int id)
	{
		this.id = id ;
		
	}
	public Employee(int id, String name)
	{
		this.id = id;
		this.name = name;
	}
	public void empInfo()
	{
		System.out.println("Employee Id == "+id +"  Employee Name ==== "+name);
		
	}

}
