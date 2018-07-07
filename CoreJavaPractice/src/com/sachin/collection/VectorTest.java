package com.sachin.collection;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class VectorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Integer> vector = new Vector<Integer>();
		for (int i = 0; i < 10; i++) {
			vector.add(i);
		}
		Enumeration<Integer> enummeration = vector.elements();
		while (enummeration.hasMoreElements()) {
			System.out.println("" + enummeration.nextElement());
		}
		vector.remove(2);
		System.out.println("" + vector.get(5));
		vector.set(5, 11);
		System.out.println(vector);
		Iterator<Integer> itr = vector.iterator();
		while (itr.hasNext()) {
			System.out.println("" + itr.next());
		}

	}

}
