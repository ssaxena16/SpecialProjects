package com.sachin.collection2;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class TestDequeue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Deque<String> dq = new ArrayDeque<String>();
		dq.add("First");
		dq.offer("Second");
		dq.offerFirst("Third");
		dq.add("Four");
		
		System.out.println(""+dq.element());
		for(String str : dq)
		{
			System.out.println(""+str);
		}

		System.out.println(""+dq.peek());
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("First", "Orangre");
		map.put("Second", "Red");
		map.put("Third", "Green");
		//Map.Entry<String, String> mapentry = (Map.Entry<String, String>)map.entrySet();
		
		for(Map.Entry<String, String> maping : map.entrySet())
		{
			System.out.println(""+maping.getKey()+"   "+maping.getValue());
		}
	      Set set = map.keySet();
		
		Iterator< String> itr = set.iterator();
		while(itr.hasNext())
		{
			System.out.println(""+map.get(itr.next()));
		}
	
	}
	//HashMap<String,String> map = new HashMap<>();
	

	

}
