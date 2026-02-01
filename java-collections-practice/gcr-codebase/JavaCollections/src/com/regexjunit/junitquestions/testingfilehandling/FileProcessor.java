package com.regexjunit.junitquestions.testingfilehandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


public class FileProcessor {

	public boolean writeToFile(String filename, String content) throws IOException{
		BufferedWriter write = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("textFiles/"+filename)));
		
		write.write(content);
		write.close();
		System.out.println("Content added Done.");
		
		return true;
	}
	
	public boolean readFromFile(String filename) throws IOException{
		BufferedReader read = new BufferedReader(new InputStreamReader(new FileInputStream("textFiles/"+filename)));
		
		String message = read.readLine();
		System.out.println("Content reading..");
		System.out.println(message);
		read.close();
		
		return true;
	}
}