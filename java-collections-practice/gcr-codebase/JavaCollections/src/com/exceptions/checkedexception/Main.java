package com.exceptions.checkedexception;
import java.io.*;
public class Main {

	public static void main(String[] args) {
		try {
			FileReader file = new FileReader("textFiles/text.txt");
			int ch;
			
			while((ch=file.read())!=-1) {
				System.out.print((char)ch);
			}
		}
		catch(IOException e) {
			System.out.println("File not found!");
		}
	}
}