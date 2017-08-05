package com.sachin.teststring;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TestStringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter a name");
	String name = (String)br.readLine();
	System.out.println(""+name);
	String reverseString = "";
	
	for(int i= name.length()-1;i>0;i--)
	{
		reverseString = reverseString + name.charAt(i);
	}
	System.out.println(""+reverseString);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
