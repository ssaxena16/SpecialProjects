package com.sachin.wrapper;

public class WrapeprTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer a = 204;
		int b = 204;
		Integer c = 204;
		System.out.println(a == b);
		System.out.println(a == c);
		Integer intr = new Integer("5");
		int dd = intr;
		System.out.println("" + dd);

		// Wrapper

		Integer it = new Integer(5);
		Integer it1 = new Integer("5");
		int ii = it1.intValue();
		short sh = it1.shortValue();
		float ff = it1.floatValue();
		double dd1 = it1.doubleValue();
		Integer iii = Integer.valueOf(ii);
		Integer iiii = Integer.valueOf("5");

		String str = iiii.toString();
		int aaa = Integer.parseInt("56");

		// Character

		Character chh1 = new Character('A'); // only one constructor
		boolean bb = Character.isDigit(chh1);
		boolean bbb = Character.isLetter(chh1);
		String ss = chh1.toString();
		boolean bbbb = Character.isLowerCase(chh1);

	}

}
