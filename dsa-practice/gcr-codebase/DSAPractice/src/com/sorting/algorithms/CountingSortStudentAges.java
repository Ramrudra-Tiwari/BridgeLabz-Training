package com.sorting.algorithms;

public class CountingSortStudentAges {

    public static void main(String[] args) {

        // Student ages (10 to 18)
        int[] ages = {12, 15, 10, 14, 18, 12, 16, 11};

        System.out.println("Student Ages Before Sorting:");
        printArray(ages);

        countingSort(ages);

        System.out.println("\nStudent Ages After Sorting:");
        printArray(ages);
    }

    private static void countingSort(int[] arr) {

        int min = 10;
        int max = 18;

        int[] count = new int[max - min + 1];

        // Store frequency of each age
        for (int age : arr) {
            count[age - min]++;
        }

        // Rebuild sorted array
        int index = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i]-- > 0) {
                arr[index++] = i + min;
            }
        }
    }

    private static void printArray(int[] arr) {
        for (int v : arr) {
            System.out.print(v + " ");
        }
        System.out.println();
    }
}