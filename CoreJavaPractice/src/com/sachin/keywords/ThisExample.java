package com.sachin.keywords;

public class ThisExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		First first = new First();
		first.first();
		Second second = new Second();
		

	}

}

class First
{
	int a ;
	First()
	{
		this(5);
		System.out.println("It is first class Default constructor");
	}
	First(int a)
	{
		//this();
		this.a=a; // refer to current object
		System.out.println("First class, Argument Constructor");
	}
	First( Second second)
	{
		second.second();
	}
	public void display()
	{
		System.out.println("Display method execute");
	}
	public void first()
	{
		this.display();
	}
	
}

class Second
{
	First first;
  Second()
  {
	  first = new First(this);
  }
  public void second()
  {
	  System.out.println("Second Methos");
  }
}