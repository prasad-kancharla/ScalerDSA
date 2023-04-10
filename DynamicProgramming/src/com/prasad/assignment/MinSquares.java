package com.prasad.assignment;

public class MinSquares {

  public static void main(String[] args) {
    System.out.println(countMinSquares(13));
  }

  public static int countMinSquares(int A) {
    int[] minSquaresArray = new int[A + 1];
    for (int i = 0; i < A + 1; i++) {
      minSquaresArray[i] = -1;
    }
    minSquaresArray[0] = 0;
    minSquaresArray[1] = 1;
    if (A > 1) {
      minSquaresArray[2] = 2;
    }
    if (A > 2) {
      minSquaresArray[3] = 3;
    }
    return countMinSquares(A, minSquaresArray);
  }

  private static int countMinSquares(int A, int[] minSquaresArray) {
    if (minSquaresArray[A] != -1) {
      return minSquaresArray[A];
    }
    int ans = Integer.MAX_VALUE;
    for (int i = 1; i * i <= A; i++) {
      int index = A - (i * i);
      if (minSquaresArray[index] == -1) {
        minSquaresArray[index] = countMinSquares(index, minSquaresArray);
      }
      ans = Math.min(ans, minSquaresArray[index]);
    }
    minSquaresArray[A] = ans + 1;
    return minSquaresArray[A];
  }
}
