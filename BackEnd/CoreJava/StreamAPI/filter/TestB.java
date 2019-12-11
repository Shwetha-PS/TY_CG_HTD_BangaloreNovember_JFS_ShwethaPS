package com.caps.stream.filter;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class TestB {
	public static void main(String[] args) {
		ArrayList<Integer> a1 = new ArrayList<Integer>();
		a1.add(24);
		a1.add(87);
		a1.add(66);
		a1.add(44);
		a1.add(99);
		a1.add(11);

		//to filter out (or) to distinguish even and odd numbers
		List<Integer> l1 = a1.stream().filter(i -> i%2 != 0).collect(Collectors.toList());
		System.out.println(l1);

		//to modify the whole array
		List<Integer> l2 = a1.stream().map(i -> i*100).collect(Collectors.toList());
		System.out.println(l2);

		//to get the maximum value in List
		System.out.println(a1.stream().max((i, j) -> i.compareTo(j)));

		System.out.println(a1.stream().count());
	}
}
