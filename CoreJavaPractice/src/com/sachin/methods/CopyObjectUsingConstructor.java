package com.sachin.methods;


public class CopyObjectUsingConstructor {

	public static void main(String ...st) {
		// TODO Auto-generated method stub
		TestCopy testCopy = new TestCopy(50);
		TestCopy copy = new TestCopy(testCopy);
		System.out.println(""+testCopy);
		System.out.println(""+copy);
		int arr[] = {1,2,3,4,5,6,7,8,9,10};
		testCopy.getFiveNumbers(arr);
		

	}

}

class TestCopy
{
	int a ;
	TestCopy(int a)
	{
		this.a =a ;
		
	}
	TestCopy(TestCopy ob)
	{
		a = ob.a;
	}
	public String toString()
	{
		return " "+a;
	}
	public void getFiveNumbers(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i] > 5)
			{
				System.exit(0);
			}
			System.out.println(arr[i]);
		}
	}
}