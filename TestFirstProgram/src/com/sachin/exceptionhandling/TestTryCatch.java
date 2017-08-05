package com.sachin.exceptionhandling;
class TestTry
{
	public void checkNo(int a , int b)
	{
		try
		{
		int result = a/b;
		System.out.println(""+result);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		System.out.println("Divided two no success");
	}
	
}

public class TestTryCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestTry test = new TestTry();
		test.checkNo(5, 0);

	}

}
