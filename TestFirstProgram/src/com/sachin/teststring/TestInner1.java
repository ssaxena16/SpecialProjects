package com.sachin.teststring;

class Outer
{
	class Inner
	{
		public void msg()
		{
			System.out.println("this is inner class");
		}
	}
}

public class TestInner1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Outer out = new Outer();
		Outer.Inner in = out.new Inner();
		in.msg();
	}

}
