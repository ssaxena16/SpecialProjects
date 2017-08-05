package com.sachin.teststring;

public class FirstString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] ch = {'a','b','c','d','e'};
		String str = new String(ch);
		System.out.println(""+str);
		
		// When you create a String object with new keyword , two object with same literal created
		String str1 = new String("test");
		String str2 = "test";
		String str3 = str1.intern();
		if(str2==str3)
		{
			System.out.println("test pass");
		}
		int a= 124564;
		String stringValue = String.valueOf(a);
		System.out.println(stringValue);
		
		
		String str5 ="sachin";
		String str6 = "saxena";
		str6=str6.replace("ax", "pg");
		int k = str5.compareTo(str6);
		System.out.println(str6);
		
		// change int type array to  string
		int arr[] ={1,2,3,4,5};
		String st="";
		for(int i=0;i<arr.length;i++)
		{
		st= st+arr[i];	
		}
		// st = String.valueOf(arr);
		System.out.println(st);

		
		// we can not change the state of string (immutable)
		
		String str4 = new String("Testing");
		System.out.println(str4+"immutale");
		System.out.println(str4);
	}

}
