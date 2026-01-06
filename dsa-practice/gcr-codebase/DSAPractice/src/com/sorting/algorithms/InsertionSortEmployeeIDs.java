
package com.sorting.algorithms;

public class InsertionSortEmployeeIDs {

    public static void main(String[] args) {

        // Array representing employee IDs
        int[] empIds = {105, 102, 108, 101, 104};

        System.out.println("Employee IDs Before Sorting:");
        printArray(empIds);

        // Insertion Sort logic
        for (int i = 1; i < empIds.length; i++) {

            int key = empIds[i];   // element to be inserted
            int j = i - 1;

            // Shift elements greater than key to the right
            while (j >= 0 && empIds[j] > key) {
                empIds[j + 1] = empIds[j];
                j--;
            }

            // Insert key at correct position
            empIds[j + 1] = key;
        }

        System.out.println("\nEmployee IDs After Sorting:");
        printArray(empIds);
    }

    private static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
