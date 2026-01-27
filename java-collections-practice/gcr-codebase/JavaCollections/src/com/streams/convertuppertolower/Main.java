package com.streams.convertuppertolower;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.FileOutputStream;
import java.io.BufferedWriter;
public class Main {

	public static void main(String[] args){
		try {
			// this -> for reading file as BufferedReader 
			BufferedReader read = new BufferedReader(
					new InputStreamReader(
						new FileInputStream("textFiles/text.txt"),"UTF-8"
							)
					);
			
			
			//this -> BufferedWrite write write line by line text as string
			BufferedWriter result = new BufferedWriter(
					new OutputStreamWriter(
							new FileOutputStream("textFiles/newTextRead.txt"),"UTF-8"
							)
					);
			
			String line;
			
			while((line=read.readLine())!=null) {
				result.write(line.toLowerCase());
				result.newLine();
			}
			
			read.close();
			result.close();
			
			System.out.println("read success!");
			
		}catch(Exception e) {
			System.out.println("file not found.");
		}
	}
}