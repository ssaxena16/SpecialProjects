package com.sachin.keywords;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class TransientExample {
 
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		StreamData sd = new StreamData();
		System.out.println(sd);
		// Searialize an object ..
		FileOutputStream fos = new FileOutputStream(new File("F:\\Programing\\object.txt"));
		ObjectOutputStream oo = new ObjectOutputStream(fos);
		oo.writeObject(sd);
		System.out.println("Object Searilization");
		
		//Deserialize an object
		
		FileInputStream fis = new FileInputStream(new File("F:\\Programing\\object.txt"));
		ObjectInputStream ois = new ObjectInputStream(fis);
		StreamData sd1 = (StreamData)ois.readObject();
		System.out.println(sd1);

	}

}

class StreamData implements Serializable
{
	int a = 50;
	transient int b = 60;
	final transient int c = 70;
	transient static int d = 40;
	
	public String toString()
	{
		return a+"  "+b+"  "+c;
	}
	
}