package com.csv_data_handling.generate_CSV_report;

import java.io.*;

public class Main {

    public static void main(String[] args) {

        try {
            BufferedReader reader = new BufferedReader(
                    new InputStreamReader(
                            new FileInputStream("DataFiles/student.csv")));

            // Read and print header
            String line = reader.readLine();
            System.out.println(line);

            while ((line = reader.readLine()) != null) {

                // TAB separated values
                String[] data = line.split("\t+");

                System.out.println("-----------------------");
                System.out.println("Id: " + data[0].trim());
                System.out.println("Name: " + data[1].trim());
                System.out.println("Age: " + data[2].trim());
                System.out.println("Score: " + data[3].trim());
                System.out.println("-----------------------");
            }

            reader.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
