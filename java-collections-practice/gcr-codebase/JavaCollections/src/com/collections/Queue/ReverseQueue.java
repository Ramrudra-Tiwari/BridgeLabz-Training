package com.collections.Queue;


import java.util.LinkedList;
import java.util.Queue;

public class ReverseQueue {

    // Method to reverse the queue using only queue operations
    public static void reverseQueue(Queue<Integer> q) {
        if (q.isEmpty()) {
            return;
        }

        int front = q.remove();
        reverseQueue(q);
        q.add(front);
    }

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();

        // Input: [10, 20, 30]
        q.add(10);
        q.add(20);
        q.add(30);

        System.out.println("Original Queue: " + q);

        reverseQueue(q);

        // Output: [30, 20, 10]
        System.out.println("Reversed Queue: " + q);
    }
}
