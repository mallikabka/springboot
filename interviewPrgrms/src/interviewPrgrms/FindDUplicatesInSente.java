package interviewPrgrms;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindDUplicatesInSente {

	public static void main(String[] args) {
	String sentnce="This is a test sentence with with is and is as duplicate words.";
	findDuplicates(sentnce);
	//System.out.println(sentnce);
	findDuplicatesUsingJava8(sentnce);

	}
	
	public static void findDuplicatesUsingJava8(String s) {
		s.toLowerCase();
		String[] split = s.split(" ");
		Map<String, Long> collect = Arrays.stream(split).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		collect.forEach((k,v)->System.out.println(k+"  "+v));
	}

	private static void findDuplicates(String sentnce) {
		sentnce.toLowerCase();
		
		String[] words = sentnce.split(" ");
//		for(String wr:words) {
//			System.out.println(wr);
//		}
		
		
		
		for(int i=0;i<words.length;i++) {
			for(int j=i+1;j<words.length;j++) {
				if(words[i].equals(words[j])) {
					System.out.println(words[i]);
				}
			}
		}
	}

}
