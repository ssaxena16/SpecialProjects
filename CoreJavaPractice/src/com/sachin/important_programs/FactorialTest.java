package com.sachin.important_programs;

public class FactorialTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 5;
		int fact = 1;
		while (num > 0) {
			fact = fact * num;
			num--;
		}
		System.out.println(" Factoral is " + fact);
		num = 5;

		int numberFact = factorialNumber(num);
		System.out.println("Factorial Number using recursion " + numberFact);

	}

	public static int factorialNumber(int num) {
		if (num == 1 || num == 0) {
			return 1;
		} else {
			return num * factorialNumber(num - 1);
		}
	}

}
