package com.sachin.methods;

public class ShalowCopy {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		Address address = new Address("Delhi", 160111, "Saket");
		Employee employee1 = new Employee(111, "Ram", address);
		Employee employee2 = (Employee)employee1.clone();
		System.out.println("employee1" +employee1);
		System.out.println("employee2 "+employee2);
		employee1.name = "Shyam";
		employee1.address.cityName = "Ghaziabad";
		System.out.println("employee1 "+employee1);
		System.out.println("employee2 "+employee2);

	}

}

class Address
{
	String cityName;
	int pinCode;
	String location;
	Address(String cityName, int pinCode, String location)
	{
		this.cityName = cityName;
		this.pinCode = pinCode;
		this.location = location;
	}
	public String toString()
	{
		return cityName+"  "+pinCode+" "+location;
	}
}

class Employee implements Cloneable
{
	int empNo;
	String name;
	Address address;
	Employee(int empNo, String name, Address address)
	{
		this.empNo = empNo;
		this.name = name;
		this.address = address;
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	public String toString()
	{
		return " "+empNo+" "+name+" "+address;
	}
}