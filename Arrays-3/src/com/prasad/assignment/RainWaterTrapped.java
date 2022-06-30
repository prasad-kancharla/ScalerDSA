package com.prasad.assignment;

public class RainWaterTrapped {

    public static void main(String[] args) {

    }
    
    public int trap(final int[] A) {
        int length = A.length;
        int[] leftMaxArr = new int[length];
        int[] rightMaxArr = new int[length];

        int leftMax = Integer.MIN_VALUE;
        int rightMax = Integer.MIN_VALUE;

        int waterTrapped = 0;

        for (int i = 0; i < length; i++) {
            leftMax = Math.max(leftMax, A[i]);
            leftMaxArr[i] = leftMax;
        }

        for (int i = length - 1; i >= 0 ; i--) {
            rightMax = Math.max(rightMax,A[i]);
            rightMaxArr[i] = rightMax;
        }

        for (int i = 1; i < length - 1; i++) {
            int water = Math.min(leftMaxArr[i],rightMaxArr[i]) - A[i];
            waterTrapped += water;
        }

        return waterTrapped;
    }

}
