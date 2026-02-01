package com.csv_data_handling.csvrowscounts;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class CountCSVRows {

	public static void main(String[] args) {
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream("DataFiles/student.csv")));
			int count = 0;
			reader.readLine();
			while((reader.readLine())!=null) {
				count+=1;
			}
			System.out.println("Total row: "+count);
			reader.close();
		}
		catch(IOException e ) {
			System.out.println(""+e.getMessage());
		}
	}
}