package com.prasad.assignment;

public class MagicNumber {

  public static void main(String[] args) {
    System.out.println(solve(83557));
  }

  public static int solve(int A) {
    int sum = A;
    while (sum > 9) {
      sum = getSumOfDigits(sum);
    }
    if (sum == 1) {
      return 1;
    } else {
      return 0;
    }
  }

  public static int getSumOfDigits(int A) {
    if (A == 0) {
      return 0;
    }

    return getSumOfDigits(A / 10) + A % 10;
  }

  public int solveWithoutRecursion(int A) {
    if (A % 9 == 1) return 1;
    return 0;
  }
}
