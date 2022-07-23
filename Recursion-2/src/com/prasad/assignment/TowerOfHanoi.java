package com.prasad.assignment;

import java.util.ArrayList;

public class TowerOfHanoi {

  public static void main(String[] args) {
    ArrayList<ArrayList<Integer>> out = towerOfHanoi(2);
    System.out.println(out);
  }

  public static ArrayList<ArrayList<Integer>> towerOfHanoi(int A) {
    ArrayList<ArrayList<Integer>> output = new ArrayList<>();
    mytowerOfHanoi(A,1,3,2,output);
    return output;
  }

  public static void  mytowerOfHanoi(int n, int source, int destination, int helper, ArrayList<ArrayList<Integer>> answer) {

    if (n == 1) {
      ArrayList<Integer> list = new ArrayList<>();
      list.add(1);
      list.add(source);
      list.add(destination);
      answer.add(list);
      return;
    }

    mytowerOfHanoi(n - 1, source, helper,destination, answer);
    ArrayList<Integer> list = new ArrayList<>();
    list.add(n);
    list.add(source);
    list.add(destination);
    answer.add(list);
    mytowerOfHanoi(n-1,helper,destination,source,answer);

  }

}
