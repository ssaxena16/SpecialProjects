package com.sachin.exceptionhandling;

public class Testblock {
	
	public void test()
	{
		try
		{
			int a=5;
			int b=0;
			int c = a/b;
			System.out.println("test1");
			return;
			//System.out.println("test1");
		}
		catch(Exception e)
		{
			System.out.println("test1jkjk");
			return;
		}
		finally
		{
			System.out.println("tesrt");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Testblock ts1 = new Testblock();
		ts1.test();
		

	}

}
