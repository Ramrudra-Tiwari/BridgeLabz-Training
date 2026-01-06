package com.stackqueueandhash.hashmapsandfunctions;

import java.util.HashMap;

public class PairWithGivenSum {

    public static void main(String[] args) {

        // Taking Input array and target sum
        int[] arr = {8, 7, 2, 5, 3, 1};
        int target = 10;

        // HashMap to store visited elements
        HashMap<Integer, Integer> map = new HashMap<>();
        boolean found = false;

        // Traverse array
        for (int num : arr) {

            // Check if complement exists
            if (map.containsKey(target - num)) {
                found = true;
                break;
            }

            // Store current element
            map.put(num, 1);
        }

        System.out.println("Pair with given sum exists? " + found);
    }
}