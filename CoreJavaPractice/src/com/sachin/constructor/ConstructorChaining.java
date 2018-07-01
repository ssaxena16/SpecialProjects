package com.sachin.constructor;

public class ConstructorChaining {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sub sub = new Sub(5, 8);

	}

}

class Base
{
	Base()
	{
		System.out.println("default Constructor for Base class");
	}
	/*Base(int a)
	{
		System.out.println("one argumnet constructor for base class");
	}*/
}
class Sub extends Base
{
	int a,b;
   /* Sub()
	{
		super(8);
	}*/
	
	private Sub()
	{
		System.out.println("private constructor");
	}
	Sub(int a, int b){
		//super(a);
		this();
		this.a = a;
		this.b = b;
	}
}