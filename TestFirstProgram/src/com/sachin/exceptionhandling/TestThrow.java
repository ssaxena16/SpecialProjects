package com.sachin.exceptionhandling;

import java.io.FileNotFoundException;
import java.io.IOException;

class ThrowException
{
	public void testThrow(int testvar) throws FileNotFoundException,IOException
	{
		if(testvar<0)
		{
			System.out.println("test");
		throw new FileNotFoundException("TestMeassage");	
		}
		else
		{
		throw new IOException("io exceprion found");
		}
		
	}
	public void test( int age) throws ArithmeticException
	{
		if(age<18)
		{
			throw new ArithmeticException("Not Valid");
		}
	}
}


public class TestThrow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThrowException te = new ThrowException();
		te.test(17);
		try
		{
		te.testThrow(6);
		}
		catch(FileNotFoundException e)
		{
			System.out.println("Test123");
			e.printStackTrace();
		}
		catch (IOException e) {
			// TODO: handle exception
	e.printStackTrace();
		}
		
		
		
	}

}
