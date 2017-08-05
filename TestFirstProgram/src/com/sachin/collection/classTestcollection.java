package com.sachin.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class classTestcollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		List<String> list = new ArrayList<String>();
		list.add("First");
		list.add("Second");
		list.add("Third");
		
		List<String> list1 = new ArrayList<String>();
		list1.add("Third");
		
		list.addAll(list1);
		System.out.println(list);
		
		list.remove(0);
		System.out.println(list);
	
		System.out.println(""+list.contains(list1.get(0)));
		list.retainAll(list1);
		System.out.println(list);
		
		Object[] str= list.toArray();
		for(int i=0;i<str.length;i++)
		{
			String str1 = (String)str[i];
			System.out.println(""+str1);
		}
		
		Iterator iterator = list.iterator();
		
		while(iterator.hasNext())
		{
			System.out.println(""+iterator.next());
		}
	}

}
