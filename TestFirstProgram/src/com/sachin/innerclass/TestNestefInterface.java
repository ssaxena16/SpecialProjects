package com.sachin.innerclass;

interface TestInterface1
{
	interface TestInner
	{
		void msg();
	}
}
class Testclass1 implements TestInterface1.TestInner
{
	public void msg()
	{
		System.out.println("Inner method");
	}
	
}
public class TestNestefInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
		TestInterface1.TestInner test = new Testclass1();
		test.msg();
	}

}
