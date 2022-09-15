package com.prasad.assignment;

import java.util.ArrayList;

public class InorderTraversal {

  public ArrayList<Integer> inorderTraversal(TreeNode A) {
    ArrayList<Integer> list = new ArrayList<>();
    inOrderTraversalWithList(A,list);
    return list;
  }

  void inOrderTraversalWithList(TreeNode A, ArrayList<Integer> list) {
    if (A == null) return;
    inOrderTraversalWithList(A.left,list);
    list.add(A.val);
    inOrderTraversalWithList(A.right,list);
  }

}
