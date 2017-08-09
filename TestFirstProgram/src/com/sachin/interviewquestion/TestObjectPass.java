package com.sachin.interviewquestion;

// java does not support pass by reference but when we pass as reference then it make a copy og refrerence
class TestObj
{
	int dataInt;
	String testString;
	
	public void dataCheck(TestObj obj)
	{
		obj.testString.concat("india");
	}
	public void dataCheck1(int data)
	{
		data = 20+data;
	}
}
public class TestObjectPass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestObj testobj = new TestObj();
		/*System.out.println("Before data change"+testobj.dataInt);
		testobj.dataCheck(testobj);
		System.out.println("After data change"+testobj.dataInt);*/
		testobj.testString="First";
		System.out.println(""+testobj.testString);
		testobj.dataCheck(testobj);
		System.out.println(""+testobj.testString);

		System.out.println(""+testobj.testString);
		int a=50;
		System.out.println(""+a);
		testobj.dataCheck1(a);
		System.out.println(""+a);
		
	}

}
