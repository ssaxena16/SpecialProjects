package com.sachin.array;

public class ArrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {1,2,3,4,5,6,7};
		for(int a : array)
		{
			System.out.println(""+a);
		}
		Student st1 = new Student(101, "Mohit");
		Student st2 = new Student(102, "Sohit");
		Student st3 = new Student(103, "Rohit");
		Student st4 = new Student(104, "Aohit");
		Student[] students = {st1,st2,st3,st4};
		for(Student st : students)
		{
			System.out.println(" "+st.rollNo+"   "+st.name);
		}

		int[][] intArray = {{1,2},{3,4}};
		for(int i=0;i<2 ;i++)
		{
			for(int j=0;j<2;j++)
			{
				System.out.println(intArray[i][j]);
			}
		}

	}

}

class Student 
{
	int rollNo;
	String name;
	Student(int rollNo, String name)
	{
		this.rollNo = rollNo;
		this.name = name;
	}
}