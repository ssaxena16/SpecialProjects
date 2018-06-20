package com.sachin.oops;

public class Overloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverLoadTest overload = new OverLoadTest();
		overload.m1();
		overload.m1(5, "OverloadingExample");

	}

}

class OverLoadTest 
{
	public void m1()
	{
		System.out.println("public M1");
	}
	public  void m1(int a, String b)
	{
		System.out.println(b);
		
	}
	public void m1(String a, int b)
	{
		System.out.println(a);
		
	}
	
}