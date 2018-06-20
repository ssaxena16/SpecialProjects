package com.sachin.oops;

public class StaticDynamicBinding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set1 set1 = new Set1(); 

	}

}

class Set1 
{
	static class Super
	{
		static  void print()
		{
			System.out.println("super print call");
		}
	}
	static class Sub extends Super{
		 static void print()
		{
			System.out.println("Sub print call");
		}
	}
	
	public static void main(String args[])
	{
		Super super1 = new Super();
		 super1 = new Sub();
		 super1.print();// static binding
	}
}