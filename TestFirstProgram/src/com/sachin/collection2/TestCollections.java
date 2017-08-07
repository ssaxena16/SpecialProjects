package com.sachin.collection2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TestCollections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<String>();
		list.add("First");
		list.add("Second");
		list.add("Three");
		list.add("Four");
		list.add("Five");
		list.add("Six");
		Collections.addAll(list, "Seven", "Eight");
		System.out.println(list);
		List<Integer> list1 = new ArrayList<Integer>();
		list1.add(5);
		list1.add(8);
		list1.add(3);
		list1.add(7);
		System.out.println(Collections.max(list1));

	}

}
