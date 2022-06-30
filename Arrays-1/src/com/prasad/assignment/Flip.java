package com.prasad.assignment;

import java.util.Arrays;

public class Flip {

  public static void main(String[] args) {
//    String input = "11001001";
//    String input = "010";
//    String input = "111";
    String input = "011";
    System.out.println(Arrays.toString(flip(input)));
  }

  public static int[] flip(String A) {
    int length = A.length();
    int carryForward = 0;
    int maxSum = Integer.MIN_VALUE;
    int start = 0;
    int end = length - 1;
    int currStart = 0;
    int currEnd = 0;

    for (int i = 0; i < length; i++) {
      int value = (A.charAt(i) == '0') ? 1 : -1;
      int sum = carryForward + value;

      if (sum < 0) {
        carryForward = 0;
        currStart = i + 1;
      } else {
        carryForward = sum;
        currEnd = i;
      }
      if (sum > maxSum) {
        maxSum = sum;
        start = currStart;
        end = currEnd;
      }
    }
    return new int[] {start + 1, end + 1};
  }

}
