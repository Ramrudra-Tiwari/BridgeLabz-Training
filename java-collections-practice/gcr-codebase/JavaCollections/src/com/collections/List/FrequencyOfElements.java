package com.collections.List;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class FrequencyOfElements {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // list to store input strings
        List<String> items = new ArrayList<>();

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        // taking input from user
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            items.add(sc.nextLine());
        }

        // map to store frequency
        Map<String, Integer> frequencyMap = new HashMap<>();

        // counting frequency of each element
        for (String item : items) {
            if (frequencyMap.containsKey(item)) {
                frequencyMap.put(item, frequencyMap.get(item) + 1);
            } else {
                frequencyMap.put(item, 1);
            }
        }

        // displaying result
        System.out.println("\nInput List: " + items);
        System.out.println("Frequency Map: " + frequencyMap);

        sc.close();
    }
}
