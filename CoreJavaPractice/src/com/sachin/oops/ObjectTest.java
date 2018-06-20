package com.sachin.oops;

public class ObjectTest {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		Dog dog = new Dog("Tommy","Pavilion","Yellow");
		try
		{
		Dog dog1 = (Dog)Class.forName("com.sachin.oops.Dog").newInstance();
		 dog1.bark();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		Dog dog2 = (Dog)dog.clone();
        System.out.println(dog2);		
		System.out.println(dog);
		

	}

}

class Dog implements Cloneable
{
	String name;
	String bread ;
	String color;
	
	Dog()
	{
		
	}
	Dog(String name, String bread, String color)
	{
		this.name = name;
		this.bread = bread;
		this.color = color;
	}
	public String toString()
	{
		return "DogInfo-->  "+name+" "+bread+" "+color;
	}
	public void bark()
	{
		System.out.println("Dog is barking");
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
}