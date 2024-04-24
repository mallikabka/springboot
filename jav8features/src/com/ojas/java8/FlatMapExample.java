package com.ojas.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapExample {

	public static void main(String[] args) {
		List<List<Integer>> list = Arrays.asList(Arrays.asList(1,3,2,5,6,7),Arrays.asList(2,9,7,6,4,8));
		printElements(list);

	}

	public static void printElements(List<List<Integer>> list) {
		List<Integer> elements = list.stream().flatMap(i->i.stream()).collect(Collectors.toList());
		System.out.println(elements);
		
	}

}
