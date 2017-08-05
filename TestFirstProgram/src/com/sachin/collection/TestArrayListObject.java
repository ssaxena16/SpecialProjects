package com.sachin.collection;

import java.util.ArrayList;
import java.util.List;

class Student
{
	
	private int rollNo;
	private String name;
	private int age;
	public Student(int rollNo, String name, int age)
	{
		this.rollNo = rollNo;
		this.name= name;
		this.age= age;
		
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}

public class TestArrayListObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student1 = new Student(101,"Mohit",23);
		Student student2 = new Student(102, "Sumit", 24);
		Student student3 = new Student(103, "Rohit", 25);
		
		List<Student> list = new ArrayList<Student>();
		
		list.add(student1);
		list.add(student2);
		list.add(student3);
		
		for(Student student : list)
		{
			System.out.println(""+student.getRollNo()+",  "+student.getName()+"   ,"+student.getName());
		}
		

	}

}
