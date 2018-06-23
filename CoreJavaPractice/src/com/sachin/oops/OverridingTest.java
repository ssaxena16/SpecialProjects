package com.sachin.oops;

import java.io.IOException;

public class OverridingTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent parent = new Parent();
		parent = new Child();
		System.out.println(""+parent.a);
		System.out.println(""+new Child().a);
		parent.m2();

	}

}

class Parent
{
	 int a = 15;
	public void conceptOverride() 
	{
		
	}
	public static void m2()
	{
	System.out.println("Parent static");	
	}
	
	protected void test()
	{
		
	}
}

class Child extends Parent
{
	int a = 21;
	public void conceptOverride() 
	{
		
	}
	
	public static  void m2() 
	{
		System.out.println("Child static");
	}
	 
	public void test()
	{
		
	}
}