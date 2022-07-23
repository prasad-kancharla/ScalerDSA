package com.prasad.homework;

public class KthSymbol {

  public static void main(String[] args) {
    System.out.println(solve(2,2));
  }
  public static int solve(int A, int B) {
    if (A == 1 || B == 1) {
      return 0;
    }

    int parent = solve(A - 1, (B + 1)/2);

    if (B % 2 == 0) {
      return (1 - parent);
    }
    return parent;
  }

}
