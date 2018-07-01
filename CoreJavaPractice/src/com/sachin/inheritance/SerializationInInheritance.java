package com.sachin.inheritance;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializationInInheritance {

	public static void main(String[] args) throws IOException, ClassNotFoundException{
		// TODO Auto-generated method stub
		Sub sub = new Sub(10,20);
		System.out.println("Before Serialixation "+sub.a + "   "+sub.b);
		FileOutputStream fos = new FileOutputStream(new File("F:\\Programing\\object.txt"));
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(sub);
        System.out.println("Serialization SuccessFull");
        FileInputStream fis = new FileInputStream(new File("F:\\Programing\\object.txt"));
        ObjectInputStream ois = new ObjectInputStream(fis);
        
        Sub sub1 = (Sub)ois.readObject();
        System.out.println("After Serilization "+sub1.a+"  "+sub1.b);
	}

}

class Super 
{
	int a;
	Super(int a)
	{
		this.a =a ;
	}
	public Super() {
		// TODO Auto-generated constructor stub
	}
	
}
class Sub extends Super implements Serializable
{
	int b;
	Sub(int a, int b)
	{
		super(a);
		this.b = b;
	}
	
	
}