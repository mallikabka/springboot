package com.ojas.java8;

import java.util.Arrays;
import java.util.List;

public class SortAlphabetically {

	public static void main(String[] args) {
		List<String> li=Arrays.asList("Abhay","Amar","Nandhu","Mallika");
		sortAlphabetically(li);

	}

	public static void sortAlphabetically(List<String> li) {
		List<String> list = li.stream().sorted().toList();
		System.out.println(list);
		
	}

}
