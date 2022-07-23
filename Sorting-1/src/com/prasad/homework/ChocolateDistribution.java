package com.prasad.homework;

import java.util.Arrays;

public class ChocolateDistribution {

    public static void main(String[] args) {
        int[] arr = {3, 4, 1, 9, 56, 7, 9, 12};
        System.out.println(solve(arr, 5));
    }

    public static int solve(int[] A, int B) {
        int n = A.length;
        if (n == 0 || B == 0) return 0;

        Arrays.sort(A);
        int minDifference = A[B - 1] - A[0];

        for (int i = 1; i < n - B; i++) {
            int difference = A[B - 1 + i] - A[i];
            if (difference < minDifference) minDifference = difference;
        }
        return minDifference;
    }
}
