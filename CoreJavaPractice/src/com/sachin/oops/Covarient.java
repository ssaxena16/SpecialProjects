package com.sachin.oops;

public class Covarient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Base base = new Base();
		base.getInfo();
		Derived derived = new Derived();
		derived.getInfo();

	}

}

class T 
{
	
}
class S extends T
{
	
}

class Base 
{
	T getInfo()
	{
		System.out.println("Base method");
		return new T();
	}
	
}
class Derived 
{
	S getInfo()
	{
		System.out.println("Derived method");
		return new S();
	}
}