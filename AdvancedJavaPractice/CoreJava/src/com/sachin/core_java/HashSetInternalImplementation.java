package com.sachin.core_java;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashSetInternalImplementation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> hs = new HashSet<String>();
		hs.add("First");
		hs.add("First");
		hs.add("Second");
		hs.display();

	}
}

class HashSet<E> {
	public HashMap<E, Object> map = null;
	public static final Object present = new Object();

	public HashSet() {
		// TODO Auto-generated constructor stub
		map = new HashMap<E, Object>();
	}

	public boolean add(E element) {
		return map.put(element, present) == null;
	}

	public void display() {
		for (Map.Entry<E, Object> mapEntry : map.entrySet()) {
			System.out.print(" " + mapEntry.getKey());
		}
	}
}
