class FourWheeler
{
	public FourWheeler()
	{
		System.out.println("Four Wheel");
	}
}
class Car extends FourWheeler
{
	public Car()
	{
		super();
		System.out.println("Car can be automatic gear system");
	}
	{System.out.println("Car have 1500CC Engine");}
	
	static
	{
		System.out.println("Car is A four wheeler");
	}
}
public class TestInstanceBlock {

	public static void main(String args[])
	{
		Car car = new Car();
		
	}
}
