package com.sachin.oops;

public class AutoboxedInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer a = 129, b =129;
		if (a==b)
		{
			System.out.println("Same");
		}
		else
		{
			System.out.println("Not same");
		}
		
		Integer p = 127, q =127;// Integer p = Integer.valueOf(127) so valueOf function get the object from cache between -128 to 127 
		if (p==q)
		{
			System.out.println("Same");
		}
		else
		{
			System.out.println("Not same");
		}
		
		Integer i = new Integer(127);
		Integer j = new Integer(127);
		if (i==j)
		{
			System.out.println("Same");
		}
		else
		{
			System.out.println("Not same");
		}

        System.out.println(5+9+7+44+"JavaConcatenation"+5+9);

	}

}
