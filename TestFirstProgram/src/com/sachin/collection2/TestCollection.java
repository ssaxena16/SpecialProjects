package com.sachin.collection2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class TestCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<String>();
		list.add("First");
		list.add("Second");
		list.add("Third");
		list.add("Four");
		list.add("Five");
		list.add("Six");

		List<String> list1 = new ArrayList<String>();
		list.add("Ten");
		list.add("Nine");

		list.addAll(list1);
		System.out.println("" + list);

		if (list.contains("Five")) {
			System.out.println("Five is done");
		}

		list.remove("Four");
		System.out.println("" + list);

		System.out.println("" + list.size());
		Iterator<String> itr = list.iterator();
		while (itr.hasNext()) {
			System.out.println("" + itr.next());
		}

		Object[] arr = list.toArray();

		for (int i = 0; i < arr.length; i++) {
			String test = (String) arr[i];
			System.out.println("Array == " + arr[i]);
		}
		System.out.println("" + list.indexOf("Second"));
		ListIterator<String> listiterator = list.listIterator();
		while(listiterator.hasNext())
		{
			System.out.println(""+listiterator.next());
		}
		while(listiterator.hasPrevious())
		{
			System.out.println(""+listiterator.previous());
		}

	}

}
