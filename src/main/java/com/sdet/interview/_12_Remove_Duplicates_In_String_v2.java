package com.sdet.interview;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Write a method that accepts one string
 * argument and returns it without duplicates. 
 */
public class _12_Remove_Duplicates_In_String_v2 {
    public static void main(String[] args) {
        System.out.println(removeDupWithSet("hello")); // helo
        System.out.println(removeDupWithSet("applep")); // aple
        System.out.println(removeDupWithSet("aaaaaa")); // a
        System.out.println(removeDupWithSet("abc")); // abc
    }
    // Big O (n) linear
    // or do it with Set
    public static String removeDupWithSet(String str){
        // Break String into chars, store as SET to remove duplicates
        Set<Character> set = new LinkedHashSet<>();
        for(char ch : str.toCharArray()){
            set.add(ch);
        }

        // convert back 'set' of chars to String
        StringBuilder strNoDup = new StringBuilder();
        for (char ch : set){
            strNoDup.append(ch);
        }
        return strNoDup.toString();
    }

}
