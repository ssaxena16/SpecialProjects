package com.sachin.oops;

public class ThisTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new A();
		System.out.println(a);
	    System.out.println(a.getA());
	    B b = new B();

	}

}

class A
{
	int a, b;
	B obj;
	A()
	{
		this(5,6);
		System.out.println("Without argument constructor");
	//	this(5,6); // compilation error because this will be first statement
		
	}
	A(int a, int b)
	{
		this.a= a; // refer to current instance of the class
		this.b =b;
		System.out.println("Parametrized constructor");
		
	}
	A(B obj)
	{
		this.obj = obj;
		obj.dispaly();
	}
	public String toString()
	{
		return a+" "+b;
	}
	public A getA() // return current object of the class
	{
		return this;
	}
	
	
	
}

class B
{
	A ob;
	B()
	{
	ob = new A(this);
	}
	public void dispaly()
	{
		System.out.println("Call B from A class");
	}
}