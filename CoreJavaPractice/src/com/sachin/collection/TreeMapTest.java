package com.sachin.collection;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Integer, String> treeMap = new TreeMap<Integer, String>();
		treeMap.put(1, "First");
		treeMap.put(2, "Second");
		treeMap.put(5, "Five");
		treeMap.put(3, "Three");
		for (Map.Entry<Integer, String> mapEntry : treeMap.entrySet()) {
			System.out.println(mapEntry.getKey());
			System.out.println(mapEntry.getValue());
		}

		if (treeMap.containsKey(3)) {
			System.out.println(treeMap.get(3));
		} else {
			System.out.println("No key match`");
		}

	}

}
