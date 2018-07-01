package com.sachin.interfaces;

public class NestedInterfaceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child child = new Child();
		GrandParent.Parent parent= child;
          parent.m1();
	}

}

interface GrandParent
{
	interface Parent
	{
		void m1();
	}
	public void m2();
}

class Child implements GrandParent.Parent
{
	public void m1()
	{
		System.out.println("m2 fuction ");
	}
}