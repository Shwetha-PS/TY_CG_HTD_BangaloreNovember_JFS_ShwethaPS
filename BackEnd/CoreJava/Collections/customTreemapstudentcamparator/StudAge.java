package com.caps.customTreemapstudentcamparator;

import java.util.Comparator;

public class StudAge implements Comparator<Student>
{

	@Override
	public int compare(Student o1, Student o2) 
	{
		if(o1.age>o2.age) {
			return 1;
		}else if(o1.age<o2.age) {
			return -1;
		}else {
		return 0;
		}
	}

}
