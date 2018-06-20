package com.sachin.oops;

public class RunTimePolymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      First first = new First();
      first.commonInfo(); // 
      first = new Second();// Upcating 
      first.commonInfo();
      System.out.println(""+first.x);// So overriding not supported in data-type

	}

}

class First 
{
	int x = 16;
	public void commonInfo()
	{
		System.out.println("A Info");
	}
}
class Second extends First
{
	 int x =20;
	public void commonInfo()
	{
		System.out.println("B Info");
	}
}