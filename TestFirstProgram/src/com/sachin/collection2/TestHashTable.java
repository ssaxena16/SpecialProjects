package com.sachin.collection2;

import java.util.Enumeration;
import java.util.Hashtable;import java.util.Map;

public class TestHashTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashtable<String, String> hashtable = new Hashtable<String, String>();
		hashtable.put("1", "First");
		// value can not be a null in hashtable 
		//hashtable.put("2", null);
		hashtable.put("3", "Three");
		hashtable.put("4", "Four");
		for(Map.Entry<String, String> mampentry :hashtable.entrySet())
		{
			System.out.println("  "+mampentry.getKey()+ "  "+mampentry.getValue()  );
		}

		Enumeration<String> enumuration = hashtable.keys();
		while(enumuration.hasMoreElements())
		{
			String key = enumuration.nextElement();
			String value = hashtable.get(key);
			System.out.println("  "+key+"   "+value);
		}
	}

}
