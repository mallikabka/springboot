package interviewPrgrms;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapClass {

	public static void main(String[] args) {
		 HashMap<String, Integer> map = new HashMap<>();
	        map.put("One", 1);
	        map.put("Two", 2);
	        map.put("Three", 3);

	        map.forEach((k,v)->System.out.println(k+"  "+v));
	        
	        
	        //A Map can't be traversed, so you need to convert it into Set using keySet() or entrySet() method.
	        for(Entry<String, Integer> entry:map.entrySet()) {
	        	if(!map.containsKey("One")) {
	        	System.out.println(entry.getKey()+"  "+entry.getValue());
	        	}
	        }
	}

}
