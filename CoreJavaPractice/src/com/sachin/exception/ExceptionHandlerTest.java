package com.sachin.exception;

public class ExceptionHandlerTest {
	
    static int devide(int a, int b)
    {
    	return a/b;
    }
    static int compute(int a, int b)
    {
    	int value = 0;
    	try
    	{
    		value = devide(a,b);
    	}
    	catch(NumberFormatException e)
    	{
    		System.out.println("Number format exceprion");
    		e.printStackTrace();
    	}
    	return value;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			int computeValue = compute(5,0);
			System.out.println(""+computeValue);
		}
		catch(ArithmeticException ae)
		{
			System.out.println("Arithmatic exception");
			ae.printStackTrace();// exception name and description
			ae.getMessage(); // exception name
			System.out.println(""+ae.toString()); // exception description
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println("Main Exceprion class handle the exception");
		}
		finally {
			System.out.println("This block must be executed");
		}

	}

}
