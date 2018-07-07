package com.sachin.collection;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer> firstSet = new HashSet<Integer>();
		List listA = Arrays.asList(new Integer[] {1,3,5,8,8,9});
		firstSet.addAll(listA);
		Set<Integer> secondSet = new HashSet<Integer>();
		List listB = Arrays.asList(new Integer[] {1,2,5,8,8,10});
		secondSet.addAll(listB);
		//firstSet.addAll(secondSet);
		System.out.println(""+firstSet);
		//firstSet.retainAll(secondSet);
		
		System.out.println(""+firstSet);
		firstSet.removeAll(secondSet);
		firstSet.add(null);
	   System.out.println(""+firstSet);	
	   firstSet.add(null);
	}

}
