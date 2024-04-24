package com.ojas.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class PrintElementsStartsWithA {

	public static void main(String[] args) {
		List<String> li=Arrays.asList("Abhay","Amar","Nandhu","Mallika");
		printElements(li);

	}

	public static void printElements(List<String> li) {
		long count = li.stream().filter(i->i.startsWith("A")).count();
		System.out.println("count of words : "+count);
		List<String> list = li.stream().sorted(Comparator.reverseOrder()).toList();
		System.out.println(list);
		List<String> list2 = li.stream().sorted((a,b)->b.compareTo(a)).toList();
		System.out.println(list2);
		List<String> list3 = li.stream().sorted().toList();
		System.out.println(list3);
	}

}
