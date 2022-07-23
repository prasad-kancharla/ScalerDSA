package com.prasad.assignment;

public class KthSmallestElement {

    public int kthsmallest(final int[] A, int B) {

        int n = A.length;

        for (int i = 0; i < B; i++) {
            int smallest = A[i];
            int indexOfSmallest = i;

            for (int j = i + 1; j < n; j++) {
                if (A[j] < smallest) {
                    smallest = A[j];
                    indexOfSmallest = j;
                }
            }

            swap(A, i, indexOfSmallest);
        }

        return A[B - 1];
    }

    public static void swap(int[] A, int i, int j) {
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }
}
