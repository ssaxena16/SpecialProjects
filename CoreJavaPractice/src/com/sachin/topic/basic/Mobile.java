package com.sachin.topic.basic;

public class Mobile {

	public static void main(java.lang.String[] args) {
		// TODO Auto-generated method stub
		Test.test2();
		
		Test test = new Test();
		test.test();

	}
	public void call()
	{
		System.out.println("Call is working");
	}
	public static void callStatic()
	{
		System.out.println("Test.........");
	}

}

class Test
{
	Mobile mobile;
//	public Test(Mobile mob)
//	{
//		this.mobile = mob;
//	}
	public void test()
	{
		mobile.callStatic();
	//mobile.call();
	}
	public static void test2()
	{
		System.out.println("Test2");
	}
}
