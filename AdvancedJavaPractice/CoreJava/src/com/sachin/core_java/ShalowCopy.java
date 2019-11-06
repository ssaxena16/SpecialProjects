package com.sachin.core_java;

public class ShalowCopy {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		Address address = new Address("Noida", 160101);
		Employee employee = new Employee(101, "Rohit", address);
		employee.name = "Mukul";
		employee.address.city = "Delhi";
		System.out.println(" " + employee);
		Employee employee2 = (Employee) employee.clone();
		System.out.println("  " + employee2);
	}

}

class Employee implements Cloneable {
	int empId;
	String name;
	Address address;

	public Employee(int id, String name, Address address) {
		this.empId = empId;
		this.name = name;
		this.address = address;
	}

	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	public String toString() {
		return " " + empId + " " + name + "  " + address;
	}
}

class Address {
	String city;
	int pinNo;

	public Address(String city, int pinNo) {
		this.city = city;
		this.pinNo = pinNo;
	}

	public String toString() {
		return " " + city + " " + pinNo;
	}
}
