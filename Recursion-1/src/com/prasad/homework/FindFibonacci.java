package com.prasad.homework;

// 0 1 1 2 3 5 8 13 21 34...
public class FindFibonacci {

  public static void main(String[] args) {
    System.out.println(findAthFibonacci(5));
  }

  public static int findAthFibonacci(int A) {
    if (A == 0) return 0;
    if (A == 1) return 1;

    return findAthFibonacci(A - 1) + findAthFibonacci(A - 2);
  }

}
