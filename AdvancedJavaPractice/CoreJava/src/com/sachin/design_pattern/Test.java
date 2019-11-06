package com.sachin.design_pattern;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test(12, 3);

	}

	public static void test(int num, int times) {
		String number = String.valueOf(num);
		for (int i = 1; i < times; i++) {
			number = number + String.valueOf(num);
		}

		System.out.println(" " + number);
		System.out.println("  " + getNo(Integer.parseInt(number)));
	}

	public static int getNo(int num) {
		if (num / 10 == 0) {
			return num;
		} else {
			int sum = 0;
			while (num > 0) {
				int rem = num % 10;
				num = num / 10;
				sum = sum + rem;
			}
			return getNo(sum);

		}

	}

}
