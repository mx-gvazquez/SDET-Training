package com.sdet.interview;

/**
 * Big O(1) constant
 * Print numbers from 1 to 100 inclusive, but
 * - if number is divisible by 3, print Fizz
 * - if number is divisible by 5, print Buzz
 * - if number is divisible by 3 and 5, print FizzBuzz
 */
public class _14_FizzBuzz {
    public static void main(String[] args) {
        fizzBuzz();
    }

    public static void fizzBuzz(){
        for(int i=1; i<=100; i++){
            if(i % 3 == 0 && i % 5 == 0){
                System.out.println("FizzBuzz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else {
                System.out.println(i);
            }
        }
    }

}
