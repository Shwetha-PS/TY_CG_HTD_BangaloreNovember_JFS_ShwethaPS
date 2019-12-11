package com.caps.Map.custumHashMap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMap2 
{
	public static void main(String[] args) {
		HashMap<Integer,Student> h1 = new HashMap<Integer, Student>();
		h1.put(20, new Student(22, "vani"));
		h1.put(30, new Student(32, "rani"));
		h1.put(null, null);
		h1.put(40, new Student(42, "mani"));
		h1.put(null, new Student(52, "nani"));
		h1.put(60, new Student(62, "pani"));

		Set<Map.Entry<Integer, Student>> s1 = h1.entrySet();
		for (Map.Entry<Integer, Student> e1 : s1)
		{
			System.out.println(e1);
		}

		//			Collection<Student>c1 = h1.values();
		//			
		//			for(Student s2 : c1)
		//			{
		//				System.out.println(s2);
		//			}
		//			
		System.out.println(h1.containsKey(30));//true
		System.out.println(h1.containsValue(new Student(42, "mani")));//true

		System.out.println(h1.size());
		System.out.println(h1.isEmpty());
	}
}
