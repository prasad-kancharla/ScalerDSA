package com.prasad.homework;

import java.util.Arrays;

public class Add1ToNumber {

    public static void main(String[] args) {
//        int[] input = {9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9  };
//        int[] input = {0,0,1,0,2,0, 9, 5, 9, 9 };
        int[] input = {0, 0 };
        System.out.println(Arrays.toString(plusOne(input)));
    }

    public static int[] plusOne(int[] A) {
        A = removeStartingZeroes(A);
        int length = A.length;
        if (A[length - 1] < 9) {
            A[length- 1] += 1;
            return A;
        } else {
            int zeroesStartIndex = -1;
            for (int i = length - 1; i >= 0  ; i--) {
                if (A[i] < 9) {
                    zeroesStartIndex = i + 1;
                    A[i] += 1;
                    break;
                }
            }
            if (zeroesStartIndex == -1) {
                zeroesStartIndex = 1;
                int[] out = new int[length + 1];
                out[0] = 1;
                for (int i = 1; i < length + 1; i++) {
                    out[i] = 0;
                }
                return out;
            }
            for (int i = zeroesStartIndex; i < length ; i++) {
                A[i] = 0;
            }
            return A;
        }
    }

    public static int[] removeStartingZeroes(int[] arr) {
        int start = -1;
        int length = arr.length;
        for (int i = 0; i < length; i++) {
            if (arr[i] != 0) {
                start = i;
                break;
            }
        }
        if (start == 0) {
            return arr;
        }
        int[] out = new int[length - start];
        int k = 0;
        if (start != -1) {
            for (int i = start; i < length; i++) {
                out[k++] = arr[i];
            }
            return out;
        }
        return new int[] {0};
    }
}

