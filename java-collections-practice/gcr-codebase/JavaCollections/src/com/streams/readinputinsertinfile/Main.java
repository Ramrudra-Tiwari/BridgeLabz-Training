package com.streams.readinputinsertinfile;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.FileOutputStream;
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Name: ");
		String name = read.readLine();
		
		System.out.println("Age: ");
		int age = Integer.parseInt(read.readLine());
		
		System.out.println("Favourite Programming language: ");
		String language = read.readLine();
		
		try {
			FileOutputStream data = new FileOutputStream("textFiles/data.txt");
			
			data.write(String.valueOf("Name: "+name).getBytes());
			data.write(String.valueOf("\nAge: "+age).getBytes());
			data.write(String.valueOf("\nFavourite Programing Language: "+language).getBytes());
			
			System.out.println("data inserted into file.");
			data.close();
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}