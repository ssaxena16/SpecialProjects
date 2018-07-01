package com.sachin.iopackage;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedInputStreamTest {

	public static void main(String[] args) throws IOException {
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		try {
			bis = new BufferedInputStream(new FileInputStream("F:\\Programing\\object.txt"));
			System.out.println("No of bytes " + bis.available());
			bos = new BufferedOutputStream(new FileOutputStream("F:\\Programing\\abc.txt"));
			
			int ch;

			while ((ch = bis.read()) != -1) {
				bos.write(ch);
				System.out.print("" + (char) ch);

			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			bis.close();
			bos.close();
		}
	}

}
