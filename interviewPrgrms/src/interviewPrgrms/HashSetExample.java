package interviewPrgrms;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class HashSetExample {

	public static void main(String[] args) {
	Set<Integer> setValues=new HashSet<>();
	Set<Integer> set_values=new LinkedHashSet<>();
	setValues.add(12);
	setValues.add(42);
	setValues.add(78);
	setValues.add(20);
	System.out.println(setValues);
	set_values.addAll(Arrays.asList(12,13,23,18));
	System.out.println(set_values);
	HashSetExample hs=
			//null;
			new HashSetExample();
	System.out.println(hs.print());
	

	}
	public String print() {
		return "";
		//System.out.println("Output");
	}

}
