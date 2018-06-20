package com.sachin.oops;

import java.util.ArrayList;
import java.util.List;

public class Agreegation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student1 student1 = new Student1("st1",11);
		Student1 student2 = new Student1("st2",12);
		Student1 student3 = new Student1("st3",13);
		Student1 student4 = new Student1("st4",14);
		List<Student1> students = new ArrayList<Student1>();
		students.add(student1);
		students.add(student2);
		students.add(student3);
		students.add(student4);
		Department dept = new Department("CS", students);
		dept.getDepartmentInfo();




	}

}

class Student1 
{
	private String name ;
	private int rollNo;
	Student1(String name , int rollNo)
	{
		this.name = name;
		this.rollNo = rollNo;
	}
	
	public String toString()
	{
		return ""+name+"  "+rollNo;
	}
}

class Department
{
	private String deaptName;
	private List<Student1> students;
	Department(String deptName, List<Student1> students)
	{
		this.deaptName = deptName;
		this.students = students;
		
	}
	
	public void getDepartmentInfo()
	{
		System.out.println("DeparmentName is === "+deaptName);
		for(Student1 student : students)
		{
			System.out.print(" "+student);
		}
	}
}