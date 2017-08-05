// Find duplicate char in a String
package com.javatpoint.stringexamples;

import java.util.ArrayList;
import java.util.HashSet;

public class Test20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "absaabsftrea";
		HashSet hs = new HashSet();
		ArrayList list = new ArrayList();
		for(int i = 0;i<str.length();i++)
		{
			if(hs != null && hs.contains(str.charAt(i)))
			{
				list.add(str.charAt(i));
			}
			hs.add(str.charAt(i));
			
		}
		System.out.println(list);
	}

}
