package com.prasad.assignment;

import java.util.ArrayList;

public class LuckyPrimes {

  public static void main(String[] args) {
    System.out.println(solve(12));
  }

  public static int solve(int A) {

    int n = A + 1;
    int[] spf = new int[n];
    for (int i = 1; i < n; i++) {
      spf[i] = i;
    }

    int range = (int) Math.sqrt(n);
    for (int i = 2; i <= range; i++) {
      for (int j = i * i; j < n ; j += i) {
        if (spf[j] == j) {
          spf[j] = i;
        }
      }
    }

    int count = 0;
    for (int i = 2; i < n; i++) {
      int num = i;
      int divisorsCount = 0;
      while (num > 1) {
        int  p = spf[num];
        boolean check = true;
        while (num % p == 0) {
          if (check) {
            divisorsCount++;
          }
          check = false;
          num = num/p;
        }
      }

      if (divisorsCount == 2) count++;
    }
    return count;
  }

}
