package com.sdet.interview;

import java.util.Arrays;

public class _11_Two_String_Anagram {
    public static void main(String[] args) {
        System.out.println(isAnagram("listen", "silent")); // true
        System.out.println(isAnagram("triangle", "integral")); // true
        System.out.println(isAnagram("abc", "bca")); // true
        System.out.println(isAnagram("abc", "ccb")); // false
        System.out.println(isAnagram("aaa", "aaab")); // false
    }
    /**
     * Big O(n log(n))
     * An anagram is when all the letters in one string exist in another
     * but the order of letters does not matter.
     */
    public static boolean isAnagram(String str,String str1){
        // convert both Strings to Char
        char[] arrStr = str.toCharArray();
        char[] arrStr1 = str1.toCharArray();

        // sort both char[] arrays
        Arrays.sort(arrStr);
        Arrays.sort(arrStr1);
        // compare sorted char[] arrays
        return Arrays.equals(arrStr, arrStr1);
    }
}
