package com.sachin.core_java;

public class SwapTwoStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "Sachin";
		String str2 = "Saxena";
		swapStrings(str1, str2);

	}

	public static void swapStrings(String str1, String str2) {
		System.out.println("Before swapiing two strings");
		System.out.println("str1 =>>> " + str1 + "  str2  =>>> " + str2);
		str1 = str1 + str2;
		str2 = str1.substring(0, str1.length() - str2.length());
		str1 = str1.substring(str2.length());
		System.out.println("After swapiing two strings");
		System.out.println("str1 =>>> " + str1 + "  str2  =>>> " + str2);
	}

}
