package com.prasad.homework;

import java.util.Arrays;
import java.util.Stack;
import java.util.TreeSet;

public class AllGCDPair {
    public static void main(String[] args) {
        int[] arr = {2, 2, 2, 2, 8, 2, 2, 2, 10};
        System.out.println(Arrays.toString(solve(arr)));
    }

    public static int[] solve(int[] A) {
        int n = A.length;
        TreeSet<Integer> set = new TreeSet<>();

        for (int i = 0; i < n ; i++) {
            set.add(A[i]);
        }

        int m = set.size();
        int[] out = new int[m];
        int k = 0;
        for (Integer num : set) {
            out[k++] = num;
        }

        return out;
    }
}
