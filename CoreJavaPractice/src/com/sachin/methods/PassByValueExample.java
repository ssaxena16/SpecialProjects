package com.sachin.methods;

public class PassByValueExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer i = 9;
		Integer j = 10;
		System.out.println("Before Method call " +i +" "+j);
		swap(i, j);
		System.out.println("After Method call " +i +" "+j);


	}
	public static void swap(int i , int j)
	{
		int temp = i;
		i = j;
		j = temp;
	}

}
