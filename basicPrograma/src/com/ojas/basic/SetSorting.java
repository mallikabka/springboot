package com.ojas.basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetSorting {

	public static void main(String[] args) {
		Set<Integer> setValues=new HashSet<>(Arrays.asList(12,3,1,4,66,7,10));
		Set<Integer> sortedValues=new TreeSet<>(setValues);
		System.out.println(setValues);
		System.out.println(sortedValues);
		//we can give size for ArrayList
		List<Integer> listValues=new ArrayList<>(7);
		listValues.add(0,111);
		listValues.add(1, 222);
		System.out.println(listValues);
		
	}

}
