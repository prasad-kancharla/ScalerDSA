package com.prasad.assignment;

public class SubMatrixSumQueries {

  public static void main(String[] args) {

  }

  public int[] solve(int[][] A, int[] B, int[] C, int[] D, int[] E) {
    int[][] prefixSum = getPrefixSumArray(A);
    int length = B.length;
    int[] output = new int[length];

    for (int i = 0; i < length; i++) {
      int a1 = B[i] - 1;
      int b1 = C[i] - 1;
      int a2 = D[i] - 1;
      int b2 = E[i] - 1;
      int s1 = prefixSum[a2][b2];
      int s2 = (a1 != 0) ? prefixSum[a1 - 1][b2] : 0;
      int s3 = (b1 != 0) ? prefixSum[a2][b1 - 1] : 0;
      int s4 = (a1 != 0 && b1 != 0) ? prefixSum[a1 - 1][b1 - 1] : 0;

      int c = 1000000007;
      int sum = ((s1 % c) - (s2 % c) - (s3 % c) + (s4 % c)) % c;
      if (sum < 0) sum += 1000000007;
      output[i] = sum;
    }
    return output;
  }

  public static int[][] getPrefixSumArray(int[][] A)  {

    int n = A.length;
    int m = A[0].length;

    int[][] prefixSum = new int[n][m];
    int c = 1000000007;

    for (int i = 0; i < n; i++) {
      int sum = 0;
      for (int j = 0; j < m; j++) {
        prefixSum[i][j] = ((A[i][j]) % c + (sum % c)) % c;
        sum = prefixSum[i][j];
      }
    }

    for (int i = 0; i < m; i++) {
      int sum = 0;
      for (int j = 0; j < n; j++) {
        prefixSum[j][i] = ((prefixSum[j][i] % c) + (sum % c)) % c;
        sum = prefixSum[j][i];
      }
    }

    return prefixSum;
  }

}
