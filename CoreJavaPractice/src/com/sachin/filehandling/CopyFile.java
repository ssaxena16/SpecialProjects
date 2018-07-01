package com.sachin.filehandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fis = new FileInputStream("F:\\Programing\\filefolder\\object.txt");
		FileOutputStream fos = new FileOutputStream("F:\\Programing\\filefolder\\test_dir\\Test.txt");
		int ch;
		while((ch = fis.read()) != -1)
		{
			fos.write(ch);
		}
		fis.close();
		fos.close();

	}

}
