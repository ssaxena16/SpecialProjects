package com.sachin.important_programs;

import java.util.ArrayList;
import java.util.List;

public class FibonacciTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 8;
		int x = 1;
		int y = 1;
		System.out.print(""+0);
		System.out.print(" "+x);
        System.out.print(" "+y);

		
		while(num-3 > 0)
		{
			int z;
			z = x+y;
			x = y;
			y= z;
			System.out.print(" "+z);
			
			num --;
		}
		
		num = 8;
		System.out.println("");
		System.out.println("Fibonacci series using recursion");
		List<Integer> list = new ArrayList<Integer>();
		//list.add(0);
		while(num > 0)
		{
			list.add(fibonacci(num-1));
			num --;
		}
		//System.out.println(list);
		for(int i = list.size()-1; i>= 0 ; i--)
		{
		System.out.print(" "+list.get(i));	
		}

	}

	public static int fibonacci(int num)
	{
		if (num ==0 || num==  1)
		{
			return 1;
		}
		else
		{
			return fibonacci(num-1)+ fibonacci(num-2);
		}
	}
}


