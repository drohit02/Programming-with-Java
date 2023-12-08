package com.FileHandling;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class MyFileWriter {

	public static void main(String[] args)
	{
	
		FileWriter fw = null;
		Scanner sc = new Scanner(System.in);
		String str = "THis is new Line"; 
		try 
		{
			fw = new FileWriter("C:\\Java File Handling\\myfile.txt",true);
			
			System.out.println("Enter the String to File : ");
			str = sc.nextLine();
			fw.write(str);
			str = "\nThis is another line";
			fw.write(str);
			
		}
		catch(FileNotFoundException fe)
		{
			System.out.println("Somthing is werong");
		} catch (IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
