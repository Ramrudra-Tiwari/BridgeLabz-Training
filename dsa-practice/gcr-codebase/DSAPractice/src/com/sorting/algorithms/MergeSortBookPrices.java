package com.sorting.algorithms;

public class MergeSortBookPrices {

    public static void main(String[] args) {

        int[] prices = {450, 299, 999, 199, 650};

        System.out.println("Book Prices Before Sorting:");
        printArray(prices);

        mergeSort(prices, 0, prices.length - 1);

        System.out.println("\nBook Prices After Sorting:");
        printArray(prices);
    }

    // Recursive merge sort
    private static void mergeSort(int[] arr, int left, int right) {

        if (left < right) {
            int mid = (left + right) / 2;

            mergeSort(arr, left, mid);       // sort left half
            mergeSort(arr, mid + 1, right);  // sort right half

            merge(arr, left, mid, right);    // merge both halves
        }
    }

    // Merge two sorted halves
    private static void merge(int[] arr, int left, int mid, int right) {

        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] L = new int[n1];
        int[] R = new int[n2];

        for (int i = 0; i < n1; i++)
            L[i] = arr[left + i];

        for (int j = 0; j < n2; j++)
            R[j] = arr[mid + 1 + j];

        int i = 0, j = 0, k = left;

        // Merge logic
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k++] = L[i++];
            } else {
                arr[k++] = R[j++];
            }
        }

        // Copy remaining elements
        while (i < n1)
            arr[k++] = L[i++];

        while (j < n2)
            arr[k++] = R[j++];
    }

    private static void printArray(int[] arr) {
        for (int v : arr) {
            System.out.print(v + " ");
        }
        System.out.println();
    }
}