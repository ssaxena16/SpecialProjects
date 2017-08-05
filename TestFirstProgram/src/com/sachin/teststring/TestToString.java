package com.sachin.teststring;


class Student
{
	int rollno;
	String name;
	int phno;
 public Student(int rollno, String name, int phno)
 {
	 this.rollno=rollno;
	 this.name = name;
	 this.phno =phno;
 }
 public String toString()
 {
	 return rollno+" , "+name+" , "+phno;
 }
}
public class TestToString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student st =new Student(101, "Saasha", 8052);
		System.out.println(st);

	}

}
