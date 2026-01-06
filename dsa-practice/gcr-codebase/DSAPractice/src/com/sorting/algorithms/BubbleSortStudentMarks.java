package com.sorting.algorithms;

public class BubbleSortStudentMarks {

    public static void main(String[] args) {

        // Creating Array representing student marks
        int[] marks = {65, 85, 72, 90, 55, 78};

        System.out.println("Student Marks Before Sorting:");
        printArray(marks);

        // Bubble Sort logic
        for (int i = 0; i < marks.length - 1; i++) {

            // Flag to check if any swapping happened
            boolean swapped = false;

            // Compare adjacent elements
            for (int j = 0; j < marks.length - 1 - i; j++) {

                // Swap if marks are in wrong order
                if (marks[j] > marks[j + 1]) {
                    int temp = marks[j];
                    marks[j] = marks[j + 1];
                    marks[j + 1] = temp;
                    swapped = true;
                }
            }

            // If no swaps happened, array is already sorted
            if (!swapped) {
                break;
            }
        }

        System.out.println("\nStudent Marks After Sorting (Ascending Order):");
        printArray(marks);
    }

    // Method to print array elements
    private static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}