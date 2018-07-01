package com.sachin.interfaces;

public class AbstractClassTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Drived drived = new Drived(5);
		drived.m1();
		drived.m2();

	}

}

abstract class Base
{
	int a;
	Base(int a)
	{
		this.a = a;
	}
	public final void m1()
	{
		System.out.println(a);
	}
	
	abstract public void m2();
}

class Drived extends Base
{
	public Drived( int a) {
		// TODO Auto-generated constructor stub
		super(a);
	}
	@Override
	public void m2() {
		// TODO Auto-generated method stub
		System.out.println("m2");
		
	}
}