package com.sachin.exceptionhandling;

class MyException extends Exception
{
	public MyException(String msg)
	{
		super(msg);
	}
}

class TestCustom
{
	public void ageTest(int age) throws MyException
	{
      if(age<18)
      {
    	  throw new MyException("Invalid age for vote");
      }
      else
      {
    	  System.out.println("Please vote");
      }
	}
}
class Test134 extends TestCustom
{
	public void ageTest(int age) 
	{
		
	}
}
public class CustomException {

	public static void main(String[] args) throws MyException {
		// TODO Auto-generated method stub

		TestCustom test = new TestCustom();
		try
		{
		test.ageTest(17);
		}
		catch(MyException e)
		{
			e.printStackTrace();
		}
		System.out.println("Age Factor test");
	}

}
