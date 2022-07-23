package com.prasad.assignment;

import java.util.Arrays;

public class MaxMod {

    public int solve(int[] A) {
        int n = A.length;
        Arrays.sort(A);

        int maxMod = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            if (A[i] != 0) {
                int mod1 = A[n - 1] % A[i];
                if (mod1 > maxMod) {
                    maxMod = mod1;
                }
            }
            if (A[n - 1] != 0) {
                int mod2 = A[i] % A[n - 1];
                if (mod2 > maxMod) {
                    maxMod = mod2;
                }
            }
        }
        return maxMod;
    }
}
