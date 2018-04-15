package com.sachin.topic.constructor;

public class CopyConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentInformation studentInformation = new StudentInformation(55, "Raj Kumar", 16);
		System.out.println("Student Information== " + studentInformation);
		StudentInformation copyStudentInformationObject = new StudentInformation(studentInformation);
		System.out.println("Copy of an Object of Student Information=== " + copyStudentInformationObject);

	}

}

class StudentInformation {
	int rollNo;
	String name;
	int age;

	public StudentInformation(int rollNo, String name, int age) {
		// TODO Auto-generated constructor stub
		this.rollNo = rollNo;
		this.name = name;
		this.age = age;
	}

	public StudentInformation(StudentInformation st) {
		this.rollNo = st.rollNo;
		this.name = st.name;
		this.age = st.age;
	}

	public String toString() {
		return rollNo + "   " + name + "   " + age;
	}
}
