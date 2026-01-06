package com.sorting.algorithms;

public class SelectionSortExamScores {

    public static void main(String[] args) {

        int[] scores = {78, 92, 85, 66, 88};

        System.out.println("Exam Scores Before Sorting:");
        printArray(scores);

        // Selection Sort logic
        for (int i = 0; i < scores.length - 1; i++) {

            int minIndex = i;

            // Find minimum element
            for (int j = i + 1; j < scores.length; j++) {
                if (scores[j] < scores[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap with first unsorted element
            int temp = scores[minIndex];
            scores[minIndex] = scores[i];
            scores[i] = temp;
        }

        System.out.println("\nExam Scores After Sorting:");
        printArray(scores);
    }

    private static void printArray(int[] arr) {
        for (int v : arr) {
            System.out.print(v + " ");
        }
        System.out.println();
    }
}