package com.sachin.collection2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Sorting on the basis of a particular data-member of an object
class Department implements Comparable<Department> {
	int dept_no;
	String dept_name;
	int no_of_emp;

	public Department(int dept_no, String dept_name, int no_of_emp) {
		this.dept_no = dept_no;
		this.dept_name = dept_name;
		this.no_of_emp = no_of_emp;
	}

	public String toString() {
		return (" " + dept_no + "   " + dept_name + "   " + no_of_emp);
	}

	@Override
	public int compareTo(Department o) {
		// TODO Auto-generated method stub
		if (this.no_of_emp > o.dept_no) {
			return 1;
		} else if (this.no_of_emp < o.no_of_emp) {
			return -1;
		} else {
			return 0;
		}
	}

}

public class TestComparable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Department hindi = new Department(101, "hindi", 55);
		Department english = new Department(107, "English", 25);
		Department math = new Department(111, "Math", 91);
		Department history = new Department(102, "HIstory", 07);
		Department socialogy = new Department(106, "Socialogy", 23);
		List<Department> list = new ArrayList<Department>();
		list.add(hindi);
		list.add(english);
		list.add(math);
		list.add(history);
		list.add(socialogy);
		Collections.sort(list);
		for (Department dept : list) {
			System.out.println("" + dept);
		}

	}

}
