package com.prasad.assignment;

import java.util.Arrays;

public class RotateMatrix {

  public static void main(String[] args) {

    int[][] input = {{1,2,3},{4,5,6}, {7,8,9}};
//    int[][] input = {{1,2},{3,4}};
//    int[][] input = {{1}};
    for (int i = 0; i < input.length; i++) {
      System.out.println(Arrays.toString(input[i]));
    }
    solve(input);
    for (int i = 0; i < input.length; i++) {
      System.out.println(Arrays.toString(input[i]));
    }

  }

  public static void solve(int[][] A) {
    int length = A.length;
    for (int i = 0; i < length; i++) {
      for (int j = i + 1; j < length; j++) {
          int temp = A[i][j];
          A[i][j] = A[j][i];
          A[j][i] = temp;
      }
    }

    for (int i = 0; i < length; i++) {
      for (int j = 0; j < (length + 1)/2; j++) {
        int temp = A[i][j];
        A[i][j] = A[i][length - 1 - j];
        A[i][length - 1 - j] = temp;
      }
    }

  }

}
