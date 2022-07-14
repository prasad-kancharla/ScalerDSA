package com.prasad.homework;

import java.util.ArrayList;

public class DistinctPrimes {

  public static void main(String[] args) {
    int[] arr = {1, 2, 3, 4};
    System.out.println(solve(arr));
  }

  public static int solve(int[] A) {
    int n = A.length;
    int maxNum = Integer.MIN_VALUE;
    for (int i = 0; i < n; i++) {
      maxNum = Math.max(A[i], maxNum);
    }

    boolean[] primes = new boolean[maxNum + 1];

    for (int i = 2; i < maxNum + 1; i++) {
      primes[i] = true;
    }

    int range = (int) Math.sqrt(maxNum);
    for (int i = 2; i <= range; i++) {
      for (int j = i * i; j < maxNum + 1; j += i) {
        primes[j] = false;
      }
    }

    ArrayList<Integer> list = new ArrayList<>();
    for (int i = 0; i < n; i++) {
      if(primes[A[i]]) {
        if (!list.contains(A[i])) list.add(A[i]);
      } else {
        int m = (int) Math.sqrt(A[i]);
        for (int j = 1; j <= m ; j++) {
          if (A[i] % j == 0) {
            if(primes[j] && !list.contains(j)) list.add(j);
            if(primes[A[i]/j] && !list.contains(A[i]/j)) list.add(A[i]/j);
          }
        }
      }
    }
    return list.size();
  }

}
