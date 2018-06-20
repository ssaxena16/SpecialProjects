package com.sachin.collection;

class Address1 implements Cloneable {
	private String house_no;
	private String city;
	private String State;

	public String getHouse_no() {
		return house_no;
	}

	public void setHouse_no(String house_no) {
		this.house_no = house_no;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return State;
	}

	public void setState(String state) {
		State = state;
	}

	public String toStringring() {
		return ("" + house_no + "  " + city + "   " + State);
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub

		return super.clone();
	}

}

class Empoyee1 implements Cloneable {
	private int id;
	private String name;
	private Address1 address;

	public Empoyee1(int id, String name, Address1 address) {
		this.id = id;
		this.name = name;
		this.address = address;
	}

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

	public Address1 getAddress() {
		return address;
	}

	public void setAddress1(Address1 address) {
		this.address = address;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		// Empoyee employee = new Empoyee(id, name, getAddress());
		Empoyee1 employee = (Empoyee1) super.clone();

		employee.address = (Address1) address.clone();

		return employee;
	}

	public String toString() {
		return ("" + id + "   " + name + "   " + address.getHouse_no() + "  " + address.getCity() + "  "
				+ address.getState());
	}

}

public class TestDeepCopy {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub

		Address1 address = new Address1();
		address.setHouse_no("123");
		address.setCity("Mumbai");
		address.setState("Maharastra");
		Empoyee1 emp = new Empoyee1(101, "Sachin", address);
		System.out.println("first  " + emp);

		Empoyee1 emp1 = (Empoyee1) emp.clone();
		System.out.println("second  " + emp1);
		emp.setName("Rohit");
		emp.getAddress().setCity("Delhi");
		System.out.println("third  " + emp);
		System.out.println("four  " + emp1);

	}

}
