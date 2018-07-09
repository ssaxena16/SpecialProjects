package com.sachin.collection;

import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SortedMap<Integer, String> map = new TreeMap<Integer, String>();
		map.put(1, "first");
		map.put(2, "second");
		map.put(3, "third");
		map.put(4, "four");
		map.put(5, "five");
		System.out.println(map.headMap(3));
		System.out.println(map.tailMap(2));
		System.out.println(""+map);
		System.out.println(map.firstKey());
		System.out.println(map.lastKey());

	}

}
