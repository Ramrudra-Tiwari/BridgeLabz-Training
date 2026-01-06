package com.stackqueueandhash.hashmapsandfunctions;

import java.util.*;

public class ZeroSumSubarrays {

    public static void main(String[] args) {

        // Taking Input array
        int[] arr = {3, 4, -7, 1, 3, -4, -2, -2};

        // USing HashMap to store cumulative sum and its indices
        HashMap<Integer, List<Integer>> map = new HashMap<>();

        int sum = 0;

        // Handle case when subarray starts from index 0
        map.put(0, new ArrayList<>());
        map.get(0).add(-1);

        System.out.println("Zero Sum Subarrays:");

        // For Traverse the array
        for (int i = 0; i < arr.length; i++) {

            //For  Calculate cumulative sum
            sum += arr[i];

            //Condition  If same sum exists, zero-sum subarray found
            if (map.containsKey(sum)) {
                for (int index : map.get(sum)) {
                    System.out.println("Subarray from " + (index + 1) + " to " + i);
                }
            }

            //for  Store index for current sum
            map.putIfAbsent(sum, new ArrayList<>());
            map.get(sum).add(i);
        }
    }
}