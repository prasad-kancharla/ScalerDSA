package com.prasad.assignment;

public class SumOfAllSubMatrices {

  public static void main(String[] args) {

  }

  public int solve(int[][] A) {
    int n = A.length;
    int m = A[0].length;

    int sum = 0;
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        int topLeftChoices = (i + 1) * (j + 1);
        int bottomRightChoices = (n - i) * (m - j);
        int noOfSubMatrices = topLeftChoices * bottomRightChoices;
        sum = sum + (noOfSubMatrices * A[i][j]);
      }
    }

    return sum;
  }

}
