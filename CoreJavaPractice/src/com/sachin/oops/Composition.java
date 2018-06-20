package com.sachin.oops;

public class Composition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SamsungMobile sm = new SamsungMobile(1022);
		sm.getBatery();

	}

}

class SamsungMobile 
{
	private int miNo;
	private final Batery batery;
	SamsungMobile(int miNo)
	{
		this.miNo = miNo;
		batery = new Batery();
	}
	public void getBatery()
	{
		batery.getSamsungBatery();
	}
}

class Batery 
{
	public void getSamsungBatery()
	{
		System.out.println("Samsung Batery");
	}
	
	public void getNokiaBatery()
	{
		System.out.println("Nokia Batery");
	}
}