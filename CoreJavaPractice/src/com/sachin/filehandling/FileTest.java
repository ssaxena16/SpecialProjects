package com.sachin.filehandling;

import java.io.File;
import java.io.IOException;

public class FileTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file = new File("F:\\Programing\\filefolder");// File(String pathname)
		
		File file1 = new File(file, "object.txt"); //File(File parentFile,String Child)
		System.out.println(file1.exists());
		System.out.println(file.isDirectory());
		System.out.println(""+file1.getParentFile());
		System.out.println(""+file1.getAbsolutePath());
		System.out.println(""+file1.getName());
		String[] list = file.list();
		for(String f : list)
		{
			File f1 = new File(file,f);
		 if (f1.isFile())
		 {
		   System.out.println("file... "+ f);
		 }
		 else if(f1.isDirectory())
		 {
			System.out.println("Directory.. "+ f);

		 }
		}
      boolean b = file.createNewFile();
      System.out.println(" "+b);
      file = new File("F:\\Programing\\filefolder\\EmployeeDetails.txt");
      System.out.println(""+file.getAbsolutePath());
      boolean c = file.delete();
      System.out.println(""+c);
	}

}
