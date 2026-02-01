package com.csv_data_handling.sortCSVrecords;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream("DataFiles/student.csv")));
            
            // Read and ignore header line
            String line = reader.readLine();
            
            while ((line = reader.readLine()) != null) {
                // Split by tab since your CSV uses tabs as delimiter
                String data[] = line.split("\t");
                
                System.out.println("-----------------------");
                System.out.println("Id: " + data[0]);
                System.out.println("Name: " + data[1]);
                System.out.println("Age: " + data[2]);
                System.out.println("Score: " + data[3]);
                System.out.println("-----------------------");
            }
            
            reader.close();  // Close reader after the loop
            
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
