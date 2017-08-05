package com.javatpoint.stringexamples;

public class Test23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1 = "SachinSaxena";
		String str2 ="SaxenaSachin";
		
		String str3 = str1 + str1;
		
		if(str1.length() != str2.length())
		{
			System.out.println("NO rotation");
		}
		else if(str3.contains(str2))
		{
			System.out.println("Yes str2 is rotation of str1");
		}
		else
		{
			System.out.println("No str2 is rotation of str1");
		}
	}

}
