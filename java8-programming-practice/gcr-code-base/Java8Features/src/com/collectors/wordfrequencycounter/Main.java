package com.collectors.wordfrequencycounter;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		List<String> list = List.of(
					"Hii allu how are you",
					"Hii alice how are you",
					"Hii sonu how are you",
					"Hii rohoan how are you",
					"Hii suriya how are you",
					"Hii kavi how are you"
				);
		
		Map<String, Integer> wordCount = list.stream()
											.flatMap(line -> Arrays.stream(line.split(" ")))
											.map(String::toLowerCase)
											.collect(
														Collectors.toMap(
																word-> word, 
																word ->1, 
																Integer::sum)
													);
		
		System.out.println(wordCount);
	}
}