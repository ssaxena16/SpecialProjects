package com.sachin.filehandling;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class MoveFileTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		// first way Using Files.move()
		
     Path temp = Files.move(Paths.get("F:\\Programing\\filefolder\\object.txt"), Paths.get("F:\\Programing\\filefolder\\test_dir\\object1.txt"));
     if (temp != null )
     {
    	 System.out.println("Successfully Move a file");
     }
     else
     {
    	 System.out.println("NOt moved");
     }
	
	
	// Second Way rename a file and delete it previous location
	
	File file = new File("F:\\Programing\\filefolder\\test_dir\\object1.txt");
	if (file.renameTo(new File("F:\\Programing\\filefolder\\object.txt")))
	{
	   file.delete();
	   System.out.println("Successfully Moved the file");
	}
	else
	{
		System.out.println("Not moved");
	}

}
}
