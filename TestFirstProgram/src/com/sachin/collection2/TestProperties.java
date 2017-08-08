package com.sachin.collection2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class TestProperties {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		 File myFile = new File("db.properties");
	        System.out.println("Attempting to read from file in: "+myFile.getCanonicalPath());
		String location = "F:\\Programing\\SpecialProjects\\TestFirstProgram\\db.properties";
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
	}

}
