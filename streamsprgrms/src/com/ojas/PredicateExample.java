package com.ojas;

import java.util.function.Predicate;

public class PredicateExample {

	public static void main(String[] args) {
		Predicate<Integer> pre=(a)->a<8;
			
		System.out.println(pre.test(10));
	}

}
