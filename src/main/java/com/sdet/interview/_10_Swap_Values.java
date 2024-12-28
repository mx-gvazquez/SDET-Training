package com.sdet.interview;

/**
 * Swap values of two variables without direct reassignment and
 * without creating any extra variables.
 */
public class _10_Swap_Values {
    public static void main(String[] args) {
        int i = 10;
        int j = 15;

        // TODO swap values of i and j without creating any variable
        j = j - i; // j = 15 - 10; j = 5
        i = i + j; // i = 10 + 5; i = 15
        j = i - j; // j = 15 - 5; j = 10

        System.out.println(i);
        System.out.println(j);
    }
}
