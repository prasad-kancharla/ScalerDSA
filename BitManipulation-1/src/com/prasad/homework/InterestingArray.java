package com.prasad.homework;

public class InterestingArray {

    public static void main(String[] args) {
        int[] arr = {9,17};
        System.out.println(solve(arr));
    }

    public static String solve(int[] A) {
        int length = A.length;
        int sum = 0;

        for (int i = 0; i < length; i++) {
            sum = sum ^ A[i];
        }

        if ((sum & 1) == 0) return "Yes";

        return "No";
    }
}
