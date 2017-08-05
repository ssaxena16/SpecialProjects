package com.sachin.teststring;

import java.util.ArrayList;
import java.util.HashSet;

public class TestStringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1 ="this is javatpoint";
		String [] arr = str1.split(" ");
		System.out.println(arr.length);
		String str2 = arr[0].toUpperCase();
		String str3 = arr[1].toUpperCase();
		String str4 = arr[2].toUpperCase();
		StringBuilder sb = new StringBuilder(str2);
		str2=sb.reverse().toString();
		char ch ='b';
		str2= str2.substring(0, 1).toLowerCase()+str2.substring(1);
		System.out.println(str2);
		sb = new StringBuilder(str3);
		str3= sb.reverse().toString();
		str3= str3.substring(0, 1).toLowerCase()+str3.substring(1);
		sb = new StringBuilder(str4);
		str4= sb.reverse().toString();
		str4= str4.substring(0, 1).toLowerCase()+str4.substring(1);
		str1= str2+" "+str3+" "+str4;
		System.out.println(str1);
		String st ="abcaanbs";
		HashSet hs = new HashSet();
		ArrayList list = new ArrayList();
		for(int i=0;i<st.length();i++)
		{
			boolean flag = false;
			if(i !=0 && hs.contains(st.charAt(i)))
			{
				flag = true;
				
		}
			hs.add(st.charAt(i));
			if(flag)
			{
				list.add(st.charAt(i));
			}
			
			
		}
		
		System.out.println(list);
        
	
		
		
		

	}

}
