package com.sachin.oops;

import java.io.IOException;

public class OverridingTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent parent = new Parent();
		parent = new Child();
		parent.m2();

	}

}

class Parent
{
	public void conceptOverride() 
	{
		
	}
	public static void m2()
	{
	System.out.println("Parent static");	
	}
	
	private void test()
	{
		
	}
}

class Child extends Parent
{
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