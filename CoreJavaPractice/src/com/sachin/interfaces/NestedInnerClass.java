package com.sachin.interfaces;

import com.sachin.interfaces.OuterClass.InnerClass;

public class NestedInnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        OuterClass.StaticClass staticOuter = new OuterClass.StaticClass();
        staticOuter.display();
        OuterClass.InnerClass innerOuter = new OuterClass().new InnerClass();
        innerOuter.displayInner();

	}

}

class OuterClass
{
	int a = 5;
	static int b =8;
	private int c =10;
	static class StaticClass
	{
		public void display()
		{
			System.out.println("b "+b);
			System.out.println("a "+new OuterClass().a);
			
		}
	}
	class InnerClass
	{
		int t =89;
		public void displayInner()
		{
			System.out.println("Inner a "+a);
			System.out.println("Inner b "+b);
			System.out.println("Inner c "+c);
		}
	}
	//t = 99; can not access inner class member outside of inner class
}
