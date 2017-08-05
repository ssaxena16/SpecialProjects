package com.sachin.exceptionhandling;

public class TestFinalize {
	
	public void finalize()
	{
		System.out.println("finalize");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TestFinalize tf = new TestFinalize();
		tf= null;
		System.gc();
	}

}
