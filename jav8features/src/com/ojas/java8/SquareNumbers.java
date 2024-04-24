package com.ojas.java8;

import java.util.Arrays;
import java.util.List;

public class SquareNumbers {

	public static void main(String[] args) {
		List<Integer> li = Arrays.asList(2, 4, 7, 3, 1, 8);

		findSquareNumbers(li);

	}

	public static void findSquareNumbers(List<Integer> li) {
		li.stream().map(i -> i * i).forEach(num -> System.out.print(num+" "));

	}

}
