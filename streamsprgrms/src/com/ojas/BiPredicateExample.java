package com.ojas;

import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Function;

public class BiPredicateExample {

	public static void main(String[] args) {
		BiPredicate<String, Integer> bpre = (a, b) -> {
			return a.length() == b;

		};
		System.out.println(bpre.test("mallika", 7));
		exBiFunction();
	}

	public static void exBiFunction() {
		BiFunction<Integer, Integer, Integer> biFun = (a, b) -> a + b;
		Function<Integer, Integer> fun = (a) -> a * a;
		System.out.println(biFun.andThen(fun).apply(10, 10));

	}

}
