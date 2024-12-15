package com.sdet.interview;

/**
 * <h1>Prime Number</h1>
 * A palindrome is a Word, phrase, number or sequence of
 * words that reads the same backward or forward.
 * The straight forward solution would be convert the 'number' to 'String' and use last Method.
 * Some interviewers will not allow it. Let's find another solution.
 *
 * <p>
 * <b>Note:</b> Giving proper comments in your program makes it more
 * user-friendly, and it is assumed as a high quality code.
 *
 *
 * @author  German Vazquez
 * @version 1.0
 * @since   2024-12-10
 * @param   str The text we want to reverse
 * @return  Reversed 'str' argument.
 */
public class _06_CheckNumberPalindrome {

    public static void main(String[] args) {
        System.out.println(isPal(54545));    // true
        System.out.println(isPal(13));    // false
        System.out.println(isPal(33));    // true
    }

    public static boolean isPal(int num){
        int copy = num;
        int rev = 0;
        int rightMost;
        while (num > 0){
            rightMost = num % 10; //get right most
            rev = (rev * 10) + rightMost; // concatenate to rev
            num = num / 10; // remove right most from num
        }
        return copy == rev;
    }

} 
