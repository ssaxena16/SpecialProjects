package com.sachin.string;

public class StringConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "Sachin";
		StringBuilder sb = new StringBuilder(str); // convert a String to String Builder
		System.out.println(sb.reverse());
		System.out.println(sb.toString());// convert StringBuilder to String

		// conversion string Builder to StringBuffer
		StringBuilder str2 = new StringBuilder("Saxena");
		String str3 = str2.toString();
		StringBuffer sb1 = new StringBuffer(str3);
		System.out.println(sb1);
		
	}

}
