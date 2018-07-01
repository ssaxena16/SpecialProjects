package com.sachin.filehandling;

import java.io.File;

public class RecursiveFileInsert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("F:\\Programing\\filefolder");
		File[] arrFiles = file.listFiles();
		recursivePrint(arrFiles, 0);
		

	}
	public static void recursivePrint(File[] arr, int index)
	{
		if(index == arr.length)
		{
			return;
		}
		 
		if (arr[index].isFile())
		{
			System.out.println(""+arr[index].getName());
		}
		else if (arr[index].isDirectory())
		{
			System.out.println("folder ---- "+arr[index].getName());
			recursivePrint(arr[index].listFiles(), 0);
		}
		
		recursivePrint(arr, ++index);
	}

}
