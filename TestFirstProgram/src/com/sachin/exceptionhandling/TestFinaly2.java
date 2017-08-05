package com.sachin.exceptionhandling;

class FinalTest12
{
	public void test()
	{
	try
	{
		System.out.println("Test");
		try
		{
			
		}
		catch(Exception e)
		{
		System.exit(0);	
		}
		finally
		{
			System.out.println("Testfinal1");
		}
		
	}
	
	finally
	{
		
	}
	}
}
public class TestFinaly2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FinalTest12 ftest = new FinalTest12();
		ftest.test();

	}

}
