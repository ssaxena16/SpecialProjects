package com.sachin.collection;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class HashTestInternal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedHashSet<Integer> hs = new LinkedHashSet<Integer>();
		hs.add(1);
		hs.add(2);
		hs.add(6);
		hs.add(3);
		hs.add(4);
		
	/*	for(int i : hs)
		{
			System.out.println(""+i);
		}*/
		
		int a =3;
		Integer k= new Integer(3);
		Integer b= 3;
		
		if(k==a)
		{
			System.out.println(""+true);
		}
		else
		{
		System.out.println(""+false);
		
		}
		}
	}


