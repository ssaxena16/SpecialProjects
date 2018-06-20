package com.sachin.string;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "Sachin";
		System.out.println("reverse String using recursion = "+reverse(str1));
		System.out.println("Reverse strig charToArray "+reverseChar(str1));
		

	}
	public static String reverse(String str)
	{
		if (str.length()==1)
		{
			return str;
		}
		else
		{
			return str.substring(str.length()-1)+ reverse(str.substring(0, str.length()-1));
		}
	}
	
	public static String reverseChar(String str)
	{
		char[] input = str.toCharArray();
		String st = "";
		for(int i= input.length-1 ; i>= 0 ; i= i-1 )
		{
			st = st+ input[i];
		}
		return st;
	}

}
