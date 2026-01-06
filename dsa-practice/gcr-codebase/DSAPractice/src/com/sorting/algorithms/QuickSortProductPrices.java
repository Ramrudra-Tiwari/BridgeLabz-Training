package com.sorting.algorithms;

public class QuickSortProductPrices {

    public static void main(String[] args) {

        int[] prices = {1200, 450, 800, 300, 1500};

        System.out.println("Product Prices Before Sorting:");
        printArray(prices);

        quickSort(prices, 0, prices.length - 1);

        System.out.println("\nProduct Prices After Sorting:");
        printArray(prices);
    }

    private static void quickSort(int[] arr, int low, int high) {

        if (low < high) {
            int pivotIndex = partition(arr, low, high);

            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    // Partition method
    private static int partition(int[] arr, int low, int high) {

        int pivot = arr[high];   // choose last element as pivot
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }

        swap(arr, i + 1, high);
        return i + 1;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private static void printArray(int[] arr) {
        for (int v : arr) {
            System.out.print(v + " ");
        }
        System.out.println();
    }
}