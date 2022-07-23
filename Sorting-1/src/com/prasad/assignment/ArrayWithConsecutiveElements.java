package com.prasad.assignment;

import java.util.Arrays;

public class ArrayWithConsecutiveElements {
    public int solve(int[] A) {
        int n = A.length;
        Arrays.sort(A);
        int diff = A[0];

        for (int i = 1; i<n; i++) {
            if(A[i] != i + diff) {
                return 0;
            }
        }
        return 1;
    }
}
