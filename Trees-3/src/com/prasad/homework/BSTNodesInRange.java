package com.prasad.homework;

import com.prasad.assignment.TreeNode;

public class BSTNodesInRange {
    public int solve(TreeNode A, int B, int C) {
        if (A == null) {
            return 0;
        }
        int x = 0;
        if (A.val >= B && A.val<= C) {
            x = 1;
        }
        return x + solve(A.left, B, C) + solve(A.right, B, C);
    }

}