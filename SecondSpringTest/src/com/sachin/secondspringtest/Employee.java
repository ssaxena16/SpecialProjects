package com.sachin.secondspringtest;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Employee {
	private int id;
	private String name;
	private List<String> role;
	private Map<Integer,Address> address;
	public Employee(int id)
	{
		this.id = id ;
		
	}
	public Employee(int id, String name, Map<Integer,Address> address,List<String> role)
	{
		this.id = id;
		this.name = name;
		this.address = address;
		this.role = role;
	}
	public void empInfo()
	{
		System.out.println("Employee Id == "+id +"  Employee Name ==== "+name);
		System.out.println("Address are:");
		for(Map.Entry<Integer, Address> entry : address.entrySet())
		{
			System.out.println(" AddressNo "+entry.getKey()+"   "+entry.getValue().toString());
		}
		System.out.println("");
		System.out.println("Employees role are:");
		Iterator<String> itr = role.iterator();
		while(itr.hasNext())
		{
			System.out.println(" "+itr.next());
		}
		
	}

}
