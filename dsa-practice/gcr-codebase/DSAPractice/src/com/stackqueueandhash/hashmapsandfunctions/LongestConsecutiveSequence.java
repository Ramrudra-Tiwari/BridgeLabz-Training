package com.stackqueueandhash.hashmapsandfunctions;


import java.util.HashSet;

public class LongestConsecutiveSequence {

    public static void main(String[] args) {

        //Taking an  Input array
        int[] arr = {100, 4, 200, 1, 3, 2};

        // HashSet for fast lookup
        HashSet<Integer> set = new HashSet<>();

        // Add all elements to set
        for (int num : arr) {
            set.add(num);
        }

        int longest = 0;

        // Check for sequence start
        for (int num : set) {

            // Start only if previous number is not present
            if (!set.contains(num - 1)) {

                int current = num;
                int count = 1;

                // Count consecutive numbers
                while (set.contains(current + 1)) {
                    current++;
                    count++;
                }

                // Update longest length
                longest = Math.max(longest, count);
            }
        }

        System.out.println("Longest Consecutive Sequence Length: " + longest);
    }
}