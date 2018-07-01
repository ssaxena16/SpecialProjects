package com.sachin.exception;

public class DevideByZeroExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a = 10;
		//double c = a/0;
		System.out.println("Double result "+ a/0); // result infinity
		
		// now using int
		int b = 10;
		System.out.println("int result "+b/0); // throw an exception Airthmatic devide by zero

	}

}
