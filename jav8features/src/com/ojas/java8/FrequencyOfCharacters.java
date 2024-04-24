package com.ojas.java8;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyOfCharacters {

	public static void main(String[] args) {
		String str = "softwareengineer";
		Map<Character, Long> collect = str.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		collect.forEach((k,v)->System.out.println(k+   " "+  v));
	}

}
