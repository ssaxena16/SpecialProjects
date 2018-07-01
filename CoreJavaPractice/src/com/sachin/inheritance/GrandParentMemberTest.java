package com.sachin.inheritance;

public class GrandParentMemberTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child1 ch = new Child1();
		ch.m1();
		ChildParent chp = new Child1();
	//	chp.m3();

	}

}

class GrandParent
{
	int a =10;
	public void m1()
	{
		System.out.println("M1 in Grandparent");
	}
	
}
class ChildParent extends GrandParent
{
	public void m1()
	{
		super.m1();
		System.out.println("M2 in Child parent");
	}
	private void m3()
	{
		
	}
	protected void m4()
	{
		
	}
	
}
class Child1 extends ChildParent
{
	public void m2()
	{
		System.out.println(""+a);
	}
	public void m1()
	{
		super.m1();
		System.out.println("M1 in Child");
	}
	private void m3()
	{
		
	}
	protected void m4()
	{
		
	}
	
}