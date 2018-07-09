package com.sachin.collection;

import java.util.NavigableSet;
import java.util.TreeSet;

public class NavigableSetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NavigableSet<Integer> navigableSet = new TreeSet<Integer>();
		navigableSet.add(5);
		navigableSet.add(6);
		navigableSet.add(7);
		navigableSet.add(8);
		navigableSet.add(59);
		
		System.out.println(""+navigableSet.lower(7));
		System.out.println(""+navigableSet.floor(7));
		System.out.println(""+navigableSet.first());
		System.out.println(""+navigableSet.pollLast());
		System.out.println(""+navigableSet.pollFirst());

	}

}
