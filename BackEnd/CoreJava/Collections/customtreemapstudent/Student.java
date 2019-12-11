package com.caps.customtreemapstudent;

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
		return "age is "+this.age+ " and the name is "+this.name;
	}
	@Override
	public int compareTo(Student o) 
	{
//		if(this.age>o.age){
//			return 1;
//		}else if(this.age<o.age){
//			return -1;
//		}else{
//			return 0;
//		}
		
		//sort based on name
		return this.name.compareTo(o.name);
	}


}
