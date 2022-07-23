package com.prasad.assignment;

public class NCR {

  public static void main(String[] args) {
    System.out.println(solve(1,1,17957));
  }

  public static int solve(int A, int B, int C) {
    int[] factorialArray = new int[A + 1];
    factorialArray[0] = 1;
    long prod = 1;
    for (int i = 1; i <= A; i++) {
      prod *= i;
      prod = (prod + C) % C;
      factorialArray[i] = (int) prod;
    }

    long term1 = (factorialArray[A] + C)% C;
    long term2 =  getFastPower(factorialArray[A - B], C - 2, C);
    long term3 = getFastPower(factorialArray[B], C-2, C);

    long ans = (((term1 * term2) % C) * term3) % C;
    return (int) (ans + C) % C;
  }


  public static int getFastPower(int A, int B, int C) {
    if (A == 0) {
      return 0;
    }
    if (B == 0) {
      return 1;
    }

    long temp = getFastPower(A, B/2, C);
    temp = (temp * temp) % C;
    if ((B & 1) != 0) temp = (temp * A) % C;
    return (int) (temp + C) % C;
  }

}
