package com.collections.Queue;


public class CircularBuffer {

    private int[] buffer;
    private int size;
    private int front;
    private int count;

    //creating an  Constructor
    public CircularBuffer(int size) {
        this.size = size;
        buffer = new int[size];
        front = 0;
        count = 0;
    }

    // Insert element (overwrite if full)
    public void insert(int value) {
        int rear = (front + count) % size;

        if (count == size) {
            // Buffer full → overwrite oldest
            front = (front + 1) % size;
            rear = (front + count - 1) % size;
        } else {
            count++;
        }

        buffer[rear] = value;
    }

    // Display buffer elements
    public void display() {
        System.out.print("Buffer: [ ");
        for (int i = 0; i < count; i++) {
            System.out.print(buffer[(front + i) % size] + " ");
        }
        System.out.println("]");
    }

    // Main method
    public static void main(String[] args) {
        CircularBuffer cb = new CircularBuffer(3);

        cb.insert(1);
        cb.insert(2);
        cb.insert(3);
        cb.display(); // [1 2 3]

        cb.insert(4); // Overwrites 1
        cb.display(); // [2 3 4]
    }
}
