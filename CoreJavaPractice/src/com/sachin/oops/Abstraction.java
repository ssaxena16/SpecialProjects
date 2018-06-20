package com.sachin.oops;

public class Abstraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape shape = new Circle("Red", 5.2);
		System.out.println(""+shape.area());
		shape.getColor();
		shape.testStatic();

	}

}

abstract class Shape 
{

	 String color ;
	 public Shape(String color)
	 {
		 this.color = color;
	 }
	 abstract public double area();
	 public void getColor()
	 {
		 System.out.println(""+color);
	 }
	 public static void testStatic()
	 {
		 System.out.println("Static Method in abstrct class");
	 }
}

class Circle extends Shape
{
	double radious ;
    public Circle(String color, double radious)
    {
    	super(color);
    	this.radious = radious;
    }
    
    public void getColor()
    {
    	System.out.println(""+ super.color);
    }
    
    public double area()
    {
    	double area = 3.14 * radious * radious ;
    	return area;
    }
}