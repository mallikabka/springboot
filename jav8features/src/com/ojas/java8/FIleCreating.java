package com.ojas.java8;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FIleCreating {


	

	    public static Map<String, Integer> repeatedWord(String s) {
	        Map<String, Integer> map = new HashMap<>();
	        Arrays.asList(s.split(" ")).forEach(word -> map.put(word, map.getOrDefault(word, 0) + 1));
	        return map;
	    }

	    public static void main(String[] args) {
	        String filePath = "C:\\Users\\mb22183\\Downloads\\Java_interview_questions_and_answers_1707116762.pdf";
	        // Replace with the actual absolute file path
	        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
	            String line;
	            Map<String, Integer> wordCount = new HashMap<>();
	            while ((line = reader.readLine()) != null) {
	                Map<String, Integer> lineWordCount = repeatedWord(line);
	                lineWordCount.forEach((word, count) -> wordCount.put(word, wordCount.getOrDefault(word, 0) + count));
	            }
	            wordCount.forEach((word, count) -> System.out.println(word + " -------->" + count));
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	        
	    }
	}

