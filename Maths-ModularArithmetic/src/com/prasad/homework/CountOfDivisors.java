package com.prasad.homework;

import java.util.Arrays;

public class CountOfDivisors {

    public static void main(String[] args) {
        int[] arr = {8,9,10};
        System.out.println(Arrays.toString(solve(arr)));
//        System.out.println(getNoOfDivisors(4));
    }

    public static int[] solve(int[] A) {
        int n = A.length;
        int[] out = new int[n];
        for (int i = 0; i < n; i++) {
            out[i] = getNoOfDivisors(A[i]);
        }
        return out;
    }

    public static int getNoOfDivisors(int A) {
        int n = (int) Math.sqrt(A);
        int count = 0;
        for (int i = 1; i <= n ; i++) {
            if (A % i == 0 && A/i == i) {
                count++;
            } else if(A % i == 0) {
                count = count + 2;
            }
        }
        return count;
    }
}
