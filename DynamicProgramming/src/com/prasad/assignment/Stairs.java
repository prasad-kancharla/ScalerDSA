package com.prasad.assignment;

public class Stairs {

  public static void main(String[] args) {
    System.out.println(climbStairs(4));
  }

  public static int climbStairs(int A) {
    long[] stairsArray = new long[A + 1];
    for (int i = 0; i < A + 1; i++) {
      stairsArray[i] = -1;
    }
    stairsArray[1] = 1;
    if (A > 1) {
      stairsArray[2] = 2;
    }
    return climbStairs(A, stairsArray);
  }

  public static int climbStairs(int A, long[] stairsArray) {
    int m = 1000000007;
    if (stairsArray[A] != -1) {
      return (int) stairsArray[A];
    }
    if (stairsArray[A - 1] == -1) {
      stairsArray[A - 1] = climbStairs(A - 1, stairsArray);
    }
    if (stairsArray[A - 2] == -1) {
      stairsArray[A - 2] = climbStairs(A - 2, stairsArray);
    }
    stairsArray[A] = Math.floorMod(stairsArray[A - 1] + stairsArray[A - 2], 1000000007);
    return (int) stairsArray[A];
  }

}
