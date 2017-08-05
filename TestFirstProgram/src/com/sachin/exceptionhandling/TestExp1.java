package com.sachin.exceptionhandling;

class ExpTest
{
	public void numberFormat(int a, int b) throws ArithmeticException
	{
	 int result = a/b;
	 String ts = String.valueOf(result);
	}
}
public class TestExp1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ExpTest extest = new ExpTest();
		try
		{
		extest.numberFormat(5, 0);
		}
		catch(ArithmeticException e)
		{
			e.printStackTrace();
		}
		System.out.println("Test");
	}

}
