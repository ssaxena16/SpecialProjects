package com.sachin.methods;

public class OverloadingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculation cal = new Calculation();
		System.out.println(""+cal.sum(8, 6));
		System.out.println(""+cal.sum(8, 5, 11));
		System.out.println(""+Calculation.multiply(5));
		System.out.println(""+Calculation.multiply(5, 8));
		double devisionValue1 = cal.devide(20.5, 5);
		System.out.println(devisionValue1);

	}

}

class Calculation
{
	int sum(int a, int b)
	{
		return a+b;
	}
	int sum(int a, int b, int c)
	{
		return a+b+c;
	}
	static int multiply(int a)
	{
		return 5*a;
	}
	static int multiply(int a, int b)
	{
		return a*b;
	}
	/*int multiply(int a, int b)// can not make duplicate
	{
		return 89;
	}*/
	/*int test(int a)
	{
		return 5;
	}
	float test(int a)
	{
		return 5.0;
	}*/
	double devide(double a, int b)
	{
		System.out.println("first");
		return a/b;
	}
	double devide(float a, int b)
	{
		System.out.println("second");
		return a/b;
	}
}