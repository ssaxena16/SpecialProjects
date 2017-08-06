package com.sachin.collection2;

import java.util.LinkedHashMap;
import java.util.Map;

import javax.crypto.Mac;

public class TestLinkedHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String, String> map = new LinkedHashMap<String, String>();
		map.put("1", "First");
		map.put("2", "Second");
		map.put("3", "Third");
		map.put("4", "Four");
		map.put("5", "Five");

		for (Map.Entry mapentry : map.entrySet()) {
			System.out.println("  " + mapentry.getKey() + "    " + mapentry.getValue());
		}
	}

}
