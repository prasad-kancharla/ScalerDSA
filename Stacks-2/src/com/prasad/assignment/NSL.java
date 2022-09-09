package com.prasad.assignment;

import java.util.Arrays;
import java.util.Stack;

public class NSL {

  public static void main(String[] args) {
    int[] A = {4, 5, 2, 10, 8};
    System.out.println(Arrays.toString(prevSmaller(A)));
  }

  public static int[] prevSmaller(int[] A) {
    int n = A.length;
    int[] nsl = new int[n];

    Stack<Integer> stack = new Stack<>();

    for (int i = 0; i < n; i++) {
      while (!stack.isEmpty() && stack.peek() >= A[i]) {
        stack.pop();
      }
      if (stack.isEmpty()) {
        nsl[i] = -1;
      } else {
        nsl[i] = stack.peek();
      }
      stack.push(A[i]);
    }
    return nsl;
  }

}
