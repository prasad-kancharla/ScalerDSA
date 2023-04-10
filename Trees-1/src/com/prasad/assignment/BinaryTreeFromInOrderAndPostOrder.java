package com.prasad.assignment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class BinaryTreeFromInOrderAndPostOrder {

    public static void main(String[] args) {
        int[] inOrder = {4,2,5,1,6,3};
        int[] postOrder = {4,5,2,6,3,1};


        TreeNode root = new BinaryTreeFromInOrderAndPostOrder().buildTree(inOrder,postOrder);
        System.out.println(root.val);
    }

    // A - inorder
    // B - postorder
    public TreeNode buildTree(int[] A, int[] B) {
        int n = A.length;
        int m = B.length;
        if (n != m) {
            return null;
        }
        HashMap<Integer, Integer> inOrderMap = new HashMap<>();
        for (int i = 0; i < n; i++) {
            inOrderMap.put(A[i],i);
        }
        return buildTree(A,0,n-1,B,0,m-1,inOrderMap);
    }

    private TreeNode buildTree(int[] inOrder, int is, int ie, int[] postOrder, int ps, int pe, HashMap<Integer, Integer> inOrderMap) {
        if (is > ie || ps > pe) {
            return null;
        }

        TreeNode root = new TreeNode(postOrder[pe]);
        int indexOfRootInInOrder = inOrderMap.get(postOrder[pe]);
        int numCountLeft = indexOfRootInInOrder - is;
        root.left = buildTree(inOrder, is, indexOfRootInInOrder - 1, postOrder,ps, ps + numCountLeft - 1, inOrderMap);
        root.right = buildTree(inOrder, indexOfRootInInOrder + 1, ie, postOrder, ps + numCountLeft, pe - 1, inOrderMap);
        return root;
    }



}