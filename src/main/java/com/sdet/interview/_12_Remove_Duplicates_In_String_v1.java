package com.sdet.interview;

/**
 * Write a method that accepts one string
 * argument and returns it without duplicates.
 */
public class _12_Remove_Duplicates_In_String_v1 {
    public static void main(String[] args) {
        System.out.println(removeDup("hello")); // helo
        System.out.println(removeDup("applep")); // aple
        System.out.println(removeDup("aaaaaa")); // a
        System.out.println(removeDup("abc")); // abc
    }

    public static String removeDup(String str){
        StringBuilder strNoDup = new StringBuilder();
        for(char ch : str.toCharArray()){
            if(!strNoDup.toString().contains(String.valueOf(ch))){
                strNoDup.append(ch);
            }
        }
        return strNoDup.toString();
    }

}
