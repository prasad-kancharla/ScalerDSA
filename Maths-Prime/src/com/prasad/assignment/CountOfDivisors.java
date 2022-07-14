package com.prasad.assignment;

import java.util.Arrays;

public class CountOfDivisors {

  public static void main(String[] args) {
    int[] arr = {8, 9, 10};
    System.out.println(Arrays.toString(solve(arr)));
  }

  public static int[] solve(int[] A) {
    int n = A.length;
    int maxNum = Integer.MIN_VALUE;
    for (int i = 0; i < n; i++) {
      maxNum = Math.max(A[i],maxNum);
    }

    int[] spf = new int[maxNum + 1];
    for (int i = 1; i < maxNum + 1; i++) {
      spf[i] = i;
    }

    int range = (int) Math.sqrt(maxNum + 1);
    for (int i = 2; i <= range; i++) {
      for (int j = i * i; j < maxNum + 1 ; j += i) {
        if (spf[j] == j) {
          spf[j] = i;
        }
      }
    }

    int[] out = new int[n];

    for (int i = 0; i < n; i++) {
      int num = A[i];
      int divisorsCount = 1;
      while (num > 1) {
        int  p = spf[num];
        int count = 0;
        while (num % p == 0) {
          count++;
          num = num/p;
        }
        divisorsCount = divisorsCount * (count + 1);
      }
      out[i] = divisorsCount;
    }
    return out;
  }
}
