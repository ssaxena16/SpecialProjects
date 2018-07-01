package com.sachin.exception;

public class ThrowExample {
	public static void foo()
	{
		try
		{
		throw new NullPointerException();
		}
		catch(NullPointerException e)
		{
			System.out.println("NullPointer Exception caught in function");
			throw e; // rethrow an error
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
		foo();
		}
		catch(NullPointerException e)
		{
			System.out.println("NullPointerException caught in main");
		}
		

	}

}
