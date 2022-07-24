package com.prasad.homework;

import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args) {
        int[] arr = {5,3,-1,0,0,-8,26,322,57};
        mergeSort(arr,0,arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    public static void mergeSort(int[] A, int start, int end) {
        if (start == end) {
            return;
        }
        int mid = start + (end - start)/2;
        mergeSort(A,start,mid);
        mergeSort(A,mid + 1, end);
        merge(A, start, mid, end);
    }

    public static void merge(int[] A, int start, int mid, int end) {
        int[] subArray = new int[end - start + 1];
        int i1 = start;
        int i2 = mid + 1;
        int k = 0;

        while (i1 <= mid && i2 <= end) {
            if(A[i1] <= A[i2]) {
                subArray[k++] = A[i1++];
            } else {
                subArray[k++] = A[i2++];
            }
        }

        while (i1 <= mid) {
            subArray[k++] = A[i1++];
        }

        while (i2 <= end) {
            subArray[k++] = A[i2++];
        }
        for (int i = start; i <= end ; i++) {
            A[i] = subArray[i - start];
        }
    }
}
