package com.sachin.keywords;

public class StaticExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Test t = new Test();
		//Test t2 = new Test();
		Test.display();

	}

}

class Test
{
	int a ;
	static int b = method1();
	static
	{
		System.out.println("Static block");
	}
	{
		System.out.println("Intstance block");
	}
	static Test t;
	static int method1()
	{
		//a = 8; compilation error
		// t = new Test();
		//t.a= 69;
		System.out.println("static method call by variable");
		return 10;
	}
	
	static void display()
	{
		System.out.println("display method");
	}
	
}