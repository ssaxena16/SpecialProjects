package com.sachin.inheritance;

public class OverloadinInInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		D d = new D();
		d.m1(56.23);
		d.m1(16);

	}

}
class S
{
	public void m1(int m1)
	{
		System.out.println(m1);
	}
}
class D extends S
{
	public void m1(double m2)
	{
		System.out.println(m2);
	}
}
