package com.sachin.exception;

public class ExceptionFlows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			String str = null;
			System.out.println(str.length());
		}
		catch(ArithmeticException e)
		{
			e.printStackTrace();
			System.out.println("Exception caught");
		}
		finally {
			System.out.println("finally block execute");
		}

	}

}
