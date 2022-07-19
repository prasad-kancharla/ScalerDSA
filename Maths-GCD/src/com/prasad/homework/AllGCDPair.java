package com.prasad.homework;

import java.util.*;

public class AllGCDPair {

    public static void main(String[] args) {
        int[] arr = {46, 1, 2, 1, 1, 1, 5, 45, 1, 1, 2, 5, 1, 40, 1, 1, 1, 1, 1, 1, 1, 1, 1, 31, 1};
        System.out.println(Arrays.toString(solve(arr)));

        int[] arr2 = {2, 2, 2, 2, 8, 2, 2, 2, 10};
        System.out.println(Arrays.toString(solveOtherSoln(arr2)));
    }

    private static int getGCD(int a, int b) {
        if (b == 0) {
            return a;
        }
        return getGCD(b, a % b);
    }

    public static void reverse(int[] input) {
        int last = input.length - 1;
        int middle = input.length / 2;
        for (int i = 0; i <= middle; i++) {
            int temp = input[i];
            input[i] = input[last - i];
            input[last - i] = temp;
        }
    }

    public static int[] solve(int[] A) {
        Arrays.sort(A);
        reverse(A);

        ArrayList<Integer> list = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : A) {
            if (map.containsKey(num) && map.get(num) > 0) {
                map.put(num, map.get(num) - 1);
            } else {
                for (int x : list) {
                    int key = getGCD(x, num);
                    if (map.containsKey(key)) {
                        map.put(key, map.get(key) + 2);
                    } else {
                        map.put(key, 2);
                    }
                }
                list.add(num);
            }
        }

        Collections.sort(list);
        int size = list.size(); // size of list will always be sqrt of A.length
        int[] out = new int[size];
        for (int i = 0; i < size; i++) {
            out[i] = list.get(i);
        }
        return out;
    }

    public static int[] solveOtherSoln(int[] A) {
        int n = A.length;
        TreeSet<Integer> set = new TreeSet<>();

        for (int i = 0; i < n; i++) {
            set.add(A[i]);
        }

        int m = set.size();
        int[] out = new int[m];
        int k = 0;
        for (Integer num : set) {
            out[k++] = num;
        }

        return out;
    }

}
