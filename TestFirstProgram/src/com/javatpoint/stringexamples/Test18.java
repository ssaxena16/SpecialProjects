//Program count the digit UPPER lower and special char in String ..........

package com.javatpoint.stringexamples;

import java.util.ArrayList;

public class Test18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "India Is A Great Country and 65 % population are youth @ per 100 person";
		int countUpper = 0;
		int countLower = 0;
		int countDigit = 0;
		int CountSpecialchar =0;
		ArrayList list = new ArrayList();
		ArrayList list1 = new ArrayList();
		ArrayList list2 = new ArrayList();
		ArrayList list3 = new ArrayList();
		for(int i =0 ;i <str.length();i++)
		{
			if(Character.isUpperCase(str.charAt(i)))
			{
				countUpper++;
				list.add(str.charAt(i));
			}
			else if(Character.isLowerCase(str.charAt(i)))
			{
				countLower++;
				list1.add(str.charAt(i));
			}
			else if(Character.isDigit(str.charAt(i)))
			{
				countDigit++;
				list2.add(str.charAt(i));
			}
			else
			{
				CountSpecialchar++;
			   list3.add(str.charAt(i));
			}
		}
		System.out.println("Upper"+countUpper+list+"  Lower"+countLower +list1+"  Digit"+countDigit+list2+" SpecialChar"+CountSpecialchar+list3);
	}

}
