package com.sdet.interview;

// 5! = 5 * 4 * 3 * 2 * 1

public class _20_Factorial_Recursion_2 {

    public static void main(String[] args) {
        long result = sum(5);
        System.out.println(result);
    }
    public static int sum(int k) {
        if (k == 0 || k == 1) {
            return 1;
        } else {
            return k * sum(k - 1);
        }
    }

}


