package com.prasad.assignment;

import java.util.LinkedList;
import java.util.Queue;

public class PerfectNumbers {

  public static void main(String[] args) {
    System.out.println(solve(4));
  }

  public static String solve(int A) {
    Queue<String> queue = new LinkedList<>();

    queue.offer("1");
    queue.offer("2");

    int count = 2;
    int noOfElementsRemoved = 0;

    while (count < A) {
      String s = queue.poll();
      queue.offer(s + "1");
      queue.offer(s + "2");
      noOfElementsRemoved++;
      count += 2;
    }

    while (noOfElementsRemoved < A - 1) {
      queue.poll();
      noOfElementsRemoved++;
    }
    StringBuilder sb = new StringBuilder(queue.peek());

    return queue.peek() + sb.reverse().toString();
  }

}
