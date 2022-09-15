package com.prasad.homework;

import java.util.ArrayList;

public class PostOrderTraversal {

  public ArrayList<Integer> postorderTraversal(TreeNode A) {
    if (A == null) return null;

    ArrayList<Integer> list = new ArrayList<>();
    ArrayList<Integer> leftList = postorderTraversal(A.left);
    ArrayList<Integer> rightList = postorderTraversal(A.right);
    if (leftList != null) list.addAll(leftList);
    if (rightList != null) list.addAll(rightList);
    list.add(A.val);

    return list;
  }

}
