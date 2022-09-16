package com.prasad.assignment;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class RightViewOfBinaryTree {

  public ArrayList<Integer> solve(TreeNode A) {
    ArrayList<Integer> rightView = new ArrayList<>();
    Queue<TreeNode> queue = new LinkedList<>();
    queue.offer(A);

    while (!queue.isEmpty()) {
      int size = queue.size();
      for (int i = 0; i < size; i++) {
        TreeNode node = queue.poll();
        if (i == size - 1) rightView.add(node.val);
        if (node.left != null) queue.offer(node.left);
        if (node.right != null) queue.offer(node.right);
      }
    }
    return rightView;
  }

}
