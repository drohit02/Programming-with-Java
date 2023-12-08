package com.HashMap;
import java.util.HashMap;
import java.util.Iterator;
public class HashMapMain {

	public static void main(String[] args) {
	
		HashMap<String,Integer> myMap = new HashMap<>();
		
		//adding key-value pair in HashMap<k,v> using put() method
		myMap.put("Virat", 18);
		myMap.put("Dhoni", 7);
		myMap.put("Sachin", 43);
		myMap.put("Jadeja",101);
		myMap.put("Stark", 103);
		myMap.put("Steyen", 93);
		//updating HashMap object value using same key using Put() method
		myMap.put("Sachin", 1);
		System.out.println(myMap);
		
		//remove() method to remove the element from the HashMap
		
		myMap.remove("Steyen");
		System.out.println("Before clone"+myMap+"\n--------------------------------------------------------");
		
//		//Traversing HasMap using for-each loop
//		
//		for(HashMap.Entry<String,Integer> mp : myMap.entrySet())
//		{
//			System.out.println("[ Key : "+mp.getKey()+" ]"+" [ Value : "+mp.getValue()+"   ]");
//		}
		
		//Clone method
		HashMap<String,Integer> myClone = (HashMap<String,Integer>) myMap.clone();
		
		System.out.println("Original HashMap : "+myMap);
		System.out.println("Clone HashMap : "+myClone+"\n-----------------------------------------------------------------------");
		
		myMap.put("Dhoni", 100);
		System.out.println("Original HashMap : "+myMap);
		System.out.println("Clone HashMap : "+myClone+"\n-----------------------------------------------------------------------");
		
		myClone.put("Dhoni", 101101);
		System.out.println("Original HashMap : "+myMap);
		System.out.println("Clone HashMap : "+myClone+"\n-----------------------------------------------------------------------");
		
	}
}