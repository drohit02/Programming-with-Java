package com.Collections;

import java.util.Comparator;

public class ComparatorEx implements Comparator<ComparatorEx>{

	public String name;
	public int id;
	public int age;
	
	ComparatorEx(int id,String name,int age)
	{
		this.id = id;
		this.name = name;
		this.age = age ;
	}

	@Override
	public String toString() {
		return "{name=" + name + ", id=" + id + ", age=" + age + "}";
	}

	@Override
	public int compare(ComparatorEx o1, ComparatorEx o2)
	{
		return 0;
	}
	
	
}
