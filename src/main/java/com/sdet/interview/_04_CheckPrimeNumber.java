package com.sdet.interview;

/**
 * <h1>Prime Number</h1>
 * A 'prime number' is a number that can only be divided by itself and '1'
 * without a reminder (modulus  '%').
 * <p>
 * <b>Note:</b> Giving proper comments in your program makes it more
 * user-friendly, and it is assumed as a high quality code.
 *
 *
 * @author  German Vazquez
 * @version 1.0
 * @since   2024-12-10
 * @param   num The text we want to reverse
 * @return  Reversed 'str' argument.
 */
public class _04_CheckPrimeNumber {

    public static void main(String[] args) {
        System.out.println(isPrime(5));    // true
        System.out.println(isPrime(29));    // true
        System.out.println(isPrime(35));    // false
        System.out.println(isPrime(20));    // false
        System.out.println(isPrime(7));     // true

    }

    public static boolean isPrime(int num){
        // create numbers from 2 'till half inclusive of the num
        for (int i = 2; i <= num / 2 ; i++) {
            if (num % i == 0){
                return false;
            }
        }
        return true;
    }

} 
