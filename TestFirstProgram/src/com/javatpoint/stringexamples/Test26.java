// Program for swap two String without using third variable  .......

package com.javatpoint.stringexamples;

public class Test26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

    String str1 ="Saxena";
    String str2 ="Sachin";
    str1 = str1+str2;
    str2= str1.substring(0, str1.length()-str2.length());
    str1 = str1.substring(str2.length(),str1.length());
    System.out.println(""+str1+"  "+str2);
	}

	
}
