package com.sachin.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> linkedList = new LinkedList<Integer>();
		linkedList.add(5);
		linkedList.add(6);
		linkedList.add(7);
		linkedList.add(9);
		linkedList.add(9);
		System.out.println(""+linkedList);
		linkedList.remove(0);
		System.out.println(linkedList.getFirst());
		linkedList.forEach(a -> System.out.println(a));
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(250);
		list.add(32);
 	    linkedList.addAll(list);
 	    System.out.println(""+linkedList);

		



	}

}
