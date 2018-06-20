package com.sachin.oops;

public class InitializeBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test test= new Test();

	}

}

class Test
{
	{
		System.out.println("It is intialixe block1");
	}
	{
		System.out.println("It is intialixe block2");
	}
	Test()
	{ 
		System.out.println("it is a constructor");
	}
	static 
	{
		System.out.println("It is static block1");
	}
	static 
	{
		System.out.println("It is static block2");
	}
}