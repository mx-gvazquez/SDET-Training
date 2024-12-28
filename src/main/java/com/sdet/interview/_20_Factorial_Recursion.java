package com.sdet.interview;

// 5! = 5 * 4 * 3 * 2 * 1

public class _20_Factorial_Recursion {

    public static void main(String[] args) {
        // Driver Code
        int num = 5;
        System.out.println("number : " + num);
        System.out.println("Factorial : " + factorial(num));
    }

    public static int factorial(int n) {
        // Checking the number
        // is 1 or 0 then
        // return 1
        // otherwise return
        // factorial
        if (n == 1 || n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1); // Recursion
        }
    }

}


