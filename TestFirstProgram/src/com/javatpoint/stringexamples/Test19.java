// Conver A string to int and int to String
package com.javatpoint.stringexamples;

public class Test19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str ="1214";
		int i = Integer.parseInt(str);
		System.out.println(i);
		i= 12345;
		str = String.valueOf(i);
		System.err.println(str);
	}

}
