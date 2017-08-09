package com.sachin.collection2;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class TestProperties {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

//		 File myFile = new File("data.properties");
//	        System.out.println("Attempting to read from file in: "+myFile.getCanonicalPath());
		String location = "F:/Programing/data.properties.txt";
		FileReader reader = new FileReader(location);
		
		Properties property = new Properties();
		try
		{
		property.load(reader);
		System.out.println(property.getProperty("username"));
		System.out.println(property.getProperty("password"));
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		Properties p1 = System.getProperties();
		Set set = p1.entrySet();
		
		Iterator itr = set.iterator();
		while(itr.hasNext())
		{
			Map.Entry entry = (Map.Entry)itr.next();
			System.out.println(""+entry.getKey()+"   "+entry.getValue());
		}
	}

}
