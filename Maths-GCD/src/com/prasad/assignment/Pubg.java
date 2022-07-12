package com.prasad.assignment;

public class Pubg {

    public static void main(String[] args) {

    }


    public static int solve(int[] A) {
        int n = A.length;
        int ans = 0;
        for (int i = 0; i < n; i++) {
            ans = getGCD(A[i], ans);
        }
        return ans;
    }

    public static int getGCD(int a, int b) {
        if (b == 0) {
            return a;
        }
        return getGCD(b, a % b);
    }
}
