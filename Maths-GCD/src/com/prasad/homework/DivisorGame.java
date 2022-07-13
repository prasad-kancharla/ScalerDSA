package com.prasad.homework;

public class DivisorGame {

  public static void main(String[] args) {

  }

  public static int solve(int A, int B, int C) {
    int gcd = getGCD(B,C);
    int lcm = (B/gcd) * C;

    return A/lcm;
  }

  private static int getGCD(int a, int b) {
    if (b==0) return a;
    return getGCD(b, a%b);
  }

}
