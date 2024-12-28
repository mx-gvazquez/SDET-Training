package com.sdet.interview;

import java.util.Stack;

public class _18_BalancedStr {

        public static void main(String[] args) {
            System.out.println(isBalanced("[{()}]")); // true
            System.out.println(isBalanced("[({(})]")); // false
            System.out.println(isBalanced("{[}")); // false
            System.out.println(isBalanced("({}{}([{}]))")); // true
            System.out.println(isBalanced("({")); // false
        }
        public static boolean isBalanced(String str) {
            Stack<Character> st = new Stack<>();
            for (char ch : str.toCharArray()) {
                if (ch == '{' || ch == '[' || ch == '(') {
                    st.push(ch);
                } else {
                    if (st.isEmpty()) { return false; }
                    char lOpen = st.pop();
                    if (ch == '}' && lOpen != '{') { return false; }
                    else if (ch == ']' && lOpen != '[') { return false; }
                    else if (ch == ')' && lOpen != '(') { return false; }
                }
            }
            return st.isEmpty();
        }
    }
