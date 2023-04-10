package com.prasad.assignment;

import java.util.Scanner;

public class FibonacciNumber {

  public static void main(String[] args) {
    // YOUR CODE GOES HERE
    // Please take input and print output to standard input/output (stdin/stdout)
    // DO NOT USE ARGUMENTS FOR INPUTS
    // E.g. 'Scanner' for input & 'System.out' for output
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int[] fibonacciArray = new int[n + 1];
    for (int i = 0; i < n + 1; i++) {
      fibonacciArray[i] = -1;
    }
    fibonacciArray[0] = 0;
    fibonacciArray[1] = 1;
    System.out.println(getFibonacci(n, fibonacciArray));

  }

  static int getFibonacci(int n, int[] fibonacciArray) {
    if (fibonacciArray[n] != -1) {
      return fibonacciArray[n];
    }
    if (fibonacciArray[n - 1] == -1) {
      fibonacciArray[n - 1] = getFibonacci(n - 1, fibonacciArray);
    }
    if (fibonacciArray[n - 2] == -1) {
      fibonacciArray[n - 2] = getFibonacci(n - 2, fibonacciArray);
    }
    fibonacciArray[n] = fibonacciArray[n - 1] + fibonacciArray[n - 2];
    return fibonacciArray[n];
  }

}
