

// program to delete a particular char in String.........

package com.javatpoint.stringexamples;

public class Test27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String str = "India is my country";
		
		// remove s from String

		str = str.substring(0, 7)+str.substring(8);
		System.out.println(""+str);
	}

}
