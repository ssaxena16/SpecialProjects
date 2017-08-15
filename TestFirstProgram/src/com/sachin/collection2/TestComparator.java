package com.sachin.collection2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class StudentInfo {
	int rollNo;
	String name;
	int age;

	public StudentInfo(int rollNo, String name, int age) {
		this.rollNo = rollNo;
		this.name = name;
		this.age = age;
	}

	public String toString() {
		return ("  " + rollNo + "  " + name + "  " + age);
	}

}

class RollNoCompare implements Comparator<StudentInfo> {

	@Override
	public int compare(StudentInfo o1, StudentInfo o2) {
		// TODO Auto-generated method stub
		if (o1.rollNo > o2.rollNo) {
			return 1;
		} else if (o1.rollNo < o2.rollNo) {
			return -1;
		} else {
			return 0;
		}
	}

}

class NameCompare implements Comparator<StudentInfo> {

	@Override
	public int compare(StudentInfo o1, StudentInfo o2) {
		// TODO Auto-generated method stub

		return (o1.name.compareTo(o2.name));
	}

}

class AgeCompare implements Comparator<StudentInfo> {

	@Override
	public int compare(StudentInfo o1, StudentInfo o2) {
		// TODO Auto-generated method stub
		if (o1.age > o2.age) {
			return 1;
		} else if (o1.age < o2.age) {
			return -1;
		} else {
			return 0;
		}
	}

}

public class TestComparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentInfo st1 = new StudentInfo(25, "Sachin", 27);
		StudentInfo st2 = new StudentInfo(07, "Ajay", 29);
		StudentInfo st3 = new StudentInfo(25, "Vijay", 28);
		StudentInfo st4 = new StudentInfo(06, "Harshit", 31);
		List<StudentInfo> list = new ArrayList<StudentInfo>();
		list.add(st1);
		list.add(st2);
		list.add(st3);
		list.add(st4);
		// Sorting on the basis of RollNo
		Collections.sort(list, new RollNoCompare());
		for (StudentInfo student : list) {
			System.out.println("" + student);
		}
		System.out.println("--------------------------");
		// Sorting on the basis of Name
		Collections.sort(list, new NameCompare());
		for (StudentInfo student : list) {
			System.out.println("" + student);
		}
		System.out.println("--------------------------");
		// Sorting on the basis of Age
		Collections.sort(list, new AgeCompare());
		for (StudentInfo student : list) {
			System.out.println("" + student);
		}
	}

}
