
package com.stackqueueandhash.hashmapsandfunctions;

public class CustomHashMap {

    // Node represents one entry in HashMap (for collision handling)
    private static class Node {
        int key;
        int value;
        Node next;

        Node(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    private final int SIZE = 5;      // Size of hash table
    private Node[] table = new Node[SIZE];

    // Hash function to find index
    private int hash(int key) {
        return key % SIZE;
    }

    // Insert key-value pair
    public void put(int key, int value) {

        int index = hash(key);
        Node newNode = new Node(key, value);

        // If no collision
        if (table[index] == null) {
            table[index] = newNode;
            return;
        }

        // Handle collision using linked list
        Node current = table[index];
        while (current.next != null) {

            // Update value if key exists
            if (current.key == key) {
                current.value = value;
                return;
            }
            current = current.next;
        }
        current.next = newNode;
    }

    // Get value using key
    public Integer get(int key) {

        int index = hash(key);
        Node current = table[index];

        while (current != null) {
            if (current.key == key) {
                return current.value;
            }
            current = current.next;
        }
        return null;
    }

    // Remove key-value pair
    public void remove(int key) {

        int index = hash(key);
        Node current = table[index];
        Node prev = null;

        while (current != null) {
            if (current.key == key) {

                // Remove first node
                if (prev == null) {
                    table[index] = current.next;
                } else {
                    prev.next = current.next;
                }
                return;
            }
            prev = current;
            current = current.next;
        }
    }

    // Main method (testing)
    public static void main(String[] args) {

        CustomHashMap map = new CustomHashMap();

        map.put(1, 100);
        map.put(6, 200); // collision case

        System.out.println("Value for key 1: " + map.get(1));
        map.remove(1);
        System.out.println("Value for key 1 after removal: " + map.get(1));
    }
}