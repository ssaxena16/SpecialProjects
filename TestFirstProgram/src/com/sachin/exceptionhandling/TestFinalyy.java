package com.sachin.exceptionhandling;
class FinalTest
{
	public void testFinal()
	{
		try
		{
		int a=5;
		int b=0;
		System.exit(0);
		int c = a/b;
		System.out.println(""+c);
		
		}
		
		
		finally
		{
			System.out.println("testFinal method execute");
		}
		
			}
}


public class TestFinalyy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FinalTest ftest = new FinalTest();
		ftest.testFinal();
	}

}
