package com.sachin.teststring;

public class TestRecursionReverseString {

	String reverseString(String str1, int length1) {
		String str = str1;
		int length = length1;
		if (length == 0) {
			return str;
		} else {
			return str.substring(length - 1, length) + reverseString(str.substring(0, length - 1), length - 1);
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TestRecursionReverseString ts = new TestRecursionReverseString();
		String str1 = ts.reverseString("Sachin", 6);
		System.out.println("" + str1);

	}

}
