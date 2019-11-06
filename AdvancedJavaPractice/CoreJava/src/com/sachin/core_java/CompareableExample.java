package com.sachin.core_java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CompareableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Emp> employees = new ArrayList<Emp>();
		employees.add(new Emp(110, "Zakir"));
		employees.add(new Emp(102, "Mohan"));
		employees.add(new Emp(104, "Ajay"));

		Collections.sort(employees);
		for (Emp emp : employees) {
			System.out.println(emp);
		}
	}

}

class Emp implements Comparable<Emp> {
	int empNo;
	String name;

	public Emp(int empNo, String name) {
		this.empNo = empNo;
		this.name = name;
	}

	public int compareTo(Emp emp) {
		return this.empNo - emp.empNo;
	}

	public String toString() {
		return " " + empNo + " " + name;
	}

}
