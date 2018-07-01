package com.sachin.inheritance;

public class FinalFunctionInInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Second second = new Second(5, 6);
		System.out.println(second.getA());// so getA function get by Second object so final method can be inherited but not override.

	}

}

class First
{
	int a;
	First(int a)
	{
		this.a = a;
	}
	public final int getA()
	{
		return this.a;
	}
	public void test()
	{
		
	}
}

class Second extends First 
{
	int b;
	Second (int a, int b)
	{
		super(a);
		this.b=b;
	}
//	protected void test() //can not reduce the scope of method in overriding
//	{
//		
//	}
}


