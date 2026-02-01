package com.regexjunit.extractlinks;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

	public static void main(String[] args) {
		String regex = "https?://(www\\.)?([a-zA-Z0-9.-]+)";
		
		Pattern pattern = Pattern.compile(regex);
		
		String text = "Visit https://www.google.com and http://example.org for more info.";
		Matcher matcher = pattern.matcher(text);
		
		while(matcher.find()) {
			System.out.println(matcher.group());
		}
	}
}