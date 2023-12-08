package com.FileHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FIleInputOutputImageStream {

	public static void main(String[] args) {
		
		String imgPath = "C:\\Java File Handling\\photo.jpg" ;
		
		try {
			FileInputStream fis = new FileInputStream(imgPath);
			
			byte[] imgHeader = new byte[100];
			fis.read(imgHeader);
			
			int height = ((imgHeader[5] & 0xff) <<8) | (imgHeader[6] & 0xff );
			int width = ((imgHeader[7] & 0xff) <<8) | (imgHeader[8] & 0xff );
			
			System.out.println("Height of Image : "+height);
			System.out.println("width of Image : "+width);
			
			FileOutputStream  fos = new FileOutputStream("C:\\Java File Handling\\new.jpg");
			
			int ch;
			while((ch = fis.read())!= -1)
			{
				fos.write(ch);
			}
		} 
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
