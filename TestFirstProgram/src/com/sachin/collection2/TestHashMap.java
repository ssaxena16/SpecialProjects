package com.sachin.collection2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class TestHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("Key1", "First");
		map.put("key2", "Second");
		map.put("key3", "Third");
		map.put("key4", "Four");
		map.put("key5", "Five");
		map.remove("Key1");
		System.out.println(""+map);
		// First Way to iterate a Map
		for(Map.Entry<String, String> mapentry : map.entrySet())
		{
			System.out.println("Key   "+mapentry.getKey()+ " Value   "+mapentry.getValue());
		}

		// Second Way to iterate 
		
		Set<String> set = (Set)map.keySet();
		Iterator< String> itr = set.iterator();
		while(itr.hasNext())
		{
			String key = itr.next();
			System.out.println(" Key  "+key+ "  Value "+map.get(key));
		}
	}

}
