package com.ojas.java8;

import java.util.Arrays;
import java.util.List;

public class SumOfIntegers {

	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(12,3,4,5,6,7);
		findSum(list);

	}

	public static void findSum(List<Integer> list) {
		int sum=list.stream().mapToInt(Integer::intValue).sum();
		System.out.println(sum);
		
	}

}
