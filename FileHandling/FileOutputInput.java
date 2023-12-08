package com.FileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputInput {

	public static void main(String[] args) 
	{
		if(args.length!=2)
		{
			System.out.println("Not enough file.....");
		}
		File source = new File(args[0]);
		File desti = new File("C:\\Java File Handling\\newFilecreate.text");
		
		if(!source.exists())
		{
			System.out.println("Source file is not present...");
		}
		
		try {
			FileInputStream fis = new FileInputStream(source);
			FileOutputStream fos = new FileOutputStream(desti);
			
			int ch;
			while((ch = fis.read())!= -1)
			{
				fos.write(ch);
			}
			
			fis.close();
			fos.close();
		} 
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
