package com.prasad.assignment;

public class LargestBSTSubTree {
    public int solve(TreeNode A) {
        if (A == null) return 0;
        if (isBST(A, Integer.MIN_VALUE,Integer.MAX_VALUE)) {
            return getSize(A);
        }
        return Math.max(solve(A.left), solve(A.right));
    }

    private int getSize(TreeNode node) {
        if (node == null) {
            return 0;
        }
        return getSize(node.left) + getSize(node.right) + 1;
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