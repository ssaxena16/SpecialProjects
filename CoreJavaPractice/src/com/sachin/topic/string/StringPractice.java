package com.sachin.topic.string;

public class StringPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "Sachin";
		String str2 = new String("Sachin");
		String str3 = new String("Sachin");
		String str4 = str3.intern();
		String str5 = str2.intern();
		// if (str2 == str3)
		if (str5 == str4) {
			System.out.println("String str2 and str3 have same reference");
		} else {
			System.out.println("String str2 and str3 have different reference");
		}
		StringMethods stringMethods = new StringMethods(5);
		System.out.println(stringMethods.reverseString("Sachin"));

	}

}

class StringMethods 
{
	private final int value ;
	public StringMethods(int a) {
		// TODO Auto-generated constructor stub
		this.value = a;
	}
	public String reverseString(String str)
	{
		int lengthOfString = str.length();
		
		
		if (str.length()==1)
			return str;
		else
		{
		return (str = str.substring(lengthOfString-1)+ reverseString(str.substring(0, lengthOfString-1)));
			
		}
		
		
		
	}
}