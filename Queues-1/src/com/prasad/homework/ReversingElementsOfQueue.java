package com.prasad.homework;

import java.util.Stack;

public class ReversingElementsOfQueue {

  public int[] solve(int[] A, int B) {
    int n = A.length;
    Stack<Integer> stack = new Stack<>();
    for (int i = 0; i < B; i++) {
      stack.push(A[i]);
    }
    int[] out = new int[n];
    for (int i = 0; i < B; i++) {
      out[i] = stack.pop();
    }
    for (int i = B; i < n ; i++) {
      out[i] = A[i];
    }
    return out;
  }

}
