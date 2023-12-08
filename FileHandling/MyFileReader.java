package com.FileHandling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MyFileReader {

	public static void main(String[] args) throws FileNotFoundException
	{
		try {
			
			FileReader fr = new FileReader("C:\\Java File Handling\\myfile.txt");
			int str;
			while((str =fr.read())!= -1)
			{
				System.out.printf("%c",(char)str);
			}
			fr.close();
		}
		catch(FileNotFoundException fe)
		{
			System.out.println("Somthins is  wrong..."+fe.getMessage());
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
