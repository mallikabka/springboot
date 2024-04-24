package com.ojas.java8;

import java.util.Arrays;
import java.util.List;

public class ReduceExample {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
		List<String> strings=Arrays.asList("banana","mango","kivi");
		String result = strings.stream().reduce("", String::concat);
		System.out.println(result);

		// Summing numbers using reduce with an initial identity value of 0
		int sum = numbers.stream().reduce(2, (a, b) -> a - b);

		System.out.println("Sum: " + sum);
	}
}
