package com.sachin.collection2;

import java.util.ArrayList;

class Emp {
	int emp_id;
	String name;
	int age;

	public Emp(int emp_id, String name, int age) {
		this.emp_id = emp_id;
		this.name = name;
		this.age = age;
	}
	public String toString()
	{
		return (""+emp_id+"   "+name+"   "+age);
	}
}

public class TestObjectArrayList {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		Emp emp1 = new Emp(101, "Ram", 26);
		Emp emp2 = new Emp(102, "Shyam", 27);
		Emp emp3 = new Emp(103, "Ghanshyan", 28);
		Emp emp4 = new Emp(104, "Dhyam", 29);
		ArrayList<Emp> list = new ArrayList<Emp>();
		list.add(emp1);
		list.add(emp2);
		list.add(emp3);
		list.add(emp4);
		
		for(Emp emp : list)
		{
			System.out.println(""+emp);
		}
		ArrayList<Emp> listclone = (ArrayList<Emp>)list.clone();
		for(Emp emp : listclone)
		{
			System.out.println(""+emp);
		}

	}

}
