package com.sachin.oops;

public class EncapsulationData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student = new Student();
		student.setName("Tsting");
		student.setRollNo(115);
		System.out.println(student.getName());
		System.out.println(student.getRollNo());

	}

}

class Student
{
	private String name;
	private int rollNo;
	
	public void setName(String name)
	{
	this.name = name ;
	}
	public void setRollNo(int rollNo)
	{
		this.rollNo  = rollNo;
	}
	public String getName()
	{
		return name;
	}
	public int getRollNo()
	{
		return rollNo;
	}
}