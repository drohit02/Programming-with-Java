package com.FileHandling;

import java.io.File;
import java.io.IOException;

public class CreateFile {

	public static void main(String[] args) {
		
		File f = new File("C:\\Java File Handling\\myfile.txt");
		System.out.println(f.exists());
		System.out.println(f.getAbsoluteFile());
		System.out.println(f.getName());

		try 
		{
			f.createNewFile();
		}
		catch(IOException ex)
		{
			ex.printStackTrace();
		}
		System.out.println(f.delete());
		
		File f1 =new File("C:\\Java File Handling\\myfile1.txt");
		System.out.println(f1.exists());
		
		try 
		{
			f.createNewFile();
		}
		catch(IOException ex)
		{
			ex.printStackTrace();
		}
		

		
	}

}
