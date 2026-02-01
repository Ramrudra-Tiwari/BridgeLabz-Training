package com.regexjunit.extractcurrencyvalues;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

	public static void main(String[] args) {
		
		String regex = "\\d+\\.?+\\d+\\b";
		Pattern pattern = Pattern.compile(regex);
		
		String text = "The price is $45.99, and the discount is 10.50. and 20";
		Matcher matcher = pattern.matcher(text);
		
		while(matcher.find()) {
			System.out.println(matcher.group());
		}
	}
}