package com.sachin.topic.searilization;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SearilizationExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeData employeeData = new EmployeeData(101, "Sachin", 70000);
		try {
			SerializationUtil.serialize(employeeData, "F:\\Programing\\EmployeeDetails.txt");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
      try {
		EmployeeData employeeDeserialObjectr = (EmployeeData) SerializationUtil.deserialize("F:\\Programing\\EmployeeDetails.txt");
	    System.out.println("Data === "+employeeDeserialObjectr);
      } catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}

}
class EmployeeData implements Serializable
{
	transient private int id;
	private  String name;
	private int salary;
	public EmployeeData(int id, String name, int salary) {
		// TODO Auto-generated constructor stub
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	public String toString()
	{
		return " "+id+"  "+name+"  "+salary;
	}
	
}

class SerializationUtil 
{
	public static void serialize(Object obj,String filePath) throws IOException
	{
		File file = new File(filePath);
        FileOutputStream fo = new FileOutputStream(file);
        ObjectOutputStream oo = new ObjectOutputStream(fo);
        oo.writeObject(obj);
        
        oo.close();
        fo.close();
		
	}
	public static Object deserialize(String filePath) throws IOException, ClassNotFoundException
	{
		File file = new File(filePath);
		FileInputStream fi = new FileInputStream(file);
		ObjectInputStream oi = new ObjectInputStream(fi);
		Object obj = (Object)oi.readObject();
		return obj;
	}
}