package com.prasad.assignment;

public class SingleNumber {

    public static void main(String[] args) {
        int[] input = {2,2,3,3,4,5,5};
        System.out.println(singleNumber(input));
    }

    public static int singleNumber(final int[] A) {
        int ans = 0;
        int length = A.length;
        for (int i = 0; i < length; i++) {
            ans = ans ^ A[i];
        }
        return ans;
    }
}
