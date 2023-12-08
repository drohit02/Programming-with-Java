package com.FileHandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MyBufferReader {

	public static void main(String[] args) {
		
		
		//Reading stream as character using Buffered reader
		
		FileReader fr= null;
		try {
			 fr= new FileReader("C:\\Java File Handling\\newfile.txt");
			 BufferedReader brf = new BufferedReader(fr);
			 
			 int ch;
			 while((ch = brf.read())!= -1) 
			 {
				 System.out.print((char)ch);
			 }	 
			 
			 brf.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
