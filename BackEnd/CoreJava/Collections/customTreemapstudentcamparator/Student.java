package com.caps.customTreemapstudentcamparator;

import java.util.Comparator;

public class Student implements Comparator
{
	int age;
	String name;
	public Student(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}

	@Override
	public String toString() {
		return "age is "+this.age+ " and the name is "+this.name;
	}
	
	{
//		if(this.age>o.age){
//			return 1;
//		}else if(this.age<o.age){
//			return -1;
//		}else{
//			return 0;
//		}
		
		//sort based on name
		//return this.name.compareTo(o.name);
	}

	@Override
	public int compare(Object o1, Object o2)
	{
		
		return 0;
	}



}
