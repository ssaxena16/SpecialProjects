package com.sachin.interfaces;

public class InterfaceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle circle = new Circle(8.2);
		circle.display();

	}

}

interface Shape
{
	public static final double PI = 3.14;
	public double area();
	public void display();
}

class Circle implements Shape
{
	double r ,area ;
	Circle(double r)
	{
		this.r = r;
	}
	public double area()
	{
		area = PI*r*r;
		return area;
	}
	@Override
	public void display() {
		// TODO Auto-generated method stub
	System.out.println("Area is "+area());	
	}
}