// Reverse a Sring to prevent the position of a space
package com.javatpoint.stringexamples;

public class Test25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1 = "My Name is Khan";
		String str2 = "";
		//int length = str1.length();
		for(int i=str1.length()-1;i>=0;i--)
		{
			str2 = str2+ str1.substring(i, i+1);
		}
		System.out.println(""+str2);

	}

}
