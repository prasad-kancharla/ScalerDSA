package com.prasad.assignment;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class LevelOrder {

  public ArrayList<ArrayList<Integer>> levelOrder(TreeNode A) {

    ArrayList<ArrayList<Integer>> outputList = new ArrayList<>();
    Queue<TreeNode> queue = new LinkedList<>();
    queue.add(A);
    while (!queue.isEmpty()) {
      int size = queue.size();
      ArrayList<Integer> list = new ArrayList<>();
      for (int i = 0; i < size; i++) {
        TreeNode temp = queue.poll();
        list.add(temp.val);
        if(temp.left != null) queue.add(temp.left);
        if(temp.right != null) queue.add(temp.right);
      }
      outputList.add(list);
    }
    return outputList;
  }



}
