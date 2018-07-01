package com.sachin.inheritance;

public class InheritanceConstructorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Drived drived = new Drived(4,5);

	}

}

class Base
{
	/*Base()
	{
		System.out.println("Base");
	}*/
	Base(int a)
	{
		System.out.println("Base class");
	}
}
class Drived extends Base
{
	public Drived() {
		super(5);
		// TODO Auto-generated constructor stub
	}
	Drived(int a, int b)
	{
		super(a);
	}
	
}