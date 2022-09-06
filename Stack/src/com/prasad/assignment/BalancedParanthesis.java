package com.prasad.assignment;

import java.util.Stack;

public class BalancedParanthesis {

    public static void main(String[] args) {
        System.out.println(solve("{([])}"));
    }

    public static int solve(String A) {
        Stack<Character> stack = new Stack<>();
        int n = A.length();

        for (int i = 0; i < n; i++) {
            char c = A.charAt(i);
            if (c == '{' || c == '[' || c =='(' ) {
                stack.push(c);
            } else if (c == '}' && !stack.isEmpty() && stack.peek() == '{') {
                stack.pop();
            }  else if (c == ']' && !stack.isEmpty() && stack.peek() == '[') {
                stack.pop();
            }  else if (c == ')' && !stack.isEmpty() && stack.peek() == '(') {
                stack.pop();
            } else {
                return 0;
            }
        }

        if (stack.isEmpty()) return 1;
        return 0;
    }
}
