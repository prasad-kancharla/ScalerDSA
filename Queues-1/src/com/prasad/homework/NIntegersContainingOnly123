package com.prasad.homework;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class NIntegersContainingOnly123 {

  public static void main(String[] args) {
    System.out.println(Arrays.toString(solve(7)));
  }

  public static int[] solveUsingString(int A) {
    int[] out = new int[A];
    Queue<String> queue = new LinkedList<>();
    queue.offer("1");
    queue.offer("2");
    queue.offer("3");
    int count = 3;
    int k = 0;

    while (count < A) {
      String s = queue.poll();
      out[k++] = Integer.valueOf(s);
      queue.offer(s + "1");
      queue.offer(s + "2");
      queue.offer(s + "3");
      count += 3;
    }

    for (int i = k ; i < A; i++) {
      out[i] = Integer.valueOf(queue.poll());
    }
    return out;
  }

  public static int[] solve(int A) {
    int[] out = new int[A];
    Queue<Integer> queue = new LinkedList<>();
    queue.offer(1);
    queue.offer(2);
    queue.offer(3);
    int count = 3;
    int k = 0;

    while (count < A) {
      int num = queue.poll();
      out[k++] = num;
      queue.offer(10 * num + 1);
      queue.offer(10 * num + 2);
      queue.offer(10 * num + 3);
      count += 3;
    }

    for (int i = k ; i < A; i++) {
      out[i] = queue.poll();
    }
    return out;
  }

}
