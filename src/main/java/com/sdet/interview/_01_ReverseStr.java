package com.sdet.interview;

/**
 * <h1>String Reverse</h1>
 * The 'ReverseStr' program implements a method that
 * will take one string as an argument and return the reverse version of this string.
 * <p>
 * <b>Note:</b> Giving proper comments in your program makes it more
 * user-friendly, and it is assumed as a high quality code.
 *
 *
 * @author  German Vazquez
 * @version 1.0
 * @since   2024-10-30
 * @param   str The text we want to reverse
 * @return  Reversed 'str' string argument.
 */
public class _01_ReverseStr{


    public static void main(String[] args){
        System.out.println(revStr("apple")); //elppa
        System.out.println(revStr("John")); //nhoJ
        System.out.println(revStr("phone")); //enohp
        System.out.println(revStr("1234567")); // 7654321
    }

    public static String revStr(String str){
        StringBuilder res = new StringBuilder();
        int last_index = str.length() - 1;
        System.out.println(str + " has a SIZE of " + str.length() + " chars, but last INDEX is on position " + last_index);
        // The SIZE of String Array, starts counting elements at '1'
        // So, there's the need to subtract 1 from the 'total length', since we start from the LAST element...
        for (int i = str.length() - 1; i >=0 ; i--){ // The INDEX of array elements, starts counting at '0'
            res.append(str.charAt(i));
        }
        return res.toString();
    }

} 
