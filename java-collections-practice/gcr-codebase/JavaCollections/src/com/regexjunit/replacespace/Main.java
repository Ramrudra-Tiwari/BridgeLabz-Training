package com.regexjunit.replacespace;


public class Main {
	public static void main(String args[]) {

		String text = "This    is  an     example   with  multiple spaces.";
		String newText = text.replaceAll("\\s+", " ");
		
		System.out.println("Old Text: "+text);
		System.out.println("New Text: "+newText);
	}
}