package com.sdet.interview;

import java.util.Arrays;

/**
 * <h1>Array Reverse</h1>
 * The 'ReverseArray' program implements a method that
 * will take an array as an argument and return the reverse version of it.
 * <p>
 * <b>Note:</b> Giving proper comments in your program makes it more
 * user-friendly, and it is assumed as a high quality code.
 *
 *
 * @author  German Vazquez
 * @version 1.0
 * @since   2024-12-10
 * @param   arr The text we want to reverse
 * @return  Reversed 'arr' argument.
 */
public class _02_ReverseArray {

    // main method that instanciates the 'revArr' method
    public static void main(String[] args) {
        int[] inputArr = new int[] {1,2,3,4,5};
        System.out.println(Arrays.toString(inputArr));  // [1, 2, 3, 4, 5]
        revArr(inputArr);
        System.out.println(Arrays.toString(inputArr));
        System.out.println(inputArr[0]);
    }

    // revArr - Actual code

    public static void revArr(int[] arr){
        int start = 0;
        int end = arr.length -1;
        while (start < end){
            int tmp = arr[start];
            arr[start] = arr[end];
            arr[end] = tmp;
            start++;
            end--;
        }
    }

} 
