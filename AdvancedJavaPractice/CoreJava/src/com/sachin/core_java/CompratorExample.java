package com.sachin.core_java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CompratorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<StudentInfo> students = new ArrayList<StudentInfo>();
		students.add(new StudentInfo(101, "Mohit"));
		students.add(new StudentInfo(104, "Amit"));
		students.add(new StudentInfo(108, "Ajay"));
		students.add(new StudentInfo(100, "Kisan"));
		Collections.sort(students, new SortByStudentRollNO());
		for (StudentInfo st : students) {
			System.out.println(st);
		}

	}

}

class StudentInfo {
	int rollNo;
	String name;

	public StudentInfo(int rollNo, String name) {
		this.rollNo = rollNo;
		this.name = name;
	}

	public String toString() {
		return rollNo + " " + name;
	}

}

class SortByStudentRollNO implements Comparator<StudentInfo> {
	public int compare(StudentInfo st1, StudentInfo st2) {
		return st1.rollNo - st2.rollNo;
	}
}

class SortByStudentName implements Comparator<StudentInfo> {
	public int compare(StudentInfo st1, StudentInfo st2) {
		return st1.name.compareTo(st2.name);
	}
}