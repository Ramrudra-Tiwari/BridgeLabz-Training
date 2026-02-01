package com.csv_data_handling.csv_convert_into_object;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

    static List<Student> list = new ArrayList<>();

    public static void main(String[] args) {

        try {
            BufferedReader reader =
                    new BufferedReader(new InputStreamReader(
                            new FileInputStream("DataFiles/student.csv")));

            // skip header
            String line = reader.readLine();

            while ((line = reader.readLine()) != null) {

                // TAB separated
                String[] data = line.split("\t+");

                int id = Integer.parseInt(data[0].trim());
                String name = data[1].trim();
                int age = Integer.parseInt(data[2].trim());
                double marks = Double.parseDouble(data[3].trim());

                Student s = new Student(id, name, age, marks);
                list.add(s);
            }

            reader.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        show();
    }

    public static void show() {
        for (Student s : list) {
            System.out.println(s);
        }
    }
}
