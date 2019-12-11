package com.caps.TreeSet.customTreeSet1;

public class Student implements Comparable<Student>
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
		return "age is "+this.age+ "  and name is "+this.name;
	}
	
	public int compareTo(Student o) {
		if(this.age>o.age)
		{
			return 1;
		}
		else if(this.age<o.age)
		{
			return -1;
		}
		else
		return 0;
	}
	
	

}
