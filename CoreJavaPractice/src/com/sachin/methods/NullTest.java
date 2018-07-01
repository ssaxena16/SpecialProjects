package com.sachin.methods;

public class NullTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Method method = new Method();
		//method.m1(null); comiler error because compiler does'nt know which method it should be call.
        Integer arg = null;
        method.m1(arg);
        // method.m2(null); compiler error because we can not assign nulll value primitive data
	   Integer t = 7;
        method.m3(t);
        short s = 4;
        method.m4(s);
	}

}

class Method
{
	public void m1(Integer i)
	{
	System.out.println("m1 methos");	
	}
	public void m1(String str)
	{
		System.out.println("m2 Method");
	}
	public void m2(int a)
	{System.out.println("int method");
		
	}
	public void m2(double a)
	{
		System.out.println("double method");
	}
	
	public void m3(Integer a)
	{
		System.out.println("m3 Integer method");
	}
	public void m3(int a)
	{
		System.out.println("m3 int  method");
	}
	public void m4(short a)
	{
		System.out.println("m4 short  method");
	}
	public void m4(int a)
	{
		System.out.println("m4 int  method");
	}
	
}