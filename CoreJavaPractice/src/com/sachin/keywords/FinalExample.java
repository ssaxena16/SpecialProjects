package com.sachin.keywords;

public class FinalExample {
	final int VALUE = 50; // like a constant
	final int a ;
	final static int c ; 
	FinalExample(int a1)
	{
		a = a1;
	}
	public FinalExample() {
		// TODO Auto-generated constructor stub
		a = 10;// if two constructor in class then final variable initialize in all the constructor
	}
	public void display()
	{
		final int b ;
		b=56; // local final variable 
		// VALUE = 96; it should be a compilation error
		System.out.println(""+VALUE);
		System.out.println(""+b);
	}
	static
	{
		c = 48;
	}
	public static void staticMethod()
	{
		// c = 89; compilation error. 
		System.out.println("It is a static method"+c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FinalExample finalExample = new FinalExample(55);
		System.out.println(finalExample.a);
		finalExample.display();
		FinalExample.staticMethod();
		
		

	}

}

class A
{
	final public void method1()
	{
		
	}
	
}

class B extends A // can not extends
{
//	public void method1()  // can not override a method
//	{
//		
//	}
}