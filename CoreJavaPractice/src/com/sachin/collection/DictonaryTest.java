package com.sachin.collection;

import java.util.Dictionary;
import java.util.Enumeration;
import java.util.Hashtable;

public class DictonaryTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dictionary<Integer, String> dict = new Hashtable<>();
		dict.put(1, "first");
		dict.put(2, "second");
		dict.put(3, "third");
		dict.put(4, "four");
		dict.put(5, "five");
		Enumeration e = dict.elements();
		Enumeration e1 = dict.keys();
		while(e.hasMoreElements())
		{
           System.out.println(e1.nextElement());
			System.out.println(e.nextElement());
		}
		

	}

}
