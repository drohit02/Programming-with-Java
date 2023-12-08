package com.Collections;
import java.util.ArrayList;
import java.util.Collections;
public class ComparableMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("--------------------------------Collection.sort on wrapeer class----------------------------");
		ArrayList<String> list = new ArrayList<>();
		list.add("Iron Man");
		list.add("Hulk");
		list.add("Thor");
		list.add("Capatain America");
		list.add("Loki");
		list.add("Spider-Man");
		
		System.out.println("Before Sorting"+list);
		Collections.sort(list);
		System.out.println("After Sorting"+list);
		System.out.println("\n--------Collection.sort on User defined class Using Comaparable and compareTo() Method --------");
		
		
		ArrayList<ComapableEx> mylist = new ArrayList<>();
		mylist.add(new ComapableEx("Sachin",93));
		mylist.add(new ComapableEx("Virat",18));
		mylist.add(new ComapableEx("Dhoni",7));
		mylist.add(new ComapableEx("Raina",97));
		mylist.add(new ComapableEx("Strack",46));
		
		System.out.println("Before sorthing : "+mylist);
		Collections.sort(mylist);
		System.out.println("After sorthing : "+mylist);
	}

}
