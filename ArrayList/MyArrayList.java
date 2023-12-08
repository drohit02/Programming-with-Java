package com.ArrayList;

import java.util.*;
import java.util.Objects;

public class MyArrayList {

	public static void main(String [] args)
	{
		
		ArrayList<String> myList = new ArrayList<>();

		//ArrayList : add() method : Adding element into ArrayList
		System.out.println("------------------------ add() method ArraList----------------------");
		myList.add("Obj 1");
		myList.add(null);
		myList.add("Obj 2");
		myList.add(new String("Obj 3"));
		System.out.println("My String ArrayList : "+myList);
		myList.add(3,"new Obj");
		myList.add(new String("Obj 3"));
		System.out.println("My Updated String ArrayList : "+myList);
		
		System.out.println(myList.indexOf("Obj 1"));
		
		//clear() : method in java 
		System.out.println("------------------------ clear() method ArraList----------------------");
		myList.clear();
		System.out.println("My String ArrayList : "+myList);
		myList.add("Obj 1");
		myList.add("Obj 2");
		myList.add("Obj 3");
		myList.add("Obj 4");
		myList.add("Obj 5");
		System.out.println("My String ArrayList : "+myList);
		
		System.out.println("------------------------ contains() method ArraList----------------------");
		System.out.println("new Obj is present of not ? : "+myList.contains("new Obj"));
		System.out.println("Obj 1 is present of not ? : "+myList.contains("Obj 1"));
		System.out.println("------------------------ isEmpty() method ArraList----------------------");
		System.out.println("Arraylist myList is empty or not ? : "+myList.isEmpty());
		
		System.out.println("\nIn case of the Collection equals() method needs to  override because of accuracy iteration over the Arraylist and Comparision");
	
			
	}


}
