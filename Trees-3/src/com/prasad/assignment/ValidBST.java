package com.prasad.assignment;

import com.prasad.assignment.TreeNode;

public class ValidBST {
    // In question, they gave the node values lie in 0 to int max
    public int isValidBST(TreeNode A) {
        boolean check = isBST(A,0, Integer.MAX_VALUE);
        if (check) {
            return 1;
        }
        return 0;
    }

    private boolean isBST(TreeNode node, int start, int end) {
        if (node == null) {
            return true;
        }
        if (node.val >= start && node.val <= end) {
            return isBST(node.left, start, node.val-1) && isBST(node.right, node.val + 1, end);
        } else {
            return false;
        }
    }
}