package com.sachin.array;

import java.util.Arrays;

public class ArrayEqualsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student1 st1  = new Student1(101, "Student1");
		Student1 st2  = new Student1(102, "Student2");
		Student1 st3  = new Student1(103, "Student3");
		Student1[] studentArray = {st1,st2,st3};
		Student1 st4  = new Student1(101, "Student1");
		Student1 st5  = new Student1(102, "Student2");
		Student1 st6  = new Student1(103, "Student3");
		Student1[] studentArray2 = {st4,st5,st6};
		if(Arrays.equals(studentArray, studentArray2))
		{
			System.out.println("Same Array");
		}
		else
		{
			System.out.println("Different Array");
		}


	}

}

class Student1
{
	int rollNo;
	String name;
	Student1(int rollNo, String name)
	{
		this.rollNo = rollNo;
		this.name = name;
		
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		Student1 student = (Student1)obj;
		return this.rollNo == student.rollNo && this.name.equals(student.name);
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}
}