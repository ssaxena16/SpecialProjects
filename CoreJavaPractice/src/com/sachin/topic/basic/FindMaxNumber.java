package com.sachin.topic.basic;

public class FindMaxNumber {
	
	int[] numbers = {2,8,4,6,7};

	public static void main(java.lang.String[] args) {
		// TODO Auto-generated method stub
		FindMaxNumber findNumber = new FindMaxNumber();
		int maxNumber = findNumber.getMaxNumber(findNumber.numbers);
		System.out.println("Max Number is == "+maxNumber);

	}
	
	int getMaxNumber(int[] numbers)
	{
		int maxNumber = numbers[0];
	    for(int number : numbers)
	    {
	    	if(number > maxNumber)
	    	{
	    		maxNumber = number;
	    	}
	    }
	    return maxNumber;
		
	}

}
