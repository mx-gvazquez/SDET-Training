package com.sdet.interview;

public class _15_Even_Odd {
    public static void main(String[] args) {
        evenOrOdd(5); // Odd
        evenOrOdd(2); // Even
        evenOrOdd(100); // Even
        evenOrOdd(101); // Odd
    }

    public static void evenOrOdd(int num){
        // Short Hand if-else     Operador Ternario

        String result = (num % 2 == 0) ? "Even" : "Odd";
        System.out.println(result);

        /* // if - else
        if (num % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
         */
    }
}
