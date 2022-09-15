package com.prasad.homework;

import java.util.ArrayList;

public class PreOrderTraversal {

  public ArrayList<Integer> preorderTraversal(TreeNode A) {
    if (A == null) {
      return null;
    }
    ArrayList<Integer> list = new ArrayList<>();
    list.add(A.val);
    ArrayList<Integer> leftList = preorderTraversal(A.left);
    ArrayList<Integer> rightList = preorderTraversal(A.right);
    if (leftList != null) list.addAll(leftList);
    if (rightList != null) list.addAll(rightList);
    return list;
  }

}
