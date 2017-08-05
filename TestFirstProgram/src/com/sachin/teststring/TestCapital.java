package com.sachin.teststring;

public class TestCapital {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String test = "this is java";
		String str[] = test.split(" ");
		String changeString="";
		for(String word : str)
		{
			String word1 = word;
			word1 = word1.substring(0,1).toUpperCase()+word1.substring(1, word1.length());
			changeString = changeString + word1+" ";
			
		}
		System.out.println(""+changeString);

	}

}
