package com.caps.queue.priorityqueue;

import java.util.Comparator;

public class Student implements Comparable<Student>
{
	int studage;
	String studname;
	
	public Student(int studage, String studname) {
		super();
		this.studage = studage;
		this.studname = studname;
	}

	@Override
	public String toString() {
		return "Student [studage=" + studage + ", studname=" + studname + "]";
	}

	@Override
	public int compareTo(Student o) {
		if(this.studage>o.studage)
		{
			return 1;
		}
		else if(this.studage<o.studage)
		{
			return -1;
		}
		else
		{
			return 0;
		}
	}
//	@Override
//	public int compareTo(Student o)
//	{
//		return  
//	}
//	
	

}
