package com.prasad.homework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BClosestPointsToOrigin {

  public static void main(String[] args) {
    ArrayList<ArrayList<Integer>> input = new ArrayList<>();
    int[][] arr = {{-2,2},{1,3},{0,0}};
    for (int i = 0; i < arr.length; i++) {
      ArrayList<Integer> list = new ArrayList<>();
      list.add(arr[i][0]);
      list.add(arr[i][1]);
      input.add(list);
    }
    solve(input,1);

  }

  public static ArrayList<ArrayList<Integer>> solve(ArrayList<ArrayList<Integer>> A, int B) {
    Comparator<ArrayList<Integer>> distanceComparator = (ArrayList<Integer> list1, ArrayList<Integer> list2) -> {
      int distance1 = list1.get(0) * list1.get(0) + list1.get(1)*list1.get(1);
      int distance2 = list2.get(0) * list2.get(0) + list2.get(1)*list2.get(1);

      if (distance1 <= distance2) return -1;
      return 1;
    };
    Collections.sort(A,distanceComparator);
    ArrayList<ArrayList<Integer>> out = new ArrayList<>();
    for (int i = 0; i < B; i++) {
      out.add(A.get(i));
    }
    return out;
  }

}
