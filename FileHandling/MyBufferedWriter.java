package com.FileHandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class MyBufferedWriter {

	public static void main(String[] args)
	{
		
		ArrayList<Sudent> myStudent = new ArrayList<>();
		
		FileWriter fw;
		try 
		{
			fw = new FileWriter("C:\\Java File Handling\\newfile.txt");
			BufferedWriter bwr = new BufferedWriter(fw);
			
			String []field = {"101,Virat,35","102,Dhoni,42","103,Raina,43",
					"104,Rutu,25","105,Shubhaman,27","106,Shami,34",
					"107,Bumrah,34","108,Sachin,51","109,Kane,37",
					"110,Jadeja,36","111,Sheyas,27"};
			for(int i=0;i<field.length;i++)
			{

				bwr.write(field[i]);
				bwr.newLine();
			}
			
			bwr.close();
			FileReader fr  =  new FileReader("C:\\Java File Handling\\newfile.txt");
			BufferedReader brd = new BufferedReader(fr);
			
			String lines;
			
			while ((lines = brd.readLine()) != null)
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
		catch (IOException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
