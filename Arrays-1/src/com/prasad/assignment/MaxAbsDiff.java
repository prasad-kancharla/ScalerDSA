package com.prasad.assignment;

public class MaxAbsDiff {
    public static void main(String[] args) {
        int[] arr = {1,3,-1};
//        System.out.println(maxArrBF(arr));
        System.out.println(maxArr(arr));
    }

    // BruteForce
    public static int maxArrBF(int[] A) {
        int len = A.length;
        if (len <= 1) return 0;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < len - 1; i++) {
            for (int j = i+1; j < len; j++) {
                int sum = Math.abs(A[i] - A[j]) + Math.abs(i - j) ;
                if (sum > maxSum) maxSum = sum;
            }
        }
        return maxSum;
    }

    // Ref : https://www.youtube.com/watch?v=Ov4weYCIipg&ab_channel=alGOds
    // Ref : https://www.geeksforgeeks.org/maximum-absolute-difference-value-index-sums/
    public static int maxArr(int[] A) {

        int max1 = Integer.MIN_VALUE;
        int min1 = Integer.MAX_VALUE;
        int max2 = Integer.MIN_VALUE;
        int min2 = Integer.MAX_VALUE;

        int len = A.length;
        for (int i = 0; i < len; i++) {
            max1 = Math.max(max1, A[i] + i);
            min1 = Math.min(min1, A[i] + i);
            max2 = Math.max(max2, A[i] - i);
            min2 = Math.min(min2, A[i] - i);
        }

        return Math.max(max1 - min1, max2 - min2);

    }
}
