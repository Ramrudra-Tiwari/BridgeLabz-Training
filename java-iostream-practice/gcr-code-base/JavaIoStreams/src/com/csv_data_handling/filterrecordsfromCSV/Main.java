package com.csv_data_handling.filterrecordsfromCSV;

import java.io.*;

public class Main {

    public static void main(String[] args) {

        try (BufferedReader reader = new BufferedReader(
                new FileReader("DataFiles/student.csv"))) {

            String line;

            // ✅ skip header
            reader.readLine();

            while ((line = reader.readLine()) != null) {

                // ✅ TAB separated file
                String[] data = line.split("\t");

                int marks = Integer.parseInt(data[3]);

                if (marks >= 80) {
                    System.out.println("-----------------------");
                    System.out.println("Id: " + data[0]);
                    System.out.println("Name: " + data[1]);
                    System.out.println("Age: " + data[2]);
                    System.out.println("Score: " + data[3]);
                    System.out.println("-----------------------");
                }
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
