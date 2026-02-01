package com.csv_data_handling.validatecsv;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {

        String filePath = "DataFiles/data.csv";

        // Validation regex
        String emailRegex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
        String phoneRegex = "^[0-9]{10}$";

        try {
            BufferedReader reader =
                    new BufferedReader(new InputStreamReader(new FileInputStream(filePath)));

            // Skip header line
            String line = reader.readLine();

            while ((line = reader.readLine()) != null) {

                // Split using TAB
                String[] data = line.split("\t+");

                System.out.println("-----------------------");

                // Email validation
                if (data[0].trim().matches(emailRegex)) {
                    System.out.println("Email VALID");
                } else {
                    System.out.println("Email NOT valid");
                }

                // Phone validation
                if (data[1].trim().matches(phoneRegex)) {
                    System.out.println("Phone VALID");
                } else {
                    System.out.println("Phone NOT valid");
                }

                System.out.println("Email : " + data[0].trim());
                System.out.println("Phone : " + data[1].trim());

                System.out.println("-----------------------");
            }

            reader.close();

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
