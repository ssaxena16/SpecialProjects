package com.sachin.innerclass;

import com.sachin.innerclass.Outer1.TestOuter1;

interface Outer1
{
	class TestOuter1
	{
		public static void test()
		{
			System.out.println("Test");
		}
		public  void test1()
		{
			System.out.println("Test1");
		}
	}
}

class Second1 implements Outer1
{
	
}
public class TestInterfaceClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer1.TestOuter1.test();
		Outer1.TestOuter1 test  = new TestOuter1();
		test.test1();

	}

}
