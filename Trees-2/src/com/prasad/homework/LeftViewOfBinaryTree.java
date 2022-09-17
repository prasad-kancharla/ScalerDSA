package com.prasad.homework;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class LeftViewOfBinaryTree {

  public ArrayList<Integer> solve(TreeNode A) {

    ArrayList<Integer> leftView = new ArrayList<>();
    Queue<TreeNode> queue = new LinkedList<>();
    queue.offer(A);

    while (!queue.isEmpty()) {
      int size = queue.size();
      for (int i = 0; i < size; i++) {
        TreeNode temp = queue.poll();
        if (i == 0) leftView.add(temp.val);
        if (temp.left != null) queue.offer(temp.left);
        if (temp.right != null) queue.offer(temp.right);
      }
    }
    return leftView;
  }

}
