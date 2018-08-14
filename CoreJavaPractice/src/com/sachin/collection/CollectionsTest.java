package com.sachin.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		System.out.println(list);
		// Collections.shuffle(list);

		Collections.swap(list, 1, 2);
		System.out.println(list);

		Collections.reverse(list);
		System.out.println(list);
		System.out.println(Collections.binarySearch(list, 3));
		Collections.rotate(list, 3);
		System.out.println(list);
		System.out.println(Collections.frequency(list, 5));

		Integer[] arr = { 1, 2, 3, 4, 5 };
		
		System.out.println(Arrays.toString(arr));
		Collections.reverse(Arrays.asList(arr));
		System.out.println(Arrays.toString(arr));

	}

}
