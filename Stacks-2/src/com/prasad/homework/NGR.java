package com.prasad.homework;

import java.util.Stack;

public class NGR {
  public int[] nextGreater(int[] A) {
    int n = A.length;
    Stack<Integer> stack = new Stack<>();
    int[] ngr = new int[n];

    for (int i = n - 1; i >= 0; i--) {
      while (!stack.isEmpty() && stack.peek() <= A[i]) {
        stack.pop();
      }

      ngr[i] = stack.isEmpty() ? - 1 : stack.peek();
      stack.push(A[i]);
    }
    return ngr;
  }
}
