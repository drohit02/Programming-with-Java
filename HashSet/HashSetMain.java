package com.HashSet;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetMain {

	public static void main(String[] args) {
		
		HashSet<String> str = new HashSet<>();
		str.add("Obj1");
		str.add("Obj2");
		str.add("Obj3");
		str.add("New obj");
		str.add(new String("Obj5"));
		str.add(null);
		System.out.println("My HashSet : "+str);
		
		System.out.println(str.remove("Obj1"));
		System.out.println(str.contains("Obj5"));
		
		Iterator<String> mystr = str.iterator();
		while(mystr.hasNext())
		{
			String newStr = mystr.next();
			System.out.println(newStr);
		}
		
		
		System.out.println(str.contains("Obj5"));
		System.out.println(str.size());
		System.out.println("------------ iteration using for each loop-------------");
		
		for(String s : str)
		{
			System.out.println(str);
		}
	}
}
