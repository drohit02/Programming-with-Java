package com.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class StudentArrayListMain extends StudentArrayList {

	public static void main(String[] args) 
	{
		
		ArrayList<StudentArrayList> myStudent = new ArrayList<>();
		myStudent.add(new StudentArrayList(101,"Virat",97));
		myStudent.add(new StudentArrayList(102,"Dhoni",85));
		myStudent.add(new StudentArrayList(103,"raina",82));
		myStudent.add(new StudentArrayList(104,"Stark",90));
		myStudent.add(new StudentArrayList(105,"Styen",93));
		
		System.out.println(myStudent);
 
		System.out.println(myStudent.contains(new StudentArrayList(102,"Dhoni",85)));
		
		Iterator<StudentArrayList> myItr = myStudent.iterator();
		
		while(myItr.hasNext())
		{
			StudentArrayList str = myItr.next();
			System.out.println(str);
		}
		
	}

}
