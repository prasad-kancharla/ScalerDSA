package com.prasad.assignment;

public class maxSumSubArray {

  public static void main(String[] args) {
    int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
    System.out.println(maxSubArrayOptimizedFurther(arr));
  }

  // kadane's algorithm
  public static int maxSubArray(final int[] A) {
    int maxSum = Integer.MIN_VALUE;
    int carryForward = 0;
    int length = A.length;
    for (int i = 0; i < length; i++) {
      int sum = A[i] + carryForward;
      if (sum > maxSum) maxSum = sum;
      if (sum > 0) {
        carryForward = sum;
      } else {
        carryForward = 0;
      }
    }
    return maxSum;
  }

  public static int maxSubArrayOptimizedFurther(final int[] A) {
    int maxSum = Integer.MIN_VALUE;
    int sum = 0;
    int length = A.length;
    for (int i = 0; i < length; i++) {
      sum = A[i] + sum;
      if (sum > maxSum) maxSum = sum;
      if (sum < 0) sum = 0;
    }
    return maxSum;
  }
}
