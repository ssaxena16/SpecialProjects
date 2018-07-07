package com.sachin.collection;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeSet<String> tset = new TreeSet<String>();
		//tset.add(null);
		tset.add("Ram");
		tset.add("Shyam");
		tset.add("Ajay");
		tset.add("Beesa");
		System.out.println(tset);
		
		TreeSet<Student> treeStudent = new TreeSet<Student>(new StudentName());
		treeStudent.add(new Student(101, "Ram"));
		treeStudent.add(new Student(98, "Shyam"));
		treeStudent.add(new Student(311, "Ajay"));
		treeStudent.add(new Student(2, "Navya"));
		treeStudent.add(new Student(2, "Navya"));

		
		for(Student st : treeStudent)
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
		return rollNo+ "   "+name; 
	}
//	@Override
//	public int compareTo(Student o) {
//		// TODO Auto-generated method stub
//		return this.rollNo - o.rollNo;
//	}
	
}

class StudentRollNo implements Comparator<Student>
{

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return o1.rollNo - o2.rollNo;
	}
	
}



class StudentName implements Comparator<Student>
{

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return o1.name.compareTo(o2.name);
	}
	
}

