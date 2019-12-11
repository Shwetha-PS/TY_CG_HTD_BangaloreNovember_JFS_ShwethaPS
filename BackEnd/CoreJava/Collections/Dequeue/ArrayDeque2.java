package com.caps.queue.Dequeue;

import java.util.ArrayDeque;
import java.util.Iterator;

import jdk.management.resource.internal.inst.SocketOutputStreamRMHooks;

public class ArrayDeque2 {

	public static void main(String[] args) {
		ArrayDeque<String> a1 = new ArrayDeque<String>();

		a1.add("ninja");
		a1.add("chintu");
		a1.add("tom");
		a1.add("jerry");
		a1.add("motu");
		a1.addFirst("bheem");
		a1.removeLast();
		System.out.println(a1.getFirst());
		System.out.println(a1.getLast());
		System.out.println("--------------");
		System.out.println(a1.removeFirstOccurrence("bheem"));
		System.out.println(a1.removeLastOccurrence("jerry"));
		System.out.println(a1.peek());
		System.out.println(a1.peekFirst());
		System.out.println(a1.peekLast());
		System.out.println(a1);
		System.out.println(a1.poll());
		System.out.println(a1);
		System.out.println(a1.pollFirst());
		System.out.println(a1.pollLast());
		System.out.println(a1.offer("yemme"));
		System.out.println(a1.offerFirst("naayi"));
		System.out.println(a1.offerLast("handi"));
		a1.push("paaaapu");
		a1.pop();
		a1.element();
		
		
		
		Iterator itr = a1.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}

}


