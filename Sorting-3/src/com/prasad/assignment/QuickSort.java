package com.prasad.assignment;

import java.util.Arrays;

public class QuickSort {

  public static void main(String[] args) {
    int[] arr = {1, 4, 10, 2, 1, 5};
    solve(arr);
    System.out.println(Arrays.toString(arr));
  }

  public static int[] solve(int[] A) {
    quickSort(A, 0 , A.length - 1);
    return A;
  }

  public static void quickSort(int[] A, int start, int end) {
    if (start >= end) {
      return;
    }

    int index = setArray(A, start, end);
    quickSort(A, start, index - 1);
    quickSort(A, index + 1, end);
  }

  public static int setArray(int[] A, int start, int end) {
    int firstElement = A[start];
    int l = start + 1;
    int r = end;

    while (l <= r) {
      if (A[l] <= firstElement) {
        l++;
      } else if (A[r] > firstElement) {
        r--;
      } else {
        swap(A, l, r);
        l++; r--;
      }
    }

    swap(A, start, l - 1);
    return l-1;
  }

  private static void swap(int[] A, int l, int r) {
    int temp = A[l];
    A[l] = A[r];
    A[r] = temp;
  }

}
