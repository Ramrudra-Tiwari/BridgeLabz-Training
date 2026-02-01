package com.csv_data_handling.searchcsv;

import java.io.*;

public class Main {

    public static void main(String[] args) {

        String searchName = "Titu";
        boolean found = false;

        try (BufferedReader reader = new BufferedReader(
                new FileReader("DataFiles/employee.csv"))) {

            String line;

            // ✅ skip header
            reader.readLine();

            while ((line = reader.readLine()) != null) {

                // ✅ TAB separated file
                String[] data = line.split("\t");

                if (data[1].trim().equalsIgnoreCase(searchName)) {
                    System.out.println("-----------------------");
                    System.out.println("Department: " + data[2]);
                    System.out.println("Salary: " + data[3]);
                    System.out.println("-----------------------");
                    found = true;
                }
            }

            if (!found) {
                System.out.println("No employee found with name: " + searchName);
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
