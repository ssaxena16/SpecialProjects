package com.sachin.collection;

import java.util.HashSet;

public class TestHash {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<Object> hashset= new HashSet<Object>();
		
		hashset.add(null);
		hashset.add(3);
		hashset.add("Mohit");
		hashset.add("Rohit");
		
		for(Object o : hashset)
		{
			System.out.println(""+o);
		}

	}

}
