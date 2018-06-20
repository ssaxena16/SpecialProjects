package com.sachin.oops;

public class ObjectSwap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car carMaruti = new Car(11,"Baleno",500000);
		Car carHundai = new Car(1121,"I20",700000);
		System.out.println("Before Swaping "+ carMaruti +"   "+carHundai);
		System.out.println("After Swaping");
		//swapObject(carMaruti, carHundai); // will not swap because java support pass by value.
		/*Car temp = carHundai;
		carHundai = carMaruti;
		carMaruti = temp;
		System.out.println(carMaruti +"  "+carHundai);
		*/
		CarWrapper carWrapper1 = new CarWrapper(carMaruti);
		CarWrapper carWrapper2 = new CarWrapper(carHundai);
		swapObject(carWrapper1, carWrapper2);
		System.out.println(carWrapper1.car +"  "+carWrapper2.car);

		
		


	}
	public static void swapObject(CarWrapper car1, CarWrapper car2)
	{
		Car temp = car2.car;
		car2.car = car1.car;
		car1.car = temp;
	}

}

class Car 
{
	int model_no;
	String model_name;
	int price ;
	Car(int model_no,String model_name,int price)
	{
		this.model_no =model_no;
		this.model_name = model_name;
		this.price = price;
	}
	public String toString()
	{
		return ""+model_no+"  "+model_name+"  "+price;
	}
}

class CarWrapper 
{
	Car car;
	CarWrapper(Car car)
	{
		this.car = car;
	}
}