package com.ojas.java8;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class AverageOfList {

	public static void main(String[] args) {
		List<Integer> li=Arrays.asList(12,4,5,6,7,7);
		findAverage(li);
	}

	public static void findAverage(List<Integer> li) {
		double average = li.stream().mapToDouble(Integer::intValue).average().getAsDouble();
		System.out.println(average);
	}

}
