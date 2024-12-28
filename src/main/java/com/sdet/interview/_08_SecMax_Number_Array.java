package com.sdet.interview;

public class _08_SecMax_Number_Array {
    public static void main(String[] args) {
        System.out.println(secMax(new int[] {4, 781, 8, 99, 103})); // 781
        System.out.println(secMax(new int[] {1, 2, 3, 4, 5})); // 5
        System.out.println(secMax(new int[] {3, 4})); // 4
    }

    public static int secMax(int[] arr){
        // 1. Get max/min and save index
        int maxIndex = getMaxIndex(arr, -1);

        // 2. Get max/min by avoiding first max
        return arr[getMaxIndex(arr, maxIndex)];
    }

    private static int getMaxIndex(int[] arr, int avoidIndex){
        int max = Integer.MIN_VALUE;
        int maxIndex = -1;
        for(int i = 0; i < arr.length; i++){
            if(i != avoidIndex && max < arr[i]){
                max = arr[i];
                maxIndex = i;
            }
        }
        return maxIndex;
    }
    
}
