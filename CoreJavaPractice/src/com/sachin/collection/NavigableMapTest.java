package com.sachin.collection;

import java.util.Map.Entry;
import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NavigableMap<Integer, String> map = new TreeMap<Integer, String>();
		map.put(1, "first");
		map.put(2, "second");
		map.put(3, "third");
		map.put(4, "four");
		map.put(5, "five");
		System.out.println(map);
		System.out.println(map.lowerEntry(2));
		System.out.println(map.floorEntry(2));
		System.out.println(map.higherEntry(2));
		System.out.println(map.firstKey());
		for (NavigableMap.Entry<Integer, String> mapentry : map.entrySet()) {
			System.out.println(mapentry.getKey() + "  " + mapentry.getValue());
		}
	}

}
