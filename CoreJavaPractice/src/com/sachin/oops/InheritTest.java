package com.sachin.oops;

public class InheritTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MountainCycle mountainCycle = new MountainCycle("Trend",25, 5);
		mountainCycle.testValue1();
		MountainCycle.testValue();
		mountainCycle.getSpeed();
		System.out.println(mountainCycle);

	}

}

class Cycle 
{
	String gear ;
	int speed ;
	int testValue = 5;
	Cycle(String gear , int speed)
	{
		this.gear = gear;
		this.speed = speed;
	}
	public void getSpeed()
	{
		System.out.println("Get speed in this block");
	}
	public static void  testValue()
	{
		System.out.println("Static Method");
	}
}

class MountainCycle extends Cycle
{
   int seatHeight ;
   /*String gear ;
   int speed;*/
   public MountainCycle(String gear, int speed,int seatHeight) {
	   super(gear,speed);
	   this.seatHeight = seatHeight;
}
  public String toString()
  {
	  return " "+gear+" "+speed+"  "+seatHeight;
  }
  public void testValue1()
  {
	  testValue = 9;
	  System.out.println(""+testValue);
  }
  public static void testValue()
  {
	  System.out.println("Subclass Static Methods");
  }
}