package com.streams.readwrite;
import java.io.*;

public class Main {

	public static void main(String[] args) throws Exception{
		try {
			FileInputStream bigFile = new FileInputStream("textFiles/big.mp4");
			BufferedInputStream s = new BufferedInputStream(bigFile);
			
			FileOutputStream newbigFile = new FileOutputStream("textFiles/copy.mp4");
			BufferedOutputStream copyFile = new BufferedOutputStream(newbigFile);
			
			byte[] buffer = new byte[4096];
			int byteRead;
			
			long start = System.nanoTime();
			while((byteRead = s.read(buffer))!=-1) {
				copyFile.write(buffer,0,byteRead);
			}
			long end = System.nanoTime();
			s.close();
			copyFile.close();
			
			System.out.println("Time: "+(end-start));
			
			//87892500 read one byte at a time
			//7012900 read 4096 byte at a time
		}
		catch(FileNotFoundException e) {
			System.out.println(e.getMessage());
		}
	}
}