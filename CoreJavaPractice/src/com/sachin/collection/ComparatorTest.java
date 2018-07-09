package com.sachin.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Person> list = new ArrayList<Person>();
		list.add(new Person(22, "Mohit"));
		list.add(new Person(20, "" + "shobhit"));
		list.add(new Person(28, "Ankit"));
		list.add(new Person(18, "Abhay"));
		Collections.sort(list, new SortById());
		for (Person person : list) {
			System.out.println(person);
		}
		System.out.println("*********************");

		Collections.sort(list, new SortByName());
		for (Person person : list) {
			System.out.println(person);
		}

	}

}

class Person {
	int id;
	String name;

	public Person(int id, String name) {
		// TODO Auto-generated constructor stub
		this.id = id;
		this.name = name;
	}

	public String toString() {
		return id + "   " + name;
	}
}

class SortById implements Comparator<Person> {

	@Override
	public int compare(Person o1, Person o2) {
		// TODO Auto-generated method stub
		return o1.id - o2.id;
	}

}

class SortByName implements Comparator<Person> {

	@Override
	public int compare(Person o1, Person o2) {
		// TODO Auto-generated method stub
		return o1.name.compareTo(o2.name);
	}

}