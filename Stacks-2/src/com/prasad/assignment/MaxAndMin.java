package com.prasad.assignment;

import java.util.Stack;

public class MaxAndMin {

  public static void main(String[] args) {
    int[] A = {4, 7, 3, 8};
    System.out.println(solve(A));
  }

  public static int solve(int[] A) {
    int n = A.length;
    if (n == 1) return 0;

    int[] ngl = getNGL(A,n);
    int[] ngr = getNGR(A,n);

    int[] nsl = getNSL(A,n);
    int[] nsr = getNSR(A,n);

    long sum = 0;
    int m = 1000000007;

    for (int i = 0; i < n; i++) {
      long maxStart = ngl[i] + 1; // if ngl is -1 then start is 0
      long maxEnd = ngr[i] == -1 ? n - 1 : ngr[i] - 1;
      long noOfMaxSubArrays = (i - maxStart + 1) * (maxEnd - i + 1);

      long minStart = nsl[i] + 1;
      long minEnd = nsr[i] == -1 ? n - 1 : nsr[i] - 1;
      long noOfMinSubArrays = (i - minStart + 1) * (minEnd - i + 1);
      long product = ((noOfMaxSubArrays - noOfMinSubArrays) * A[i]) % m;
      if (product < 0) product = product + m;
      sum = (sum % m + product % m) % m;
      if (sum < 0) sum = sum + m;
    }
    return (int) (sum);
  }

  private static int[] getNGL(int[] A, int n) {
    int[] ngl = new int[n];
    Stack<Integer> stack = new Stack<>();

    for (int i = 0; i < n; i++) {
      while (!stack.isEmpty() && A[stack.peek()] <= A[i]) {
        stack.pop();
      }
      ngl[i] = stack.isEmpty() ? -1 : stack.peek();
      stack.push(i);
    }
    return ngl;
  }
  private static int[] getNGR(int[] A, int n) {
    int[] ngr = new int[n];
    Stack<Integer> stack = new Stack<>();

    for (int i = n - 1; i >= 0; i--) {
      while (!stack.isEmpty() && A[stack.peek()] <= A[i]) {
        stack.pop();
      }
      ngr[i] = stack.isEmpty() ? -1 : stack.peek();
      stack.push(i);
    }
    return ngr;
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
