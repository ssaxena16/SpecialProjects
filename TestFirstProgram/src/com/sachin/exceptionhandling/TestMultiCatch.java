package com.sachin.exceptionhandling;
class MultiCatch
{
	int arr[] = new int[5];
	public void testNumber(int a,int b)
	{
		try
		{
		arr[5]= a/b;
		System.out.println(""+arr[5]);
		}
		catch(ArithmeticException e){System.out.println("Arthmatic exception");}
		catch(ArrayIndexOutOfBoundsException ae){System.out.println("Array index out of bound");}
		catch(Exception e){System.out.println("parent Exceptionm");}
		
	}
}
public class TestMultiCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MultiCatch mc = new MultiCatch();
		mc.testNumber(5, 2);
	}

}
