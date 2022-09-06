package com.prasad.assignment;

import java.util.Stack;

public class DoubleCharacterTrouble {

    public static void main(String[] args) {
        System.out.println(solve("cddfeffe"));
    }

    public static String solve(String A) {
        int n = A.length();
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < n; i++) {
            char c = A.charAt(i);
            if(stack.isEmpty() || stack.peek() != c) {
                stack.push(c);
            } else {
                stack.pop();
            }
        }
        if (stack.size() == 0) return "";
        StringBuilder sb = new StringBuilder();
        stack.forEach(c -> sb.append(c));
        return sb.toString();
    }
}
