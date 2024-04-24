package com.ojas.basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailFastFailSafeEx {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

		// Fail-fast iterator
		Iterator<Integer> iterator = list.iterator();
//		        while (iterator.hasNext()) {
//		            Integer num = iterator.next();
//		            System.out.print(num + " ");
//		            if (num == 3)
//		                list.remove(num); // ConcurrentModificationException
//		        }
//		        System.out.println();

		// Fail-safe iterator
		list = new CopyOnWriteArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
		List<Integer> list1 = new CopyOnWriteArrayList<>();
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		list1.add(5);
		iterator = list1.iterator();
		while (iterator.hasNext()) {
			Integer num = iterator.next();
			System.out.print(num + " ");
			if (num == 3)
				list1.remove(num); // No exception
		}
	}

}
