package com.SerialaztionFileHandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class StudentSerilazation {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		Student s1 = new Student(101,"Virat",35);
		
		File f  = new File("C:\\Java File Handling\\serilazation.txt");
		
		FileOutputStream fos = new FileOutputStream(f);
		
		ObjectOutputStream ops = new ObjectOutputStream(fos);
		
		ops.writeObject(s1);
	
		ops.close();
		
		FileInputStream fis = new FileInputStream("C:\\Java File Handling\\serilazation.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Student oth  =(Student)ois.readObject();
		System.out.println(oth);
		
		System.out.println("Seralization successfull....");

	}

}
