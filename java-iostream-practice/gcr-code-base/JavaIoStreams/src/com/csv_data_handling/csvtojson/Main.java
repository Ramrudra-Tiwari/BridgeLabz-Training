package com.csv_data_handling.csvtojson;

import java.io.*;

public class Main {

    public static void main(String[] args) {

        String inputFile = "DataFiles/student.csv";
        String outputFile = "DataFiles/student_new.json";

        try {
            BufferedReader reader = new BufferedReader(new FileReader(inputFile));
            BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile));

            // Skip header
            String line = reader.readLine();

            writer.write("[\n");
            boolean first = true;

            while ((line = reader.readLine()) != null) {

                // TAB separated values
                String[] data = line.split("\t+");

                // Safety check (interview + production)
                if (data.length < 4) {
                    continue;
                }

                if (!first) {
                    writer.write(",\n");
                }

                writer.write("  {");
                writer.write("\"id\": " + data[0].trim() + ", ");
                writer.write("\"name\": \"" + data[1].trim() + "\", ");
                writer.write("\"email\": \"" + data[2].trim() + "\", ");
                writer.write("\"salary\": " + data[3].trim());
                writer.write("}");

                first = false;
            }

            writer.write("\n]");
            reader.close();
            writer.close();

            System.out.println("CSV → JSON Done Successfully");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
