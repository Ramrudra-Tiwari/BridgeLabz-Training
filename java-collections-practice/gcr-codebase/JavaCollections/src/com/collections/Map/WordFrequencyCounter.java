package com.collections.Map;

import java.util.HashMap;
import java.util.Map;

public class WordFrequencyCounter {

    public static void main(String[] args) {

        String text = "Hello Team, hello Java!";

        // Convert to lowercase and remove punctuation
        text = text.toLowerCase().replaceAll("[^a-z ]", "");

        // Split text into words
        String[] words = text.split("\\s+");

        // HashMap to store word frequencies
        Map<String, Integer> wordCount = new HashMap<>();

        // Count frequency
        for (String word : words) {
            if (wordCount.containsKey(word)) {
                wordCount.put(word, wordCount.get(word) + 1);
            } else {
                wordCount.put(word, 1);
            }
        }

        // Print result
        System.out.println(wordCount);
    }
}
