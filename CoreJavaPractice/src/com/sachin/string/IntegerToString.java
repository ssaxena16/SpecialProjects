package com.sachin.string;

import java.text.DecimalFormat;

public class IntegerToString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 50;
		String str = Integer.toString(a);
		String str1 = new Integer(a).toString();
		String str3 = String.valueOf(a);
		 int b = 12453;
		 DecimalFormat df = new DecimalFormat("#,####");
		 String str4 = df.format(b);
		 
		 StringBuilder sb = new StringBuilder();
		 sb.append(a);
		 String str5 = sb.toString();
		 
		 String str6 = Integer.toBinaryString(50);
		 
		 String str7 = Integer.toOctalString(a);
		 
		 String str8 = Integer.toHexString(a);
		 
		 String t = "56";
		 int s = Integer.parseInt(t);
		 
		 Integer p = Integer.valueOf(t);
		 

	}

}
