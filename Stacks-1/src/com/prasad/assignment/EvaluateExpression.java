package com.prasad.assignment;

import java.util.Stack;

public class EvaluateExpression {

    public static void main(String[] args) {
        String[] input = {"2", "2", "/" };
        System.out.println(evalRPN(input));
    }

    public static int evalRPN(String[] A) {
        Stack<String> stack = new Stack<>();
        int n = A.length;
        int ans = 0;
        for (int i = 0; i < n; i++) {
            String s = A[i];
            if (!s.equals("+") && !s.equals("-") && !s.equals("*") && !s.equals("/")) {
                stack.push(s);
            } else {
                int num2 = Integer.valueOf(stack.pop());
                int num1 = Integer.valueOf(stack.pop());

                if (s.equals("+")) ans = num1 + num2;
                if (s.equals("-")) ans = num1 - num2;
                if (s.equals("*")) ans = num1 * num2;
                if (s.equals("/")) ans = num1 / num2;

                stack.push(String.valueOf(ans));
            }
        }
        return Integer.valueOf(stack.peek());
    }
}
