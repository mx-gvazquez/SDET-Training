package com.sdet.interview;

import java.util.LinkedHashMap;
import java.util.Map;

public class _13_Count_Letters_String {
    public static void main(String[] args) {
        System.out.println(countLetters("hello")); // {h=1, e=1, l=2, o=1}
        System.out.println(countLetters("aaaaaa")); // {a=6}
        System.out.println(countLetters("abc")); // {a=1, b=1, c=1}
        System.out.println(countLetters("abca")); // {a=1, b=1, c=1}
    }
    /**
     * Find out how many of each letter exist in the string
     */

    public static Map<Character, Integer> countLetters(String str){
        Map<Character, Integer> letters = new LinkedHashMap<>();
        for(char ch : str.toCharArray()){
            if(letters.containsKey(ch)){
                int count = letters.get(ch);
                letters.put(ch, count +1);
            } else {
                letters.put(ch, 1);
            }
        }
        return letters;
    }
}
