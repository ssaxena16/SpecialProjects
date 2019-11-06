package com.sachin.core_java;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("  " + reverseString("Sachin"));

	}

	public static String reverseString(String str) {
		if (str.length() == 1)
			return str;
		else
			return str.substring(str.length() - 1) + reverseString(str.substring(0, str.length() - 1));
	}

}
