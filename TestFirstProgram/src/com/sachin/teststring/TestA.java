package com.sachin.teststring;
class A implements Cloneable
{
	int a;
	public A(int a)
	{
		this.a =a;
		
	}
	public void display()
	{
		System.out.println(a);
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
}

public class TestA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		A a = new A(50);
		a.display();
		try
		{
		A b = (A)a.clone();
		b.display();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
