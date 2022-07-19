package com.prasad.assignment;

public class FastPower {

  public static void main(String[] args) {
    System.out.println(pow(71045970,41535484,64735492));
  }

  public static int pow(int A, int B, int C) {
    if (A == 0) {
      return 0;
    }
    if (B == 0) {
      return 1;
    }

    long ans = pow(A, B/2, C);
    ans = (ans * ans) % C;
    if ((B & 1) != 0) {
      ans = (ans * A) % C;
    }

    return (int) ((ans + C) % C);
  }

}
