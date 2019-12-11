package com.caps.Map.HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMap1
{
	public static void main(String[] args) {
		HashMap<Integer,String> h1 =new HashMap<Integer,String>();
		
		h1.put(22, "Ganesh");
		h1.put(25, "suresh");
		h1.put(28, "dinesh");
		h1.put(30, "ramesh");
		h1.put(50, "mahesh");
		
		System.out.println(h1);
		System.out.println("-------------------");
		     Set<Map.Entry<Integer, String>> s1= h1.entrySet();
		for (Map.Entry<Integer, String>e1 : s1) 
		{
			System.out.println(e1.getKey());
			System.out.println(e1.getValue());
			System.out.println("----------------------");

			
		}
	}

}
