package com.regexjunit.extractlanguage;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

	public static void main(String[] args) {
		String regex = "\\b(Java|Python|JavaScript|Go)\\b";
		Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
		
		String text = "I love Java, Python, and javaScript, but I haven't tried Go yet.";
		Matcher matcher = pattern.matcher(text);
		
		while(matcher.find()) {
			System.out.println(matcher.group());
		}
	}
}