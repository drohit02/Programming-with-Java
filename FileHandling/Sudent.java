package com.FileHandling;

public class Sudent
{
	public int id;
	public String name ;
	public int age ;
	
	Sudent(int id,String name,int age)
	{
		this.id = id ;
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "\nid=" + id + " name=" + name + " age=" + age + "";
	}
	


}
