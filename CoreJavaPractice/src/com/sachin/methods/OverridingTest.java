package com.sachin.methods;

public class OverridingTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new B();
		//a.test1(); so private method is not override  
		B b = new B();
		b.test1();

	}

}

class A
{
	final public void test()
	{
		
	}
	private void test1()
	{
		System.out.println("private method A class");
		
	}
}
class B extends A
{
//	public void test()// can not override final method, compiler error
//	{
//		
//	}
	public void test1()
	{
		System.out.println("B class test1 method");
	}
}