package com.prasad.assignment;

import java.util.Arrays;

public class BeggarsAtTemple {

  public static void main(String[] args) {

    int[][] input = {{1, 2, 10}, {2, 3, 20}, {2, 5, 25}};
    System.out.println(Arrays.toString(solve(5,input)) );

  }

  public static int[] solve(int A, int[][] B) {
    int length = B.length;
    int[] out = new int[A];
    for (int i = 0; i < length; i++) {
      for (int j = B[i][0] - 1; j <= B[i][1] - 1; j++) {
        out[j] = out[j] + B[i][2];
      }
    }
    return out;
  }

}
