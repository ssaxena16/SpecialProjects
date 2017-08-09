package com.sachin.interviewquestion;

public class TestWraperConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		Integer b = 16;
		// Autoboxing .....
		a = b;

		System.out.println("" + a);
		int a1 = 16;
		Integer b1 = 16;
		Integer b2 = new Integer(16);
		if (a1 == b1) {
			System.out.println("true");// this will print
		}
		
		
		if (b1 == b2) {
			System.out.println("true");
		} else {
			System.out.println("false");// this is print
		}
		
		
		if (a1 == b2) {
			System.out.println("true");// this is print
		}
		
		
		
		if (b1.equals(b2)) {
			System.err.println("true"); // this is print
		}
		int t = 10;
		String str = String.valueOf(t);
		System.out.println(""+str);
		Double d = Double.valueOf(str);
		System.out.println(""+d);
	}

}
