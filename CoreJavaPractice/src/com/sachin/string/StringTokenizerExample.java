package com.sachin.string;

import java.util.StringTokenizer;

public class StringTokenizerExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "I Love My India";
		StringTokenizer st = new StringTokenizer(str, " ");
		while (st.hasMoreTokens())
		{
			System.out.println(""+st.nextToken());
		}

	}

}
