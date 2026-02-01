package com.regexjunit.junitquestions.testingfilehandling;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.IOException;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Main {
	FileProcessor file;
	
	@BeforeEach
	void setup() {
		file = new FileProcessor();
	}
	
	@Test
	void write() {
		try {
			assertTrue(file.writeToFile("text.txt", "Hii dear how are you."));
		}
		catch(IOException e) {
			System.out.println("File not found.");
		}
	}
	
	@Test
	void read() {
		try {
		    file.writeToFile("text.txt", "Hii dear how are you.");
			assertTrue(file.readFromFile("text.txt"));
		}
		catch(IOException e) {
			System.out.println("File not found.");
		}
	}
}