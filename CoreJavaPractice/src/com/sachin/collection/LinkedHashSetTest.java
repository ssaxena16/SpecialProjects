package com.sachin.collection;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHashSetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet<Integer> lhs = new LinkedHashSet<Integer>();
        lhs.add(2);
        lhs.add(5);
        lhs.add(1);
        lhs.add(1);
        lhs.add(3);
        lhs.remove(3);
        for(Integer i : lhs)
        {
        	System.out.println(""+i);
        }
	}

}
