package com.streams.datastreams;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.FileOutputStream;
import java.io.DataOutputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
public class Main {

	public static void main(String[] args){
		try {
			BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
			
			System.out.println("Enter Name: ");
			String name = read.readLine();
			
			System.out.println("Enter Roll Number: ");
			int roll = Integer.parseInt(read.readLine());
			
			System.out.println("Enter GPA: ");
			double gpa = Double.parseDouble(read.readLine());
			
			DataOutputStream data = new DataOutputStream(new FileOutputStream("textFiles/dataFile.txt"));
			
			data.writeUTF(name);
			data.writeInt(roll);
			data.writeDouble(gpa);
			
			System.out.println("Added student data success.");
			
			
			
			//read data output stream
			System.out.println("Here we read data from file.");
			DataInputStream readData = new DataInputStream(new FileInputStream("textFiles/dataFile.txt"));
			
			System.out.println("Name: "+readData.readUTF());
			System.out.println("Roll Number: "+readData.readInt());
			System.out.println("GPA: "+readData.readDouble());
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}