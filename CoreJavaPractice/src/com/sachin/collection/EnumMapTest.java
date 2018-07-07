package com.sachin.collection;

import java.util.EnumMap;
import java.util.Map;

enum Color
{
	RED,GREEN,YELLOW,ORANGE
}
public class EnumMapTest {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EnumMap<Color, String> enumMap = new EnumMap<Color,String>(Color.class);
		enumMap.put(Color.RED, "Red Color");
		enumMap.put(Color.GREEN, "Green Color");
		enumMap.put(Color.YELLOW, "Yellow Color");
		enumMap.put(Color.ORANGE, "Orange Color");
		for(Map.Entry<Color, String> mapEntry : enumMap.entrySet())
		{
			System.out.println(""+mapEntry.getKey()+"   "+mapEntry.getValue());
		}

	}

}
