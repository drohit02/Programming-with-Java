package com.Collections;

public class ComapableEx implements Comparable<ComapableEx> {

	
	public String name;
	public int id ;
	
	public ComapableEx(String name,int id)
	{
		this.name = name ;
		this.id = id;
	}
	@Override
	public int compareTo(ComapableEx o) {
	
		return this.name.compareTo(o.name); //return the value which helps to sort the our collection on basic of roll number
	}
	@Override
	public String toString() {
		return "ComapableEx [name=" + name + ", id=" + id + " ]";
	}
	
	
	
}

