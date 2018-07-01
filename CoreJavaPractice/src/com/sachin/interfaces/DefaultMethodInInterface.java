package com.sachin.interfaces;

public class DefaultMethodInInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Use use = new Use();
		use.m1();
		use.m2();
		First first = use;
		//first.m4(); can't call
		

	}

}

interface First
{
	public void m1();
	default void m2()
	{
		System.out.println("First Interface Default Method");
	}
	static void m3()
	{
		System.out.println("First static methods");
	}
}


interface Second
{
	//public void m1();
	default void m2()
	{
		System.out.println("Second Interface Default Method");
	}
	static void m3()
	{
		System.out.println("Second static methods");
	}
	
}

class Use implements First, Second
{
  @Override
public void m1() {
	// TODO Auto-generated method stub
	  System.out.println("Use class override First method");
	  First.m3();
	
}
 
  public void m2()
  {
	  System.out.println("We have to implement default method");
	  Second.super.m2();
  }
  public void m4()
	{
		System.out.println("Use.m4()");
	}
} 