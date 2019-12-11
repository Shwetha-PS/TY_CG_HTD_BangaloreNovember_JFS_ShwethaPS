package com.caps.customTreesetcomparator;

import java.util.Comparator;

public class Employee implements Comparator<Employee>
{
	
	int age;
	String name;
	double salary;
	public Employee(int age, String name, double salary) {
		super();
		this.age = age;
		this.name = name;
		this.salary = salary;
	}
	@Override
	public int compare(Employee o1, Employee o2)
	{
		return o1.name.compareTo(o2.name);
	}
	@Override
	public String toString() {
		return "Employee [age=" + age + ", name=" + name + ", salary=" + salary + "]";
	}
	
	
}
