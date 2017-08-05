// count no of words in a String .........

package com.javatpoint.stringexamples;

public class Test24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "India is a best country in the world";
		int countWord = 0;
		
		for(int i = 0 ;i<str.length();i++)
		{
			if(str.charAt(i)==' ')
			{
				continue;
			}
			countWord++;
		}
		System.out.println(""+countWord);

	}

}
