package com.sdet.interview;

// 5! = 5 * 4 * 3 * 2 * 1
public class _20_Factorial {
    public static void main(String[] args) {
        System.out.println(Factorial(4));
    }

    public static long Factorial(int n){
        int factorial = 1;
        for (int i = 2; i<=n; i++){
            factorial *= i;
        }
        return factorial;
    }
}
