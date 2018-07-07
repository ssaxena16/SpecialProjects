package com.sachin.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> list = new ArrayList<Integer>();
		for (int i = 1; i <= 10; i++) {
			list.add(i);
		}
		for (int i = list.size() - 1; i >= 0; i--) {
			System.out.println(list.get(i));
		}
		Object[] arr = list.toArray();
		for (Object i : arr) {
			int k = (int) i;
			System.out.println("" + k);
		}

		List<Object> list1 = Arrays.asList(arr);
		System.out.println(list1);
		list.clear();
		System.out.println("" + list);
	}
}