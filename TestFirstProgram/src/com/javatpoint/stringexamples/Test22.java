package com.javatpoint.stringexamples;

public class Test22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "This is my java program";
		char [] strChar = str.toCharArray();
		//char [] str1char = new char[strChar.length];
		int j;
		String str2="";
		for(int i= 0 ;i<strChar.length;i++)
		{
			 j= i;
		  if(strChar[i]==' ')
		  {
			 continue;
		  }
		  str2 =str2+strChar[i];
		}
		//int s = str1char.length;
		System.out.println(str2);

	}

}
