package com.sachin.keywords;

public class StaticUseExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student.setClgName("AKGEC"); 
		Student st1 = new Student(101, "Rohit");
		Student st2 = new Student(102, "Mohit");
		System.out.println(st1);
		System.out.println(st2);

	}

}

class Student
{
	int rollNo;
	String name;
	static String clgName;
	Student(int rollNo,String name)
	{
		this.rollNo = rollNo;
		this.name = name;
	}
	static void setClgName(String clgName1)
	{
		clgName = clgName1;
	}
	public String toString()
	{
		return ""+rollNo+"  "+name+"  "+clgName;
	}
}