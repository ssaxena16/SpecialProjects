package com.sachin.oops;

public class Operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=5;
		int b=8;
		if(a < b | a++>b) // bitwise OR
		{
			System.out.println("Value usinfg bitwise operator"+a);
		}
		a=5;
		if(a < b || a++>b) // logical OR
		{
			System.out.println("Value using Logical operator"+a);
		}
		a = a << 2;// left shift
		System.out.println(a);
		
		Operator op = new Operator();
		
		if(op instanceof Operator) // instaceof operator
		{
			System.out.println("Operator class");
		}
		else
		{
			System.out.println("Other class");
		}
		
	}

}
