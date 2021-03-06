package com.caps.API.predicate;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class TestA {

	public static void main(String[] args) {
		
		System.out.println("---------Predicate Method---------------");
		Predicate<Integer> p = i -> i%2==0;
		boolean b1 = p.test(12);
		System.out.println(b1);
		System.out.println(p.test(45));
		

		System.out.println("----------Function-----------------");
		Function<Integer, Integer>f1 = i -> i*100;
		int a = f1.apply(86);
		System.out.println(a);
		
		
					
		}
}


