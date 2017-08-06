package com.sachin.collection2;

import java.util.Map;
import java.util.TreeMap;

class Faculty
{
	int id;
	String name;
	String dept;
	public Faculty(int id, String name, String dept)
	{
		this.id = id;
		this.name = name;
		this.dept = dept;
	}
	public String toString()
	{
		return (" "+id+"  "+name+"  "+dept);
	}
}
public class TestTreeMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Faculty faculty = new Faculty(1, "Rohit", "Math");
		Faculty faculty1 = new Faculty(3, "Mohit", "English");
		Faculty faculty2 = new Faculty(2, "Shobhit", "Science");
		
		Map<Integer, Faculty> treemap =new TreeMap<Integer, Faculty>();
		treemap.put(2, faculty);
		treemap.put(1, faculty1);
		treemap.put(3, faculty2);
		
		for(Map.Entry<Integer, Faculty> mapentry : treemap.entrySet())
		{
			System.out.println("  "+mapentry.getKey()+"   "+mapentry.getValue());
		}
		
		

	}

}
