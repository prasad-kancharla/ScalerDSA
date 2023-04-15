package com.prasad.assignment;

import java.util.LinkedList;
import java.util.Queue;

public class DeserializeBinaryTree {

    public static void main(String[] args) {
        int[] input = {1, 2, 3, 4, 5, -1, 6, -1, -1, -1, -1, -1, -1};
        TreeNode node = new DeserializeBinaryTree().solve(input);
        System.out.println(node.val);
    }
    public TreeNode solve(int[] A) {
        if (A ==  null || A.length == 0) return null;

        TreeNode root = new TreeNode(A[0]);
        int n = A.length;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int i = 0;

        while (!queue.isEmpty() && i < n) {
            TreeNode node = queue.poll();
             if (A[++i] != -1 && (i < n)) {
                 node.left = new TreeNode(A[i]);
                 queue.offer(node.left);
            }
             if (A[++i] != -1 && i < n) {
                 node.right = new TreeNode(A[i]);
                 queue.offer(node.right);
             }
        }
        return root;
    }
}