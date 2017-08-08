package com.sachin.collection2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestSortCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> list = new ArrayList<String>();
	    list.add("Sachin");
	    list.add("Mohit");
	    list.add("Ravi");
	    list.add("NIshant");
	    list.add("Harshit");
	    Collections.sort(list);
	    System.out.println(""+list);
	    List<Double> list1 = new ArrayList<Double>();
	    list1.add(5.5);
	    list1.add(6.2);
	    list1.add(2.5);
	    Collections.sort(list1);
	    System.out.println(list1);
	}

}
