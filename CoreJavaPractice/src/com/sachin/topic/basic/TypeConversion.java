package com.sachin.topic.basic;

public class TypeConversion {

	public static void main(java.lang.String[] args) {
		// TODO Auto-generated method stub
		short i = 10;
		short j = 10;
		short k = (short)(i+j);
		System.out.println(""+k);
		
		int p = 50;
	   // automatic type conversion 
		float f = p ; 
		// explicit conversion
		 int s = (int)f;
		 
		 
		 Integer n = null;
		 Integer d = 10;
		 
		 System.out.println(n instanceof Integer );
		 System.out.println( d  instanceof Integer );
		 
		TestNull testNull = null;
		//testNull.test();
		testNull.test1();
		

	}

}

class TestNull
{

	public void test()
	{
		//static int t = 4;

		System.out.println("Methid can not call through null object reference");
	}
	public static void test1()
	{
		System.out.println("Static Methid can  call through null object reference");
	}
}