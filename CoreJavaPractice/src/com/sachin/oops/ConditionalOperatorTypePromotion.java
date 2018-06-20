package com.sachin.oops;

public class ConditionalOperatorTypePromotion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Object o = true ? new Integer(4) : new Float(2.5);
		System.out.println("Using Condition Operator "+o );
		
		// Same write in if else 
		
		Object o1;
		if (true)
		{
			o1 = new Integer(4);
		}
		else
		{
			o1 = new Float(2.5);
		}
		
		System.out.println("Without using conditional "+o1);

	}

}
