package com.prasad.assignment;

public class AbsMax {

  public static void main(String[] args) {
    int[] A = {1, 2, 3, 4};
    int[] B = {-1, 4, 5, 6};
    int[] C = {-10, 5, 3, -8};
    int[] D = {-1, -9, -6, -10};
    System.out.println(solve(A,B,C,D));
  }


  // Partially Correct - TLE
  public static int solve(int[] A, int[] B, int[] C, int[] D) {
    int length = A.length;
    int maxSum = Integer.MIN_VALUE;

    for (int i = 0; i < length; i++) {
      for (int j = i + 1; j < length ; j++) {
        int sum = Math.abs(A[i] - A[j]) + Math.abs(B[i] - B[j]) + Math.abs(C[i] - C[j]) + Math.abs(D[i] - D[j]) + Math.abs(i - j);
        if (sum > maxSum) {
          maxSum = sum;
        }
      }
    }
    return maxSum;
  }

}
