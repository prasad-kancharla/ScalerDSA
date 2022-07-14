package com.prasad.assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class PrimeSum {

  public static void main(String[] args) {
    System.out.println(Arrays.toString(primesum(16777214)));
  }

  public static int[] primesum(int A) {
    boolean[] primes = new boolean[A + 1];

    for (int i = 0; i < A + 1; i++) {
      primes[i] = true;
    }
    primes[0] = primes[1] = false;
    int range = (int) Math.sqrt(A);
    for (int i = 2; i <= range; i++) {
      for (int j = i * i; j < A + 1 ; j += i) {
        primes[j] = false;
      }
    }

    ArrayList<Integer> list = new ArrayList<>();
    for (int i = 0; i < A + 1; i++) {
      if (primes[i]) {
        list.add(i);
      }
    }

    Collections.sort(list);
    int[] out = new int[2];

    for (Integer num : list) {
      if (list.contains(A - num)) {
        out[0] = num;
        out[1] = A - num;
        return out;
      }
    }

    return out;
  }

}
