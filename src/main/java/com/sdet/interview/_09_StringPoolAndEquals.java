package com.sdet.interview;

public class _09_StringPoolAndEquals {
    public static void main(String[] args) {
        String str = "apple";
        String str1 = "apple";
        String str2 = new String( "apple");

        // == checks if two references pointing to the same object or not
        System.out.println(str == str1);        // true
        System.out.println(str == str2);        // false
        System.out.println(str.equals(str2));   // true
    }
}
