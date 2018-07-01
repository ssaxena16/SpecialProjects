package com.sachin.exception;

import java.util.Scanner;

public class MultiCatchTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		try{
		int num = Integer.parseInt(sc.nextLine());
		
		if(99%num == 0)
		{
			System.out.println("Factor of 99");
			
		}
		System.out.println(""+num);
		}
		/*catch(ArithmeticException e)
		{
			System.out.println("Aithmatic Exception");
		}
		catch(NumberFormatException e)
		{
			System.out.println("Number Format");
		}*/
		catch(NumberFormatException | ArithmeticException e)
		{
			
		}
		catch(Exception e)
		{
			
		}
		
		

	}

}
