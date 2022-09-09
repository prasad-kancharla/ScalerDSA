package com.prasad.homework;

import java.util.Stack;

public class MaxRectangle {

  public int solve(int[][] A) {
    int n = A.length;
    int m = A[0].length;

    int maxArea = 0;
    int[] input = A[0];
    for (int i = 0; i < n; i++) {
      int area = largestRectangleArea(input);
      maxArea = Math.max(area, maxArea);

      if (i < n - 1) {
        for(int j = 0; j < m; j++) {
          input[j] = A[i + 1][j] == 0 ? 0 : input[j] + A[i + 1][j];
        }
      }
    }

    return maxArea;
  }

  public static int largestRectangleArea(int[] A) {
    int n = A.length;
    if (n == 1) {
      return A[0];
    }
    int[] nsl = getNSL(A,n);
    int[] nsr = getNSR(A,n);

    int maxArea = 0;

    for (int i = 0; i < n; i++) {
      int start = nsl[i] == -1 ? 0 : nsl[i] + 1;
      int end = nsr[i] == -1 ? n - 1 : nsr[i] - 1;

      int area = A[i] * (end - start + 1);
      maxArea = Math.max(area, maxArea);
    }
    return maxArea;
  }

  private static int[] getNSL(int[] A, int n) {

    int[] nsl = new int[n];
    Stack<Integer> stack = new Stack<>();
    for (int i = 0; i < n; i++) {
      while (!stack.isEmpty() && A[stack.peek()] >= A[i]) {
        stack.pop();
      }
      nsl[i] = stack.isEmpty() ? -1 : stack.peek();
      stack.push(i);
    }
    return nsl;
  }

  private static int[] getNSR(int[] A, int n) {
    int[] nsr = new int[n];
    Stack<Integer> stack = new Stack<>();

    for (int i = n - 1; i >= 0; i--) {
      while (!stack.isEmpty() && A[stack.peek()] >= A[i]) {
        stack.pop();
      }
      nsr[i] = stack.isEmpty() ? -1 : stack.peek();
      stack.push(i);
    }
    return nsr;
  }

}
