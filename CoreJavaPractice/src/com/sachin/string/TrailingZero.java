package com.sachin.string;

public class TrailingZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(trailingZero("0012030000"));
		
		int a = 400;
		Integer b = 400;
		if(a==b)
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}

	}
	
	public static String trailingZero(String str)
	{
		StringBuilder sb = new StringBuilder(str);
		int k = 0;
		int p = 0;
		for(int i =0 ; i< str.length(); i++)
		{
			if(str.charAt(i)== '0')
			{
				k++;
			}
			else 
			{
				break;
			}
		}
		sb.replace(0, k, "");
		for(int i =str.length()-1 ; i>=0; i--)
		{
			if(str.charAt(i)== '0')
			{
				p++;
			}
			else 
			{
				break;
			}
		}
		sb.reverse();
		sb.replace(0, p, "");
		sb.reverse();
		return sb.toString();

	}

}
