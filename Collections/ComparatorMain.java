package com.Collections;

import java.util.ArrayList;
import java.util.Collections;

public class ComparatorMain {

	public static void main(String[] args) {
		
		ArrayList<ComparatorEx> mylist = new ArrayList<>();
		mylist.add(new ComparatorEx(18,"Virat",34));
		mylist.add(new ComparatorEx(7,"Dhoni",41));
		mylist.add(new ComparatorEx(41,"Thor",38));
		mylist.add(new ComparatorEx(43,"Sachin",51));
		mylist.add(new ComparatorEx(12,"IronMan",39));
		
		System.out.println("Before Sorting : "+mylist);
		Collections.sort(mylist,new SortById());
		System.out.println("After Sorthing By id: "+mylist+"\n------------------------------------------------------------------------");
		Collections.sort(mylist,new SortByAge());
		System.out.println("After sorting by age : "+mylist);
	}

}
