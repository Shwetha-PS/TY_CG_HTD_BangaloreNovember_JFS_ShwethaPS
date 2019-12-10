package com.capgemini.publicaccess.pckg1;

public class Person
{
	static public int age=23;
	public String name;
	public Person(String name) {
		this.name = name;
	}
	public void personDetails() {
		System.out.println("name is "+name);
	}

}
