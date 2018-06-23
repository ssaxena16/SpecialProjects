package com.sachin.array;

import java.util.Arrays;
import java.util.Comparator;

public class ArraysSortExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp1 = new Employee(109, "Emp1");
		Employee emp2 = new Employee(105, "Emp2");
		Employee emp3 = new Employee(108, "Emp3");
		Employee[] emp = {emp1,emp2,emp3};
		Arrays.sort(emp, new EmpNo());
		System.out.println(Arrays.toString(emp));
		int i = Arrays.binarySearch(emp, new Employee(105, "Emp2"));
		System.out.println(i);

	}

}

class Employee
{
	int empNo;
	String name;
	Employee(int empNo, String name)
	{
		this.empNo = empNo;
		this.name = name ;
	}
	public String toString()
	{
		return empNo+ "  "+name;
	}
}

class EmpNo implements Comparator<Employee>
{
	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return o1.empNo - o2.empNo;
	}
	
}