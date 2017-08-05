package com.sachin.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 List<String> list = new ArrayList<String>();
 list.add("First");
 list.add("Second");
 list.add("Third");
 
 Iterator<String> itr = list.iterator();
 while(itr.hasNext())
 {
	 System.out.println(""+itr.next());
 }
 
 for(String str : list)
 {
	 System.out.println(""+str);
 }
	
	}

}
