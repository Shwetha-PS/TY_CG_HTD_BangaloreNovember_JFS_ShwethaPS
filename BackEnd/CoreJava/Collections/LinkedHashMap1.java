package com.caps.Map.LinkedHashMap;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class LinkedHashMap1 
{

	public static void main(String[] args) {
		LinkedHashMap<String, Integer> l1 = new LinkedHashMap<String, Integer>();
		l1.put("BTM", 567890);
		l1.put("HEBBAL", 560023);
		l1.put("BTR", 560032);
		l1.put("RAJAJINAGAR", 560043);
		l1.put("OAR", 560053);
		l1.put(null, null);
		l1.put(null, null);
		l1.remove("BTR");
		
		Set<Map.Entry<String, Integer>> s1 = l1.entrySet();
		for (Entry<String, Integer> e1 : s1) 
		{
			System.out.println(e1.getKey());
			System.out.println(e1.getValue());
			System.out.println("---------------------");
		}
			System.out.println(l1.size());//5
			System.out.println(l1.isEmpty());//false
			System.out.println(l1.containsKey("HEBBAL"));//true
			System.out.println(l1.get("OAR"));//560053
			System.out.println();

		
	}
}
