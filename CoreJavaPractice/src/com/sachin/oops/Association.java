package com.sachin.oops;

public class Association {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank bank = new Bank("SBI");
		Employee employee = new Employee("Ankit");
		System.out.println(""+employee.getEmpName()+"  is employee of bank "+bank.getBankName());

	}

}

class Bank 
{
	private String name ;
	Bank(String name )
	{
		this.name = name;
	}
	public String getBankName()
	{
		return name;
	}
}

class Employee
{
	private String name;
	Employee(String name)
	{
		this.name = name;
	}
	public String getEmpName()
	{
		return name;
	}
}