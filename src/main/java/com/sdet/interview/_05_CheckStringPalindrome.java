package com.sdet.interview;

/**
 * <h1>Prime Number</h1>
 * A palindrome is a Word, phrase, number or sequence of
 * words that reads the same backward or forward.
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
public class _05_CheckStringPalindrome {

    public static void main(String[] args) {
        System.out.println(isPal("anna"));    // true
        System.out.println(isPal("apple"));    // false
        System.out.println(isPal("level"));    // true
    }

    public static boolean isPal(String str){
        int start = 0;
        int end = str.length() -1;
        while (start < end){
            // if pointers values are not equal, return false
            if(str.charAt(start) != str.charAt(end)){
                return false;
            }
            start++;
            end--;
        }

        return true;
    }

} 
