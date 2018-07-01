package com.sachin.iopackage;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class ByteArrayOutputStreamTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		byte[] arr = {'J' ,'A','V','A'};
		baos.write(arr, 0, 4);
		for( byte b : baos.toByteArray())
		{
			System.out.print(" "+b);
		}
		baos.close();

	}

}
