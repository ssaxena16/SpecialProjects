package com.sachin.exceptionhandling;

import java.io.IOException;

class TestPro
{
	void A()throws IOException
	{
		B();
	}
	void B()throws IOException
	{
		C();
	}
	void C()throws IOException
	
	{
		throw new IOException("Test");
	}
}
public class TestPropogation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TestPro testp = new TestPro();
		try
		{
		testp.A();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
