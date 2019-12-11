package com.caps.TreeSet.customTreeSet1;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSet2
{
	public static void main(String[] args) {
		TreeSet<Student> t1 = new TreeSet<Student>();
		
		t1.add(new Student(99,"Varun"));
		t1.add(new Student(56,"RaaamuKhakha"));
		t1.add(new Student(99,"Varun"));
		t1.add(new Student(22,"Shwe"));
		
		Iterator<Student> itr = t1.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}

	}

}
