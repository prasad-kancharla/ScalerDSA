package com.prasad.assignment;

public class PrimeSubSequences {

  public static void main(String[] args) {
//    int[] arr = {9, 4, 9, 1, 5};
    int[] arr = {9, 9, 3, 6, 7, 5};
    System.out.println(solve(arr));
    StringBuilder sb = new StringBuilder();
    sb.setLength(0);
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

    int noOfPrimesInInput = 0;
    for (int i = 0; i < n; i++) {
      if (primes[A[i]] == true) {
        noOfPrimesInInput++;
      }
    }

    if (noOfPrimesInInput < 2) return noOfPrimesInInput;
    int ans = getPowerOf(noOfPrimesInInput);

    // we are doing - 1, to remove the empty sub sequence
    return  ans - 1;
  }


  // if no of primes are 68, we need to do 2 power 68 which is more than the long data type range
  // so that's why we are using mod with 1000000007
  private static int getPowerOf(int n) {
    int prod = 2;
    int m = 1000000007;
    for (int i = 1; i < n ; i++) {
      prod = ((prod % m) * (2 % m)) % m;
    }
    return prod;
  }

}
