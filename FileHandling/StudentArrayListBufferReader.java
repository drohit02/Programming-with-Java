package com.FileHandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class StudentArrayListBufferReader
{

	public static void main(String[] args)
	{
		ArrayList<Sudent> myStudent = new ArrayList<>();
		
		FileReader fr;
		try 
		{
			fr = new FileReader("C:\\Java File Handling\\newfile.txt");
			BufferedReader brf = new BufferedReader(fr);
			
			String lines;
			
			while ((lines = brf.readLine()) != null)
			{
                String[] fields = lines.split(",");

                int id = Integer.parseInt(fields[0]);
                String name = fields[1];
                int age = Integer.parseInt(fields[2]);
				
				Sudent si = new Sudent(id,name,age);
				myStudent.add(si);
				
			}
			System.out.println(myStudent);
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
