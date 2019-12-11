package com.caps.custumTreeSetsorting;

public class Employee implements Comparable<Employee>
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
	public String toString() {
		return "Employee [age=" + age + ", name=" + name + ", salary=" + salary + "]";
	}
	@Override
	public int compareTo(Employee o) 
	{
		//based on salary
//		if(this.salary>o.salary)
//		{
//			return 1;
//		}
//		else if(this.salary<o.salary)
//		{
//			return -1;
//		}
//		else
//		return 0;
		
		//based on age
//		if(this.age>o.age)
//		{
//			return 1;
//		}
//		else if(this.age<o.age)
//		{
//			return -1;
//		}
//		else
//		return 0;
		
		//based on name
		return o.name.compareTo(this.name);
	}
	

}
