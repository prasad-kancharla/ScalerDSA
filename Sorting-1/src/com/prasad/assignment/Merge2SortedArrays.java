package com.prasad.assignment;

public class Merge2SortedArrays {

    public static int[] solve(final int[] A, final int[] B) {
        int n = A.length;
        int m = B.length;

        int[] mergedArray = new int[n + m];

        int i1 = 0;
        int i2 = 0;
        int k = 0;

        while (i1 < n && i2 < m) {
            if (A[i1] < B[i2]) {
                mergedArray[k++] = A[i1++];
            } else {
                mergedArray[k++] = B[i2++];
            }
        }

        while (i1 < n) {
            mergedArray[k++] = A[i1++];
        }

        while (i2 < m) {
            mergedArray[k++] = B[i2++];
        }

        return mergedArray;
    }
}
