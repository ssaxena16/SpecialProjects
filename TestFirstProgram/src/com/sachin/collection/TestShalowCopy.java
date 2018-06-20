package com.sachin.collection;

class Address
{
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
	public void setState(String State) {
		this.State = State;
	}
	
	public String toStringring()
	{
		return (""+house_no+"  "+city+"   "+State);
	}
	
}
class Empoyee implements Cloneable
{
	private int id;
	private String name;
	private Address address;
	
	public Empoyee(int id, String name, Address address)
	{
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

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String toString()
	{
		return (""+id+"   "+name+"   "+address.getHouse_no()+"  "+address.getCity()+"  "+address.getState());
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
	
}
public class TestShalowCopy {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		
		Address address = new Address();
		address.setHouse_no("123");
		address.setCity("Mumbai");
		address.setState("Maharastra");
		Empoyee emp = new Empoyee(101, "Sachin", address);
		
		System.out.println(""+emp);
		
		Empoyee empclone = (Empoyee)emp.clone();
		 
		System.out.println(""+empclone);
		
		emp.setName("Ajay");
		
		address.setHouse_no("1234" );
		address.setCity("Indore");
		address.setState("MP");
		emp.setAddress(address);
		
		System.out.println(""+emp);
		System.out.println(""+empclone);
		
		
		

	}

}
