package com.Collections;

import java.util.Comparator;

public class SortByAge implements Comparator<ComparatorEx>{

	@Override
	public int compare(ComparatorEx o1, ComparatorEx o2) {
		
		return o1.age - o2.age;
	}

	

}
