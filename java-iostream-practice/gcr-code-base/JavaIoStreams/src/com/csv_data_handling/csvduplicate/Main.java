package com.csv_data_handling.csvduplicate;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        Set<String> seenIds = new HashSet<>();

        try (BufferedReader reader =
                     new BufferedReader(new FileReader("DataFiles/employee.csv"))) {

            String line;

            // skip header
            reader.readLine();

            while ((line = reader.readLine()) != null) {

                String[] data = line.split(",");

                String id = data[0].trim();

                if (!seenIds.add(id)) {
                    System.out.println("Duplicate record found:");
                    System.out.println(line);
                    System.out.println("-----------------------");
                }
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}