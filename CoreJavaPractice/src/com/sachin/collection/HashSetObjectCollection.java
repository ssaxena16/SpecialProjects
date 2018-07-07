package com.sachin.collection;

import java.util.HashSet;

public class HashSetObjectCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Employee> hs = new HashSet<Employee>();
		hs.add(new Employee(101,"Ajay"));
		hs.add(new Employee(101, "Ajay"));
		hs.add(new Employee(102, "Ram"));
		for(Employee emp : hs)
		{
			System.out.println(emp);
		}

	}

}

class Employee
{
	int empNo;
	String name;
	Employee(int empNo, String name)
	{
		this.empNo = empNo;
		this.name = name;
	}
	public String toString()
	{
		return empNo+"  "+name;
	}
	 @Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return this.empNo;
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		Employee emp = (Employee)obj;
		return this.empNo== emp.empNo && this.name.equals(emp.name);
	}
}