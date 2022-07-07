package com.prasad.assignment;

import java.util.HashMap;

public class PairSumDivisibleByM {

    public static void main(String[] args) {
//        int[] arr = {1,2,3,4,5};
//        System.out.println(solve(arr,2));
//        int[] arr = {4,7,6,5,5,3};
//        System.out.println(solve(arr,3));
        int[] arr = {5,17,100,11};
        System.out.println(solve(arr,28));
    }

    public static int solve(int[] A, int B) {
        int n = A.length;
        int noOfPairs = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            A[i] %= B;
            if (map.containsKey(A[i])) {
                int count = map.get(A[i]) + 1;
                map.put(A[i],count);
            }else{
                map.put(A[i],1);
            }
        }

        // Nc2 = n!/(n-2)! * 2! = n*(n - 1)/2
        if(map.containsKey(0)) {
            int noOfZeroes = map.get(0);
            noOfPairs += noOfZeroes * (noOfZeroes - 1)/2;
        }
        int i = 1;
        int j = B - 1;

        while (i < j) {
            if(map.containsKey(i) && map.containsKey(B - i)) noOfPairs += map.get(i) * map.get(B - i);
            i++;
            j--;
        }

        if ((B & 1) == 0 && map.keySet().contains(B/2)) {
            int bCount = map.get(B/2);
            noOfPairs += bCount * (bCount - 1)/2;
        }

        return noOfPairs;
    }
}
