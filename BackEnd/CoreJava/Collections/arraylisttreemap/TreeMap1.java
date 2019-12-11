package com.caps.customtreemap.arraylisttreemap;

import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMap1 
{
	public static void main(String[] args)
	{
		TreeMap<String, ArrayList<Student>> t1 = new TreeMap<String, ArrayList<Student>>();

		ArrayList<Student> l1 = new ArrayList<Student>();

		l1.add(new Student(5, "hari"));
		l1.add(new Student(5, "shravan"));
		
		t1.put("1st std", l1);
		Set<Map.Entry<String, ArrayList<Student>>> s1 = t1.entrySet();
		for (Map.Entry<String, ArrayList<Student>> e1 : s1) {
			System.out.println(e1.getKey());
			System.out.println(e1.getValue());
			System.out.println("-------------------------");
		}

		ArrayList<Student> l2 =new ArrayList<Student>();
		l2.add(new Student(8, "saisahasra"));
		l2.add(new Student(8, "vaishu"));
		
		

		ArrayList<Student> l3 =new ArrayList<Student>();
		l3.add(new Student(22, "shwetha"));
		l3.add(new Student(21, "ammu"));
		
		

	}
}