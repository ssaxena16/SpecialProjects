package com.sachin.exception;

import java.io.IOException;

public class OverriseExceptionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class A
{
	public void display() throws Exception
	{
		
	}
}
class B extends A
{
	public void display() throws IOException
	
	{
		
	}
}

class C
{
	public void m1() 
	{
	/*	try
		{
			throw new IOException();
		}
		catch(IOException e)
		{
			
		}
*/		
	}
}

class D extends C
{
	public void m1()
	{
		try
		{
			throw new IOException();
		}
		catch(IOException e)
		{
			
		}
		catch(Exception e)
		{ 
			
		}
	}
}