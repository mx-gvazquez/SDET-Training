package com.sdet.interview;

public class _07_Max_Number_Array {
    public static void main(String[] args) {
        System.out.println(max(new int[] {4, 781, 8, 99, 103})); // 781
        System.out.println(max(new int[] {1, 2, 3, 4, 5})); // 5
        System.out.println(max(new int[] {3, 4})); // 4
        System.out.println(max(new int[] {100})); // 100
    }

    public static int max(int[] arr){
        int max = arr[0]; // assume first element is biggest

        // check assumption against avery element in array

        for (int num : arr){
            // if 'max' wasn't the biggest element, update 'max'
            if (max < num){
                max = num;
            }
        }

        return max;
    }

}
