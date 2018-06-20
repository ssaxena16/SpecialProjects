package com.sachin.oops;

public class StringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "Sachin";
		System.out.println("Length "+s.length());
		System.out.println("ChatAt "+s.charAt(2));
		
		System.out.println("subString "+ s.substring(2));
		System.out.println("substring star and end index "+s.substring(2, 4));
		System.out.println("concat "+s.concat("Saxena"));
		System.out.println("indexOf "+s.indexOf('c'));
		System.out.println("Sachin".equals(s));
		System.out.println(s.compareTo("Saxena"));
		System.out.println("Lower "+s.toLowerCase() +"  "+s.toUpperCase());
		System.out.println("replace "+s.replace('n', 'i'));
		
		

	}

}
