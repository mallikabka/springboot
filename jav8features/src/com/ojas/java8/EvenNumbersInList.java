package com.ojas.java8;

import java.util.Arrays;
import java.util.List;

public class EvenNumbersInList {

	public static void main(String[] args) {
		List<Integer> li = Arrays.asList(12, 3, 2, 34, 45, 66, 7, 7);
		findEvennumbers(li);
	}

	public static void findEvennumbers(List<Integer> li) {
		List<Integer> list = li.stream().filter(num -> num % 2 == 0).toList();
		System.out.println(list);
	}

}
