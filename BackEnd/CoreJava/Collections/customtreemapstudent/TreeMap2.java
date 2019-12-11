package com.caps.customtreemapstudent;

import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class TreeMap2 {

	public static void main(String[] args) {
		TreeMap<Student, String> t1 = new TreeMap<Student, String>();
		t1.put(new Student(5,"hari"), "1st standard");
		t1.put(new Student(10,"shwetha"), "5th standard");
		t1.put(new Student(6,"shravan"), "2nd standard");
		t1.put(new Student(7,"vaishu"), "3rd standard");
		t1.put(new Student(8,"saisahasra"), "4th standard");
		
		Set<Entry<Student, String>> s1 = t1.entrySet();
		for (Entry<Student, String> e1: s1) 
		{
			System.out.println(e1.getKey());
			System.out.println(e1.getValue());
			System.out.println("-----------------------");	
		}	
	}
}
