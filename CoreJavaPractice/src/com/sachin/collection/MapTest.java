package com.sachin.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<Integer, String > map = new HashMap<Integer, String>();
		map.put(1, "Ram");
		map.put(2, "Shyam");
		map.put(3, "Ajay");
		map.put(4, "VIjay");
		Set<Integer> set = map.keySet();
		Iterator itr = set.iterator();
		while(itr.hasNext())
		{
			System.out.println(""+itr.next());
		}
		for(Integer i : set)
		{
			int key1 = i;
			String value =map.get(key1);
			System.out.println(key1+"  "+value);
			
			
			System.out.println(""+i);
		}
		
		Set<Entry<Integer, String>> mapentry =  map.entrySet();
		for(Map.Entry<Integer, String> ms : mapentry)
		{
			System.out.println(ms.getKey()+"  "+ms.getValue());
			
		}
		

	}

}
