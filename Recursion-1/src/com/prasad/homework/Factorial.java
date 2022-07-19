package com.prasad.homework;

public class Factorial {

  public int solve(int A) {
    if (A == 0) return 1;

    return solve(A - 1) * A;
  }

}
