package com.sachin.wrapper;

import java.util.ArrayList;

public class AutoboxingAndUnboxingTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 25;
		ArrayList<Integer> list = new ArrayList<>();
		list.add(a); // Autoboxing
		int num = list.get(0); //Unboxing 
		System.out.println(""+num);
		

	}

}
