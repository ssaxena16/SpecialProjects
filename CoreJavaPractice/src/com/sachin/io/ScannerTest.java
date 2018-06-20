package com.sachin.io;

import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		/*System.out.println("Please Enter a integer");
		int a = scanner.nextInt();
		System.out.println("please enter a float value");
		float b = scanner.nextFloat();
		System.out.println("Please enter a string ");
		String str = scanner.next();
		
		System.out.println("Please enter a char");
		char ch = scanner.next().charAt(0);
		
		System.out.println(""+a+"  "+b+"  "+str+"  "+ch);*/
		int sum = 0;
		int count = 0;
		
		while(scanner.hasNextInt())
		{
			sum = sum + scanner.nextInt();
			count++;
		}
		double mean = sum/count ;
		System.out.println(mean);
		
		

	}

}
