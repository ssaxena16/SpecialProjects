package com.sachin.core_java;

public class DeepCopy {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub

		AddressInfo info = new AddressInfo("Noida", 160160);
		Student st = new Student(12, "Raj", info);
		Student st2 = (Student) st.clone();
		System.out.println(" " + st);
		st.name = "Amit";
		System.out.println(" " + st);
		System.out.println(" " + st2);

	}

}

class Student implements Cloneable {
	int rollNo;
	String name;
	AddressInfo address;

	public Student(int rollNo, String name, AddressInfo address) {
		this.rollNo = rollNo;
		this.name = name;
		this.address = address;
	}

	public Object clone() throws CloneNotSupportedException {
		Student st = (Student) super.clone();
		AddressInfo addressInfo = new AddressInfo(this.address.city, this.address.pinNo);
		st.address = addressInfo;
		return st;
	}

	public String toString() {
		return " " + rollNo + " " + name + "  " + address;
	}

}

class AddressInfo {
	String city;
	int pinNo;

	public AddressInfo(String city, int pinNo) {
		this.city = city;
		this.pinNo = pinNo;
	}

	public String toString() {
		return " " + city + " " + pinNo;
	}

}