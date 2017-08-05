package com.sachin.collection2;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class TestHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<String > hashset = new HashSet<String>();
		hashset.add(null);
		hashset.add("First");
		hashset.add("Second");
		hashset.add("Three");
		hashset.add("four");
		hashset.add("four");
		for(String str : hashset)
		{
			System.out.println(""+str);
		}
		LinkedHashSet<String> hashset1 = new LinkedHashSet<String>();
		hashset1.add(null);
		hashset1.add("First");
		hashset1.add("Second");
		hashset1.add("Three");
		hashset1.add("four");
		hashset1.add("four");
		hashset1.add(null);
		for(String str : hashset1)
		{
			System.out.println(""+str);
		}
	}

}
