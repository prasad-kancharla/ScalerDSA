package com.prasad.assignment;

public class DeleteOneMaxGCD {

  public static void main(String[] args) {

  }

  public static int solve(int[] A) {
    int n = A.length;

    int[] prefixGCD = new int[n];
    int[] suffixGCD = new int[n];

    int a = 0;
    for (int i = 0; i < n; i++) {
      a = getGCD(A[i],a);
      prefixGCD[i] = a;
    }

    int b = 0;
    for (int i = n - 1; i >= 0 ; i--) {
      b = getGCD(A[i],b);
      suffixGCD[i] = b;
    }

    int maxGCD = 1;
    for (int i = 0; i < n; i++) {
      if (i == 0) {
        maxGCD = Math.max(suffixGCD[1], maxGCD);
      } else if (i == n - 1) {
        maxGCD = Math.max(prefixGCD[n - 2], maxGCD);
      } else {
        maxGCD = Math.max(getGCD(prefixGCD[i - 1], suffixGCD[i + 1]), maxGCD);
      }
    }

    return maxGCD;
  }

  public static int getGCD(int a, int b) {
    if (b == 0) {
      return a;
    }
    return getGCD(b, a % b);
  }

}
