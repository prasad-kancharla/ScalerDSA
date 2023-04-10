package com.prasad.assignment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class TopViewOfBinaryTree {

  // Just do vertical order traversal and add first element of each list to answer
  public ArrayList<Integer> solve(TreeNode A) {
    ArrayList<Integer> topViewList = new ArrayList<>();
    Queue<TreeNodeDistance> queue = new LinkedList<>();
    HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
    queue.offer(new TreeNodeDistance(A,0));

    int maxDistance = Integer.MIN_VALUE;
    int minDistance = Integer.MAX_VALUE;

    while (!queue.isEmpty()) {
      TreeNodeDistance nodeDistance = queue.poll();
      TreeNode node = nodeDistance.node;
      int distance = nodeDistance.distance;
      ArrayList<Integer> list = map.containsKey(distance) ? map.get(distance) : new ArrayList<>();
      list.add(node.val);
      map.put(distance,list);

      if (node.left != null) queue.offer(new TreeNodeDistance(node.left, distance - 1));
      if (node.right != null) queue.offer(new TreeNodeDistance(node.right, distance + 1));

      maxDistance = Math.max(maxDistance, distance);
      minDistance = Math.min(minDistance, distance);
    }

    for (int i = minDistance; i <= maxDistance ; i++) {
      ArrayList<Integer> list = map.get(i);
      topViewList.add(list.get(0));
    }
    return topViewList;
  }

  // very clean 
  public ArrayList<Integer> solveByRemovingFewUnnecessarySteps(TreeNode A) {
    ArrayList<Integer> topViewList = new ArrayList<>();
    Queue<TreeNodeDistance> queue = new LinkedList<>();
    HashSet<Integer> set = new HashSet<>();
    queue.offer(new TreeNodeDistance(A,0));

    while (!queue.isEmpty()) {
      TreeNodeDistance nodeDistance = queue.poll();
      TreeNode node = nodeDistance.node;
      int distance = nodeDistance.distance;
      if (!set.contains(distance)) {
        topViewList.add(node.val);
        set.add(distance);
      }
      if (node.left != null) queue.offer(new TreeNodeDistance(node.left, distance - 1));
      if (node.right != null) queue.offer(new TreeNodeDistance(node.right, distance + 1));

    }
    return topViewList;
  }

}
