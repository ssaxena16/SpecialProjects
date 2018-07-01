package com.sachin.inheritance;

public class DefaultMethodInInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C c = new  C();
		c.foo();

	}

}
interface Parent 
{
	default public void foo()
	{
		System.out.println("Parent foo");
	}
}

interface A extends Parent 
{
	default public void foo()
	{
		System.out.println("A foo");
	}
	
}

interface B extends Parent
{
	default public void foo()
	{
		System.out.println("A foo");
	}
	
}

class C implements A, B
{
	public void foo()
	{
		A.super.foo();
	}
}