package interviewPrgrms;

import java.util.HashMap;
import java.util.Map.Entry;

public class EvenHAshMap {

	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<>();
		map.put(1, "One");
		map.put(2, "Two");
		map.put(3, "Three");
		map.put(4, "Four");
		System.out.println("map");

		for (Entry<Integer, String> entry : map.entrySet()) {
			if (entry.getKey() % 2 == 0) {
				System.out.println("Even Key :" + entry.getKey());
			}
		}
	}

}
