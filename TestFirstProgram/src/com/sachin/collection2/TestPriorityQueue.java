package com.sachin.collection2;

import java.util.Iterator;
import java.util.PriorityQueue;

class Student implements Comparable<Student>
{
	int id;
	String name ;
	int age;
	public Student(int id, String name, int age)
	{
		this.id = id;
		this.name = name;
		this.age = age;
		
	}
	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		if(this.age>o.age)
		{
			return 1;
		}
		else if(this.age<o.age)
		{
			return -1;
		}
		else
		return 0;
	}
	public String toString()
	{
		return (""+id +" "+name +" "+age);
	}
	
}
public class TestPriorityQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student student = new Student(101, "Mohit", 20);
		Student student1 = new Student(102, "Rohit", 21);
		Student student2 = new Student(103, "Sohit", 18);
		Student student3 = new Student(104, "Bohit", 22);
		PriorityQueue<Student> priorityqueue = new PriorityQueue<Student>();
		priorityqueue.add(student1);
		priorityqueue.add(student2);
		priorityqueue.add(student3);
		priorityqueue.add(student);
		
		Iterator<Student> itr = priorityqueue.iterator();
		while(itr.hasNext())
		{
			System.out.println(""+itr.next());
		}

	}

}
