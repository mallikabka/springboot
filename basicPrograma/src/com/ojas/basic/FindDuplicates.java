package com.ojas.basic;

import java.util.Arrays;
import java.util.List;

public class FindDuplicates {

	public static void main(String[] args) {
		List<Integer> li = Arrays.asList(12, 12, 3, 4, 5, 6, 12, 4);

		findDuplicates(li);
	}

	public static void findDuplicates(List<Integer> li) {
		// if the last index and first index are equal it is not a duplicate value
		// duplicate means it will occure more then once so I used distinct
		List<Integer> list = li.stream().filter(i -> li.lastIndexOf(i) != li.indexOf(i)).distinct().toList();
		System.out.println(list);

	}

}
