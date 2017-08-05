package com.javatpoint.stringexamples;

public class Test17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1 ="sachin";
		String str2 = "incash";
		boolean flag = false;
		if(str1.length() == str2.length())
		{
		for(int i=0;i<str1.length();i++)
		{
			for(int j = 0; j<str2.length();j++)
			{
				
				if(str2.charAt(j)== str1.charAt(i))
				{
					flag = true;
					break;
				}
				
			}
			break;
			
		}
		if(!flag)
		{
			System.out.println("String is Not Anagram");
		}
		else
		{
		System.out.println("String is Anagram");
		
		}
		}
	}

}
