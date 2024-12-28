package com.sdet.interview;

public class _07_Min_Number_Array {
    public static void main(String[] args) {
        System.out.println(min(new int[] {4, 781, 8, 99, 103})); // 781
        System.out.println(min(new int[] {1, 2, 3, 4, 5})); // 5
        System.out.println(min(new int[] {3, 4})); // 4
        System.out.println(min(new int[] {100})); // 100
    }

    public static int min(int[] arr){
        int min = arr[0]; // assume first element is lowest

        // check assumption against avery element in array

        for (int num : arr){
            // if 'min' wasn't the lowest element, update 'min'
            if (min > num){
                min = num;
            }
        }

        return min;
    }
}
