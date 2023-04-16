package com.prasad.assignment;

public class FindK {

    // recursive way
    // in worst case it might go to O(n)  in case of a skewed tree + stack space
    boolean findK(TreeNode root, int k ) {
        if (root == null) return false;
        if (k == root.val) {
            return true;
        } else if (k > root.val) {
            return findK(root.right, k);
        }
        return findK(root.left, k);
    }

    // O(n)
    boolean findKWithoutRecursion(TreeNode root, int k) {
        TreeNode node = root;
        while (node != null) {
            if (node.val == k) {
                return true;
            } else if (k > node.val) {
                node = node.right;
            } else {
                node = node.left;
            }
        }
        return false;
    }

}
