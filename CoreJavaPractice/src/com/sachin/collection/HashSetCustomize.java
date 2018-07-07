package com.sachin.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashSetCustomize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSetTest hashSet = new HashSetTest();
		hashSet.add(1);
		hashSet.add(2);
		hashSet.add(3);
		hashSet.add(1);
		hashSet.add(2);
		System.out.println(""+hashSet);
		hashSet.display();

	}

}

class HashSetTest<E>
{
	HashMap hashMap;
	public static final Object PRESENT = new Object();
	public HashSetTest() {
		// TODO Auto-generated constructor stub
		hashMap = new HashMap();
	}
	public boolean add(E e)
	{
		return hashMap.put(e, PRESENT) == null;
	}
	public String toString()
	{
		return ""+hashMap;
	}
	
	public void display()
	{
		Set set = hashMap.keySet();
	 for( Object i : set)
	 {
		 
		 System.out.println(""+i);
	 }
	 
	}
	
}
