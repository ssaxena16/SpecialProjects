package com.sachin.important_programs;

import java.util.Scanner;

public class PrimeNumberTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a no to check it is prome ?");
		int num = sc.nextInt();
		boolean flag = false;
		for (int i = 2; i < num; i++) {
			if (num % i == 0 || num == 1 || num ==2) {
				System.out.println("It is not a prime no");
				flag = true;
				break;
			}
		}
		if (!flag) {
			System.out.println("No is prime no");
		}

	}

}
