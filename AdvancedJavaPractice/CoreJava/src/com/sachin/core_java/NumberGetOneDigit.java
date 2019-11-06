package com.sachin.core_java;

public class NumberGetOneDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("   " + getSumOfExpandedNo(123,2));

	}
	
	public static int getSumOfExpandedNo(int number, int input)
	{
		int expandedNo = getExpandNumber(number, input);
		System.out.println(expandedNo);
		return convertSingleDigitNo(expandedNo);
		 
	}
	
	public static int getExpandNumber(int number, int times)
	{
		int expandNo = number;
		int num = reverseNo(number);
		for(int i=1;i<= times-1;i++)
		{
			while(num > 0)
			{
				int rem = num%10;
				num = num/10;
				expandNo = expandNo*10+rem;
			}
			
		}
		return expandNo;
		
	}

	public static int reverseNo(int num )
	{
		int reverseNo = 0;
		while(num > 0)
		{
			int rem = num%10;
			 num = num /10;
			 reverseNo = reverseNo*10+rem;
			
		}
		return reverseNo;
	}
	public static int convertSingleDigitNo(int number) {
		if (number / 10 == 0) {
			return number;
		} else {
			int sum = 0;
			while (number > 0) {
				int rem = number % 10;
				number = number / 10;
				sum = sum + rem;
			}
			return convertSingleDigitNo(sum);
		}

	}

}
