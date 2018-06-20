package com.sachin.string;

public class StringCompare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "Sachin";
		String str2 = "Sachin";
		String str3 = new String("Sachin");
		String str4 = str3.intern();
		
		if (str1 == str4)
		{
			System.out.println("Intern Methos return same address");
		}
		else
		{
			System.out.println("Address are different");
		}
		
		if (str1 == str3)
		{
			System.out.println("Can compare Object using ==");
		}
		else
		{
			System.out.println("Can not compare Object using ==");
		}
		
		if (str2.equals(str3))
		{
			System.out.println("Value of String are same");
		}
		else
		{
			System.out.println("Values are not same");
		}
		String str5 = "Sachin";
		String str6 = "Saxena";
		if (str5.compareTo(str6) == 0)
		{
			System.out.println("String str5 and str6 are same");
		}
		else if (str5.compareTo(str6)> 0)
		{
			System.out.println("str5 is greate than str6");
		}
		else
		{
			System.out.println("str6 is greater than str5");
		}

	}

}
