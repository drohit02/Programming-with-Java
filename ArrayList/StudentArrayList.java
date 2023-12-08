package com.ArrayList;

import java.util.Objects;

public class StudentArrayList {
	
	@Override
	public String toString() {
		return " stdId=" + stdId + ", stdName=" + stdName + ", marks=" + marks + "";
	}

	public int stdId;
	public String stdName;
	public int marks;
	
	StudentArrayList()
	{
		this.stdId = 0 ;
		this.stdName = "";
		this.marks = 0 ;
	}
	StudentArrayList(int id,String name,int marks)
	{
		this.stdId = id;
		this.stdName = name;
		this.marks = marks;
	}

	@Override
	public int hashCode() {
		return Objects.hash(marks, stdId, stdName);
	}

	@Override
	public boolean equals(Object obj) 
	{
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		StudentArrayList other = (StudentArrayList) obj;
		return marks == other.marks && stdId == other.stdId && Objects.equals(stdName, other.stdName);
	}
}
