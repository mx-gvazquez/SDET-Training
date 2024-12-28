package com.sdet.interview;

public class _17_Fibonacci {
    public static void main(String[] args) {
        fib(10);
    }

    public static void fib(int n){
        int numOne = 0;
        int numTwo = 1;
        System.out.println(numOne + " ");
        System.out.println(numTwo + " ");
        for (int i = 0; i < n - 2; i++){
            int sum = numOne + numTwo;
            System.out.println(sum + " ");
            numOne = numTwo;
            numTwo = sum;
        }
        System.out.println();
    }
}
