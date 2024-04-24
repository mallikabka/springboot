package com.ojas.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupByLength {

	public static void main(String[] args) {
		List<String> li=Arrays.asList("Mallika","Mamata","Nandhini","Kamala","vinay");
		groupByLength(li);
	}

	public static void groupByLength(List<String> li) {
		Map<Integer, List<String>> collect = li.stream().collect(Collectors.groupingBy(String::length));
		collect.forEach((str,len)->System.out.println(str+" "+len));
		
	}

}
