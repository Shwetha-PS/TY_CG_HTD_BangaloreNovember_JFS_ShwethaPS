package com.caps.custumTreeSetsorting;

import java.util.TreeSet;

public class TreeSet3 
{
	public static void main(String[] args) {
		
		TreeSet<Employee> t1 = new TreeSet<Employee>();
		t1.add(new Employee(22, "bheem",36000.00));
		t1.add(new Employee(52, "chutki",80000.00));
		t1.add(new Employee(92, "jaggu",22000.00));
		t1.add(new Employee(40, "raju",10000.00));
		
		for (Employee employee : t1)
		{
			System.out.println("employee name is "+employee.name);
			System.out.println("employee age is "+employee.age);
			System.out.println("employee salary is "+employee.salary);
			System.out.println("-----------------------------------------");

		}

	}

}
