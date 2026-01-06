package com.stackqueueandhash.hashmapsandfunctions;

import java.util.HashMap;

public class TwoSum {

    public static void main(String[] args) {

        // Taking Input array and target
        int[] arr = {2, 7, 11, 15};
        int target = 13;

        //Using  HashMap to store value and index
        HashMap<Integer, Integer> map = new HashMap<>();

        // Traverse array
        for (int i = 0; i < arr.length; i++) {

            int complement = target - arr[i];

            // Check if complement exists
            if (map.containsKey(complement)) {
                System.out.println("Indices: " + map.get(complement) + ", " + i);
                return;
            }

            // Store current element with index
            map.put(arr[i], i);
        }

        System.out.println("No pair found");
    }
}