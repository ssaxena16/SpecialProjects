package com.sachin.methods;

public class DeepCopy {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		    Address1 address = new Address1("Delhi", 160111, "Saket");
			Employee1 employee1 = new Employee1(111, "Ram", address);
			Employee1 employee2 = (Employee1)employee1.clone();
			System.out.println("employee1" +employee1);
			System.out.println("employee2 "+employee2);
			employee1.name = "Shyam";
			employee1.address.cityName = "Ghaziabad";
			System.out.println("employee1 "+employee1);
			System.out.println("employee2 "+employee2);

		}

	}

	class Address1 implements Cloneable
	{
		String cityName;
		int pinCode;
		String location;
		Address1(String cityName, int pinCode, String location)
		{
			this.cityName = cityName;
			this.pinCode = pinCode;
			this.location = location;
		}
		public String toString()
		{
			return cityName+"  "+pinCode+" "+location;
		}
		@Override
		protected Object clone() throws CloneNotSupportedException {
			// TODO Auto-generated method stub
			return super.clone();
		}
	}

	class Employee1 implements Cloneable
	{
		int empNo;
		String name;
		Address1 address;
		Employee1(int empNo, String name, Address1 address)
		{
			this.empNo = empNo;
			this.name = name;
			this.address = address;
		}
		@Override
		protected Object clone() throws CloneNotSupportedException {
			// TODO Auto-generated method stub
			Employee1 employee = (Employee1)super.clone();
			Address1 address = (Address1)this.address.clone();
					//new Address1(this.address.cityName, this.address.pinCode, this.address.location);
			employee.address = address;
			return employee;
		}
		public String toString()
		{
			return " "+empNo+" "+name+" "+address;
		}
	}