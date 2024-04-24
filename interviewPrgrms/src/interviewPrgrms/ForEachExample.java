package interviewPrgrms;

import java.util.Arrays;
import java.util.List;

public class ForEachExample {

	public static void main(String[] args) {
		List<Integer> li = Arrays.asList(1, 3, 1, 2, 3, 5, 6, 7);
		li.stream().forEach(System.out::print);
		System.out.println();
		li.stream().forEachOrdered(System.out::print);

	}

}
