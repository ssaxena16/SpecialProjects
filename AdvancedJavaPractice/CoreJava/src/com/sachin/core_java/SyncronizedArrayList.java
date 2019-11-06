package com.sachin.core_java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class SyncronizedArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 1; i <= 10; i++) {
			list.add(i);
		}
		Collections.synchronizedList(list);
		System.out.println(" " + list);
		synchronized (list) {
			Iterator<Integer> itr = list.iterator();
			while (itr.hasNext()) {
				int a = itr.next();
				if (a == 5) {
					itr.remove();;
				} else {
					System.out.println(a);
				}
			}

		}
	}

}
