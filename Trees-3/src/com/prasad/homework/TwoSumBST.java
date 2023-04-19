package com.prasad.homework;

import com.prasad.assignment.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class TwoSumBST {
//    public int t2Sum(TreeNode A, int B) {
//        boolean check = isThereAPair(A,B);
//        if (check) {
//            return 1;
//        }
//        return 0;
//    }
//
//    private boolean isThereAPair(TreeNode root, int B) {
//        if (root == null) return false;
//        int searchValue = B - root.val;
//        boolean isPresentInTree = searchValue <= root.val ? doesItExist(root.left,searchValue) : doesItExist(root.right, searchValue);
//        if (isPresentInTree) {
//            return true;
//        }
//        return isThereAPair(root.left, B) || isThereAPair(root.right,B);
//    }
//    private boolean doesItExist(TreeNode node, int value) {
//        if (node == null) return false;
//
//        if (node.val == value) {
//            return true;
//        }
//        if (value > node.val) {
//            return doesItExist(node.right,value);
//        }
//
//        return doesItExist(node.left,value);
//    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);

        System.out.println(new TwoSumBST().t2Sum(root,40));
    }
    public int t2Sum(TreeNode A, int B) {
        List<Integer> list = new ArrayList<>();
        getInOrderTraversal(A, list);
        int n = list.size();
        for (int i = 0; i < n; i++) {
            int target = B - list.get(i);
            if (list.contains(target) && list.lastIndexOf(target) != i) {
                return 1;
            }
        }
        return 0;
    }

    private void getInOrderTraversal(TreeNode root, List<Integer> list) {
        if (root == null) {
            return;
        }
        getInOrderTraversal(root.left,list);
        list.add(root.val);
        getInOrderTraversal(root.right, list);
    }
}