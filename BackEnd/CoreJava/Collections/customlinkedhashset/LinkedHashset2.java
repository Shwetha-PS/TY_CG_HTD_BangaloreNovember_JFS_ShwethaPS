package com.caps.LinkedHashSet.customlinkedhashset;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashset2 
{
	public static void main(String[] args) {
		
		LinkedHashSet<Employee> l1 = new LinkedHashSet<Employee>();
		l1.add(new Employee(45000.00, "Ramu"));
		l1.add(new Employee(50000.00, "Gunda"));
		l1.add(new Employee(55000.00, "Ammii"));
		l1.add(new Employee(55000.00, "Ammii"));

		
		Iterator<Employee> itr = l1.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}

	}

}
