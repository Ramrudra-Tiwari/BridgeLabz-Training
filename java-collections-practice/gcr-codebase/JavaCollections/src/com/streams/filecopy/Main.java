package com.streams.filecopy;
import java.io.*;
public class Main {

	public static void main(String[] args) {
		try(FileInputStream fi = new FileInputStream("textFiles/text.txt")) {
			System.out.println("File Contents:");
			
			FileOutputStream newFile = new FileOutputStream("textFiles/newText.txt");
			
            int ch;
            while ((ch = fi.read()) != -1) {
                System.out.print((char)ch);
                newFile.write(ch);
            }
			newFile.close();
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}