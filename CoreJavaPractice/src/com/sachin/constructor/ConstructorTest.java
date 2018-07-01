package com.sachin.constructor;

public class ConstructorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a1 = new A();
		A a2 = new A(5,8);
		System.out.println(a1);
		System.out.println(a2);
}

}
class A
{
	int a,b;
	A()
	{
		System.out.println("Default constructor");
	}
	A(int a, int b)
	{
		System.out.println("Paremetrized constructor");
		this.a = a;
		this.b = b;
	}
	public String toString()
	{
		return a+" "+b;
	}
	
}
