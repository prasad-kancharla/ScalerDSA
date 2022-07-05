package com.prasad.homework;

import java.util.ArrayList;

public class DiffBitsPairWise {

    public static void main(String[] args) {
//        System.out.println(getNumberOfDiffBits(2,7));
        int[] arr = {1,3,5};
//        int[] arr = {2,3};
        System.out.println(cntBits(arr));
    }

    public static int cntBits(int[] A) {
        int length = A.length;
        int sum = 0;
        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                if (A[i] != A[j]) {
                    sum += getNumberOfDiffBits(A[i], A[j]);
                }
            }
        }
        return sum * 2;
    }

    public static int getNumberOfDiffBits(int n1, int n2) {
        int count = 0;
        while (n1 != 0 || n2 != 0) {
            if ((n1 & 1) != (n2 & 1)) {
                count++;
            }
            n1 = n1 >> 1;
            n2 = n2 >> 1;
        }
        return count;
    }

}
