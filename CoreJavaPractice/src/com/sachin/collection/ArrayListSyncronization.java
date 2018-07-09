package com.sachin.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class ArrayListSyncronization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// first way using Collections.syncronizedList(Collection c) .....
		List<String> list = new ArrayList<String>();
		list.add("First");
		list.add("Second");
		list.add("Third");
		list.add("Four");

		Collections.synchronizedList(list);

		Iterator itr = list.iterator();
		synchronized (list) {
			while (itr.hasNext()) {
				System.out.println("" + itr.next());
				// itr.remove();
			}

		}

		// Second Way
		CopyOnWriteArrayList<String> threadSafe = new CopyOnWriteArrayList<String>();
		threadSafe.add("First");
		threadSafe.add("Second");
		threadSafe.add("Third");
		threadSafe.add("Four");

		Iterator<String> itr1 = threadSafe.iterator();
		while (itr1.hasNext()) {
			System.out.println("" + itr1.next());
		}

	}

}
