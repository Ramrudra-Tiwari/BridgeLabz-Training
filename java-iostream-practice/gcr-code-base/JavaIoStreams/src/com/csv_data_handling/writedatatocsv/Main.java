package com.csv_data_handling.writedatatocsv;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) {
		try {
			BufferedWriter w= new BufferedWriter(new OutputStreamWriter(new FileOutputStream("DataFiles/deprartment.csv")));
			w.write("ID, Name, Department, Salary");
			w.newLine();
			
			w.write("101, Allu, IT, 2000000");
			w.newLine();
			
			w.write("102, ravi, HR, 400000");
			w.newLine();
			
			w.write("103, Allu, Hardware, 56444");
			w.newLine();
			System.out.println("Data Added.");
			w.close();
		}
		catch(IOException e) {
			System.out.println(""+e.getMessage());
		}
	}
}