package com.streams.imagetobytearray;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Main {

	public static void main(String[] args) throws Exception{
		try {
			FileInputStream file = new FileInputStream("textFiles/firstImage.jpg.jpeg");
			
			ByteArrayOutputStream bytes = new ByteArrayOutputStream();
			
			int b;
			while((b=file.read())!=-1) {
				bytes.write(b);
			}
			
			byte[] arrayByte = bytes.toByteArray();
			
			FileOutputStream result = new FileOutputStream("textFiles/copyImage.jpg");
			result.write(arrayByte);
		}
		catch(Exception e) {
			System.out.println("File not found!");
		}
	}
}