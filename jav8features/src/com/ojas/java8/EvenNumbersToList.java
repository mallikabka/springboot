package com.ojas.java8;

import java.util.Arrays;
import java.util.List;

public class EvenNumbersToList {

	public static void main(String[] args) {
	List<Integer> li=Arrays.asList(12,13,4,45,6,7,8);
	printEven(li);

	}

	public static void printEven(List<Integer> li) {
		List<Integer> list = li.stream().filter(i->i%2==0).toList();
		System.out.println(li);
		
	}

}
