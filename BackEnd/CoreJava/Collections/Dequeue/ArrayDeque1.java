package com.caps.queue.Dequeue;

import java.util.ArrayDeque;
import java.util.Iterator;

public class ArrayDeque1
{
	public static void main(String[] args) {
		ArrayDeque a1 = new ArrayDeque();
		
		a1.add(23);
		a1.add(2);
		a1.addFirst(45);
		a1.add(15);
		a1.add(78);
		a1.add(4);
		Iterator itr = a1.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}

}
