package com.prasad.assignment;

import java.util.Arrays;

public class SingleNumber3 {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 1, 2, 4};
        System.out.println(Arrays.toString(solve(arr)));

    }

    public static int[] solve(int[] A) {
        int n = A.length;
        if (n == 2) return A;

        int xorOfElements = 0;
        // find xor of all elements
        for (int i = 0; i < n; i++) {
            xorOfElements ^= A[i];
        }

        // find a set bit index
        int setBitIndex = -1;
        for (int i = 0; i <= 30; i++) {
            if (checkBit(xorOfElements, i)) {
                setBitIndex = i;
                break;
            }
        }

        int xor0 = 0;
        int xor1 = 0;
        // using that index position calculate 2 xor  and return them
        for (int i = 0; i < n; i++) {

            if (checkBit(A[i],setBitIndex)) {
                xor1 ^= A[i];
            } else {
                xor0 ^= A[i];
            }
        }
        int[] out = new int[] {xor0,xor1};
        Arrays.sort(out);
        return out;

    }

    public static boolean checkBit(int n, int i) {
        // n is number i is index of the bit

        if (((n >> i) & 1) == 1) {
            return true;
        }
        return false;
    }
}
