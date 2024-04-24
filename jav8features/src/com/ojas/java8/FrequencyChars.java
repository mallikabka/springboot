package com.ojas.java8;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyChars {

	public static void main(String[] args) {
		String str = "Developer";
		str.toLowerCase();
		Map<Character,Long> characters=str.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
	characters.forEach((k,v)->System.out.println(k+ " "+ v));
	}

}
