package com.prasad.homework;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class SerializeBinaryTree {

  public ArrayList<Integer> solve(TreeNode A) {

    ArrayList<Integer> serializeList = new ArrayList<>();
    Queue<TreeNode> queue = new LinkedList<>();
    queue.offer(A);
    while (!queue.isEmpty()) {
      TreeNode temp = queue.poll();
      int value = temp == null ? -1 : temp.val;
      serializeList.add(value);
      if (temp != null) queue.offer(temp.left);
      if (temp != null) queue.offer(temp.right);
    }
    return serializeList;
  }

}
