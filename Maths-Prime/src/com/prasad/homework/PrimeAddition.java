package com.prasad.homework;

public class PrimeAddition {

  public static void main(String[] args) {
    System.out.println(solve(234));
  }
  
  // Given, A is even number
  // Goldbach's conjecture states: ”Every even integer greater than 2 can be expressed as the sum of two primes
  public static int solve(int A) {
    if (A == 2) {
      return 1;
    }
    return 2;
  }

}
