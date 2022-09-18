package com.prasad.homework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class ZigZagLevelOrderTraversal {

  public static void main(String[] args) {
    Queue<Integer> q = new LinkedList<>();
    System.out.println(q.getClass());
  }

  public ArrayList<ArrayList<Integer>> zigzagLevelOrder(TreeNode A) {
    ArrayList<ArrayList<Integer>> zigZagList = new ArrayList<>();
    Queue<TreeNode> queue = new LinkedList<>();
    queue.offer(A);
    boolean zigZag = false;

    while (!queue.isEmpty()) {
      int size = queue.size();
      ArrayList<Integer> list = new ArrayList<>();
      for (int i = 0; i < size; i++) {
        TreeNode temp = queue.poll();
        list.add(temp.val);
        if (temp.left != null) queue.offer(temp.left);
        if (temp.right != null) queue.offer(temp.right);
      }
      if (zigZag) Collections.reverse(list);
      zigZagList.add(list);
      zigZag = !zigZag;
    }
    return zigZagList;
  }

}
