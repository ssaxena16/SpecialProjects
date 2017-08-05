package com.sachin.exceptionhandling;

import java.io.IOException;

class CheckedTest
{
	void A() throws IOException
	{
		System.out.println("Test");
		throw new IOException("hjfjhf");
		//throw new ArithmeticException("Got Exception/mjkljlk");
	}
	public void B() throws IOException
	{
		
		A();
		
	}
}
public class TestChecked {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		CheckedTest ct = new CheckedTest();
		
		ct.B();	
		
	}

}
