package com.prasad.homework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class UniqueElements {

  public static void main(String[] args) {
    int[] arr = {12,2,2,4,2,3,9,9};
    ArrayList<Integer> input = new ArrayList<>();
    for (int i = 0; i < arr.length; i++) {
      input.add(arr[i]);
    }
    System.out.println(solve(input));
  }

  public static int solveOld(ArrayList<Integer> A) {
    HashSet<Integer> uniqueElements = new HashSet<>();
    List<Integer> nonUniqueElements = new ArrayList<>();
    for (Integer i : A) {
      if (uniqueElements.contains(i)) {
        nonUniqueElements.add(i);
      } else {
        uniqueElements.add(i);
      }
    }

    int sum = 0;
    for (Integer i : nonUniqueElements) {
      int num = i + 1;
      while (true) {
        if (!uniqueElements.contains(num)) {
          sum += (num - i);
          uniqueElements.add(num);
          break;
        }
        num++;
      }
    }

    return sum;
  }

  public static int solve(ArrayList<Integer> A) {
    Collections.sort(A);
    int ans = 0;
    int current_max = 0;
    int n = A.size();
    for (int i = 0; i < n; i++) {
      if (A.get(i) > current_max) {
        current_max = A.get(i);
      } else {
        int x = current_max + 1 - A.get(i);
        ans += x;
        A.set(i,current_max + 1);
        current_max = A.get(i);
      }
    }
    return ans;
  }
}
