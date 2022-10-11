package com.prasad.assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class FindMaximumJobs {

  public static void main(String[] args) {
    int[] A = {3, 13, 7, 7, 10, 3};
    int[] B = {6, 15, 9, 8, 16, 11};
    System.out.println(solve(A, B));

  }

  public static int solve(int[] A, int[] B) {
    int n = A.length;
    ArrayList<Pair> pairs = new ArrayList<>();
    for (int i = 0; i < n; i++) {
      pairs.add(new Pair(A[i], B[i]));
    }

    Comparator<Pair> pairComparator = (p1, p2) -> (p1.end > p2.end) ? 1 : (p1.end < p2.end) ? -1 : 0;
    Collections.sort(pairs, pairComparator);
    int count = 1;
    int previousEnd = pairs.get(0).end;
    for (int i = 1; i < n; i++) {
      if (pairs.get(i).start >= previousEnd) {
        count++;
        previousEnd = pairs.get(i).end;
      }
    }
    return count;
  }
}
