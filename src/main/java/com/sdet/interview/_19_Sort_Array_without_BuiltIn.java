package com.sdet.interview;

import java.util.Arrays;

public class _19_Sort_Array_without_BuiltIn {
    public static void main(String[] args) {
        int[]  arrNum = {6, 5, 2, 1, 9, 10, 0};
        System.out.println(Arrays.toString(arrNum)); // [6, 5, 2, 1, 9, 10, 0]
        sSort(arrNum);
        System.out.println(Arrays.toString(arrNum)); // [0, 1, 2, 5, 6, 9, 10]
    }
    /**
     * Selection Sort - Big O(n^2) quadratic
     */
    public static void sSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int minIndex = i;
            int min = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                if (min > arr[j]) {
                    min = arr[j];
                    minIndex = j;
                }
            }
            int tmp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = tmp;
        }
    }
}
