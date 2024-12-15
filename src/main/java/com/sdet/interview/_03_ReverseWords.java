package com.sdet.interview;

import java.util.Arrays;

/**
 * <h1>Word Reverse</h1>
 * The 'ReverseWords' program implements a method that
 * will take a string as an argument and return the position of words and return it.
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
public class _03_ReverseWords {

    public static void main(String[] args) {
        System.out.println(revWords("apple banana kiwi"));  // kiwi banana apple
        System.out.println(revWords("I am John Doe"));      //Doe John am I
        System.out.println("Orange");                           //Orange
    }

    public static String revWords(String str){
        StringBuilder res = new StringBuilder();
        String[] words = str.split(" ");
        for (int i = words.length -1; i >= 0 ; i--) {
            res.append(words[i]).append(" ");
        }
        return res.toString().trim();

    }

} 
