package com.FileHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerFileRead {

	public static void main(String[] args) 
	{
		File fobj = new File ("C:\\Java File Handling\\scannerRead.txt");
		try {
			Scanner sc = new Scanner(fobj);
			while(sc.hasNext())
			{
				String str = sc.nextLine();
				System.out.print(str);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
