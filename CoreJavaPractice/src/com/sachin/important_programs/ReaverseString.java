package com.sachin.important_programs;

import com.sachin.string.ReverseString;

public class ReaverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Sachin";
		StringBuilder sb = new StringBuilder(str);
		str = sb.reverse().toString();
		System.out.println("Reverse a string uing String builder  " + str);
		// using for loop
		String str1 = "";
		for (int i = str.length() - 1; i >= 0; i--) {

			str1 = str1 + str.charAt(i);

		}
		System.out.print("Using for loop " + str1);
		System.out.println("");

		// using recursion

		str = reverse(str1);
		System.out.println("Using recursion " + str);

	}

	public static String reverse(String str) {
		if (str.length() == 1) {
			return str;
		} else {
			return str.substring(str.length() - 1) + reverse(str.substring(0, str.length() - 1));
		}

	}

}
