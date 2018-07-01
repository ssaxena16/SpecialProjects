package com.sachin.interfaces;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComparatorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student> list = new ArrayList<>();
		list.add(new Student(120, "First"));
		list.add(new Student(103, "Mohit"));
		list.add(new Student(105, "Ajay"));
		list.add(new Student(101, "XYZ00"));
		Collections.sort(list, new SortByRollNo());
		System.out.println("Sort By Roll No");
		for(Student st : list)
		{
			System.out.println(st);
		}
		System.out.println("Sort By Name");
		Collections.sort(list, new SortByName());
		for(Student st : list)
		{
			System.out.println(st);
		}
	}

}

class Student
{
	int rollNo;
	String name;
	Student(int rollNo, String name)
	{
		this.rollNo = rollNo;
		this.name = name;
	}
	public String toString()
	{
		return rollNo +"  "+name;
	}
}

class SortByRollNo implements Comparator<Student>
{
	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return o1.rollNo - o2.rollNo;
	}
}

class SortByName implements Comparator<Student>
{
	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return o1.name.compareTo(o2.name);
	}
}