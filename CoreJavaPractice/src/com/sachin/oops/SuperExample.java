package com.sachin.oops;

public class SuperExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Second1 second  = new Second1(5,6,8);
		System.out.println(second.value);
		second.value();

	}

}

class First1
{
	static int value = 10;
	int a,b;
	First1(int a, int b, int c)
	{
		this.a=a;
		System.out.println("Parent class constructor");
	}
	
}

class Second1 extends First1
{
	static int value = 20;
	//int a,b;
	Second1(int a,int b, int c )
	{
		super(a,b,c);
		//super();
//		this.a=a;
//		this.b = b;
		System.out.println("Sub class constructor");
	}
	public void value()
	{
		System.out.println(super.value);
		System.out.println(super.a);
	}
	
}