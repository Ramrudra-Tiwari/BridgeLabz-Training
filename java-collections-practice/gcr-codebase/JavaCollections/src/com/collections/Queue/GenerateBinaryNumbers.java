package com.collections.Queue;


import java.util.LinkedList;
import java.util.Queue;

public class GenerateBinaryNumbers {

    public static void generateBinary(int n) {
        Queue<String> q = new LinkedList<>();

        // Start with "1"
        q.add("1");

        for (int i = 1; i <= n; i++) {
            // Take front element
            String current = q.remove();
            System.out.print(current + " ");

            // Add next binary numbers
            q.add(current + "0");
            q.add(current + "1");
        }
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println("First " + n + " Binary Numbers:");
        generateBinary(n);
    }
}
