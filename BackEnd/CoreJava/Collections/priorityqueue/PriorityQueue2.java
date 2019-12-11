package com.caps.queue.priorityqueue;

import java.util.PriorityQueue;

public class PriorityQueue2 
{
	public static void main(String[] args) {
		PriorityQueue p1 = new PriorityQueue();
		
		p1.offer(new Student(22, "divi"));
		p1.offer(new Student(23, "shree"));
		p1.offer(new Student(22, "divi"));

		for (Object o1 : p1)
		{
			System.out.println(o1);
			
		}
			
	
	}

}
