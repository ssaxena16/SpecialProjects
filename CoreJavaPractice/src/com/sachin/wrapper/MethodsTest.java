package com.sachin.wrapper;

public class MethodsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer i = 10;
		System.out.println(i.equals(10));
		Double d = 55.66;
		System.out.println(d.toString());
		Integer k = Integer.valueOf(33);
		Double dd = Double.valueOf("55.36");
		System.out.println("" + dd);

		int p = k.intValue();
		System.out.println("" + p);
		Integer t= 9745;
		System.out.println(""+t.toHexString(10));
	}

}
