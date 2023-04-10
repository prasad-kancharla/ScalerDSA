package com.prasad.homework;

import java.util.LinkedList;
import java.util.Queue;

public class OddAndEvenLevels {

  public int solve(TreeNode A) {
    int sum = 0;
    Queue<TreeNode> queue = new LinkedList<>();
    queue.offer(A);
    boolean toAdd = true;

    while (!queue.isEmpty()) {
      int size = queue.size();
      for (int i = 0; i < size; i++) {
        TreeNode temp = queue.poll();
        if (toAdd) {
          sum += temp.val;
        } else {
          sum -= temp.val;
        }
        if (temp.left != null) queue.offer(temp.left);
        if (temp.right != null) queue.offer(temp.right);
      }
      toAdd = !toAdd;
    }
    return sum;
  }

}
