package com.sachin.methods;

public class DefaultMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Base base = new Base();
		base.getInfo();
		//base.parentMethod();
		base.show();

	}

}

interface  Parent
{
	public void getInfo();
	default void parentMethod()
	{
		System.out.println("Parent Interface");
	}
	static void first()
	{
		System.out.println("It is Parent static method");
	}
}

interface Parent2
{
	default void parentMethod()
	{
		System.out.println("Parent Interface");
	}
	static void first()
	{
		System.out.println("It is Parent2 static method");
	}
}

class Base implements Parent, Parent2
{
	public void getInfo()
	{
		System.out.println("Interface method implemented");
	}
	
	public void show()
	{
		Parent.first();
		Parent.super.parentMethod();
		Parent2.first();
	}

	@Override
	public void parentMethod() {
		// TODO Auto-generated method stub
		Parent.super.parentMethod();
	}
	
}