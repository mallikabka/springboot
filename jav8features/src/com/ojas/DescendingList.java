package com.ojas;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class DescendingList {

	public static void main(String[] args) {
		List<Integer> li = Arrays.asList(12, 3, 2, 3, 45, 67, 78);
		li.stream().sorted((a, b) -> b - a).forEach(System.out::println);
	}

}
