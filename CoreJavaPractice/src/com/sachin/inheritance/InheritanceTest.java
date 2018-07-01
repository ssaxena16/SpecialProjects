package com.sachin.inheritance;

public class InheritanceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MountainBike mountainBike = new MountainBike(3, 120, 25);
		Bike bike = new MountainBike(5, 220 ,30);
		//bike.display();
		bike.speedUp(25);
		mountainBike = (MountainBike)bike;
		
		mountainBike.display();
		System.out.println(""+mountainBike.speedDown(55));
        System.out.println(" "+mountainBike.speedUp(20));
	}

}

class Bike 
{
	private int gear;
	public int speed;
	Bike(int gear , int speed)
	{
		this.gear = gear;
		this.speed = speed;
	}
	public int speedUp(int increment)
	{
		speed = speed + increment;
		return speed;
	}
	public int speedDown( int decrement)
	{
		speed = speed - decrement;
		return speed;
	}
	public String toString()
	{
		return " "+gear+"   "+speed; 
	}
}
class MountainBike extends Bike 
{
	public int seatHeight; 
	MountainBike(int gear, int speed, int seatHeight)
	{
		super(gear,speed);
		this.seatHeight = seatHeight;
	}
	public void display()
	{
		//System.out.println(""+gear); gear is  private field so not access in child class
		System.out.println("Speed is "+speed); 
		
	}
	public String toString()
	{
		return super.toString() +"  "+seatHeight;
	}
	
	
}