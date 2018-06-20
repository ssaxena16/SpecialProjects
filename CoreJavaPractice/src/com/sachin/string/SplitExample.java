package com.sachin.string;

public class SplitExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "India is a great country";
		String str2 = "geeksforforfeek";
		String[] str1 = str.split(" ");
		for(String st : str1)
		{
			System.out.println(""+st);
		}
		String[] ss = str2.split("for");
		for(String st : ss)
		{
			System.out.println(""+st);
		}

	}

}
