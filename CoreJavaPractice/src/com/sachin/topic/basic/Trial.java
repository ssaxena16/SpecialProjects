package com.sachin.topic.basic;

import java.util.Enumeration;

//
//public class Trial {
//
//}
// So if class is public then you should also create a file  name as class name otherwise you can can compile it with 
// file name and run with class name.
public class Trial
{
	enum Color
	{
		RED, GREEN,YELLOW;
		
		private Color()
		{
			System.out.println("Enum constructor");
		}
	}
	public static void main(java.lang.String args[])
	{
		System.out.println("Class A is mentioned");
		for(Color c : Color.values())
		{
			System.out.println(c);
		}
		B.testB();
		//B b = new B();
		//b.testB();
	}
	
}
class B 
{
	public static void main(String args[])
	{
		System.out.println("Class B is mentioned");
	}
	
	public static void testB()
	{
		System.out.println("B");
		
	}
}

class String
{
	public static void main(java.lang.String args[])
	{
		System.out.println("String user define class");
	}
	
}