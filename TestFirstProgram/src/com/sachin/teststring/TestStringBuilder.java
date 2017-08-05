
package com.sachin.teststring;


public class TestStringBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringBuilder str = new StringBuilder("java");
		str.append("test");
		System.out.println(""+str);
		String test = "";
		long starttime = System.currentTimeMillis();
		for(int i=0;i<1000;i++)
		{
			test=test+"i";
			if(i==998 || i==999)
			{
				System.out.println(""+str.hashCode());
			}
		}
		System.out.println(System.currentTimeMillis()-starttime);
		
		StringBuilder strbuil = new StringBuilder("");
		starttime = System.currentTimeMillis();
		for(int i= 0 ;i<10000;i++)
		{
			strbuil.append("i");
		}
		System.out.println(System.currentTimeMillis()-starttime);
		
		
	}

}
