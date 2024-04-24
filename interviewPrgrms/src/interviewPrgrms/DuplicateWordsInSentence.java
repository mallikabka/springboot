package interviewPrgrms;

import java.util.HashMap;
import java.util.Map;

public class DuplicateWordsInSentence {
	
	    public static void findDuplicateWords(String sentence) {
	        // Normalize the sentence by converting it to lower case
	        sentence = sentence.toLowerCase();
	        
	        // Split the sentence into words using regex that handles spaces and punctuation
	        String[] words = sentence.split("\\W+");
	        
	        // Create a map to store word counts
	        Map<String, Integer> wordCount = new HashMap<>();
	        
	        // Count each word in the sentence
	        for (String word : words) {
	            if (wordCount.containsKey(word)) {
	                wordCount.put(word, wordCount.get(word) + 1);
	            } else {
	                wordCount.put(word, 1);
	            }
	        }
	        
	        // Display the duplicate words
	        System.out.println("Duplicate words:");
	        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
	            if (entry.getValue() > 1) {
	                System.out.println(entry.getKey() + ": " + entry.getValue() + " times");
	            }
	        }
	    }

	    public static void main(String[] args) {
	        String sentence = "This is a test sentence with with is and is as duplicate words.";
	        findDuplicateWords(sentence);
	    }
	}


