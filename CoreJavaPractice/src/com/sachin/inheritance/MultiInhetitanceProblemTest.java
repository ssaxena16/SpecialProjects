package com.sachin.inheritance;

public class MultiInhetitanceProblemTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child child = new Child();
		child.foo();
		child.display();

	}

}

interface Parent1
{
	default void display()
	{
		System.out.println("Parent1 Display");
	}
	public void foo();
}
interface Parent2
{
	default void display()
	{
		System.out.println("Parent2 display");
	}
	public void foo();
}

class Child implements Parent1, Parent2
{
	public void foo()
	{
		System.out.println("foo Child class function");
	}
	public void display()
	{
		Parent1.super.display();
		Parent2.super.display();
		
	}
	
	
}