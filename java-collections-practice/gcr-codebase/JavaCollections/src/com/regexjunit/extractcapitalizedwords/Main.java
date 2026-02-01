package com.regexjunit.extractcapitalizedwords;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Main {

	public static void main(String[] args) {
		String regex = "\\b[A-Z][a-z]+\\b";
		Pattern pattern = Pattern.compile(regex);
		
		String text = "The Eiffel Tower is in Paris and the Statue of Liberty is in New York.";		
		Matcher matcher = pattern.matcher(text);
		
		while(matcher.find()) {
			System.out.println(matcher.group());
		}
	}
}