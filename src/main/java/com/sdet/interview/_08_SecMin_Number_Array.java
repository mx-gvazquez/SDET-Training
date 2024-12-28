package com.sdet.interview;

import java.util.Arrays;

public class _08_SecMin_Number_Array {
    public static void main(String[] args) {
        System.out.println(secMin(new int[] {4, 781, 8, 99, 103})); // 781
        System.out.println(secMin(new int[] {1, 2, 3, 4, 5})); // 5
        System.out.println(secMin(new int[] {3, 4})); // 4
    }

    public static int secMin(int[] numArr){
        // Ordena el arreglo de menor a mayor
        Arrays.sort(numArr);
        // Elige el segundo elemento.
        if(numArr.length > 1){
            return numArr[1];
        }
        return numArr[0];

    }

}
