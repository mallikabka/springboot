package com.ojas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {

	public static void printSum(List<Integer> list) {
		int sum = list.stream().mapToInt(Integer::intValue).sum();
		System.out.println(sum);
	}

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(12, 1, 1, 1);
		Consumer<List<Integer>> cons = ConsumerExample::printSum;
		cons.accept(list);

	}

}
