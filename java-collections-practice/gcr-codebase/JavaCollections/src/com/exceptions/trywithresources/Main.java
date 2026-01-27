package com.exceptions.trywithresources;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		try (BufferedReader read = new BufferedReader(new FileReader("textFiles/text.txt"))){
			
			String line = read.readLine();
			System.out.println(line);
		}
		catch(IOException e) {
			System.out.println("File not found.");
		}
	}
}