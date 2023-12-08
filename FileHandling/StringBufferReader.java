package com.FileHandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class StringBufferReader {

	public static void main(String[] args) 
	{
		try
		{
			FileReader fr = new FileReader("C:\\Java File Handling\\newfile.txt");
			BufferedReader brf = new BufferedReader(fr);
			
			String lines;
			while((lines =brf.readLine())!=null)
			{
				String [] fields = lines.split(",");
				
				System.out.println("Id : "+Integer.parseInt(fields[0])+" Name : "+fields[1]+" Age : "+Integer.parseInt(fields[2]));
			}
					
		} 
		catch (FileNotFoundException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
