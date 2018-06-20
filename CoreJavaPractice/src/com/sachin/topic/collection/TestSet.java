  package com.sachin.topic.collection;

import java.util.HashSet;
import java.util.Iterator;

public class TestSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Faculty faculty1 = new Faculty(101, "TS");
		Faculty faculty2 = new Faculty(101, "TS");
		Faculty faculty3 = new Faculty(101, "PP");

		System.out.println(faculty1.hashCode());

		HashSet<Faculty> hs = new HashSet<Faculty>();
		hs.add(faculty1);
		hs.add(faculty2);
		hs.add(faculty3);
		Iterator<Faculty> itr = hs.iterator();
		while (itr.hasNext()) {
			System.out.println("" + itr.next());
		}
		System.out.println("" + hs);

	}

}

class Faculty {
	int id;
	String name;

	public Faculty(int id, String name) {
		// TODO Auto-generated constructor stub
		this.id = id;
		this.name = name;
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return id;
	}

	public boolean equals(Object obj) {
		Faculty fac = (Faculty) obj;
		if (fac.id == id && fac.name.equals(name)) {
			return true;
		} else {
			return false;
		}

	}

	public String toString() {
		return id + " " + name;

	}
}