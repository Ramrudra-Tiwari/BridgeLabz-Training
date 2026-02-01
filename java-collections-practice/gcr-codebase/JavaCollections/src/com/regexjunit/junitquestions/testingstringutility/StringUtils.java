package com.regexjunit.junitquestions.testingstringutility;

public class StringUtils {
	
	public String reverse(String str) {
		StringBuilder result = new StringBuilder();
		result.append(str);
		return result.reverse().toString();
	}
	
	public boolean isPalindrome(String str) {
		return str.equals(reverse(str));
	}
	
	public String toUpperCase(String str) {
		return str.toUpperCase();
	}
}