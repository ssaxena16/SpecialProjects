package com.sachin.collection;

import java.util.ArrayList;
import java.util.List;

public class ListIntefaceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<String>();
		list.add("India");
		list.add("is");
		list.add("a");
		list.add("great");
		list.add("country");
		list.add(".");
		System.out.println(list);
		list.remove(2);
		System.out.println("After remove = " + list);
		String element = list.get(4);
		System.out.println("" + element);
		list.forEach(x -> System.out.println(x));

		System.out.println(list.subList(1, 3));

		int position = list.indexOf("a");
		if (position == -1) {
			System.out.println("Element not present");
		}

	}

}
