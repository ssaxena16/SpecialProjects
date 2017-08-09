package com.sachin.interviewquestion;

class ParentTest
{
	public ParentTest()
	{
		System.out.println("Parent Constructor");
	}
}
class TestStaticConcept extends ParentTest
{
	int a=50;
	public TestStaticConcept()
	{
		super();
		System.out.println("Constructor Block");
	}
	public static void testStatic()
	{
		TestStaticConcept tsc = new TestStaticConcept();
		System.out.println(""+tsc.a);
	}
	static
	{
		System.out.println("Static bolck");
	}
	static
	{
		System.out.println("Second Static block");
	}
	{
		System.out.println("Instance Block");
	}
	
}
public class StaticConcept {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestStaticConcept.testStatic();

	}

}
