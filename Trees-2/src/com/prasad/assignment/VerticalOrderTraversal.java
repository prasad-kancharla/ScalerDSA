package com.prasad.assignment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class VerticalOrderTraversal {

  public ArrayList<ArrayList<Integer>> verticalOrderTraversal(TreeNode A) {
    ArrayList<ArrayList<Integer>> verticalOrderList = new ArrayList<>();
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
      verticalOrderList.add(list);
    }
    return verticalOrderList;
  }

}
