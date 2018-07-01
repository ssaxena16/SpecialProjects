package com.sachin.constructor;

public class ConstructorOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box box1 = new Box(89.5);
		System.out.println("Volume for box1 "+box1.volume()+"  no of boxes "+box1.num);
		Box box2 = new Box(12,14.5,11.2);
		System.out.println("Volume of box2 "+box2.volume()+ " no of boxes "+box2.num);

	}

}

class Box
{
	double length, height, width;
	int num =1 ;
	Box(double value )
	{   this(2);
		length = height = width = value;
	}
	Box(int num)
	{
		this.num = num;
	}
	Box(double length, double height, double width )
	{
		this.length = length;
		this.height = height;
		this.width = width;
	}
	public double volume()
	{
		return length*width*height;
	}
	
}