package com.sachin.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderTest {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a String ");
		String str = br.readLine();
		System.out.println("Enter a Double");
		Double d = Double.parseDouble(br.readLine());
		
		System.out.println("OUtput is  == "+str+"   "+d);
		

	}

}
