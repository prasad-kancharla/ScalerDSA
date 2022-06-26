package com.prasad.homework;

import java.util.ArrayList;
import java.util.List;

public class ClosestMinMax {

    public static void main(String[] args) {
        int[] input = {3};
        System.out.println(solve(input));
    }

    public static int solve(int[] A) {
        int length = A.length;

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        List<Integer> minIndex = new ArrayList<>();
        List<Integer> maxIndex = new ArrayList<>();

        for (int i = 0; i < length; i++) {
            if (A[i] < min)  min = A[i];
            if (A[i] > max)   max = A[i];
        }

        for (int i = 0; i < length; i++) {
            if (A[i] == min) minIndex.add(i);
            if (A[i] == max) maxIndex.add(i);
        }

        int size1 = minIndex.size();
        int size2 = maxIndex.size();
        int minDiff = Integer.MAX_VALUE;
        for (int i = 0; i < size1; i++) {
            for (int j = 0; j < size2; j++) {
                int diff = Math.abs(minIndex.get(i) - maxIndex.get(j));
                if (diff < minDiff) minDiff = diff;
            }
        }
        return minDiff + 1;
    }
}
