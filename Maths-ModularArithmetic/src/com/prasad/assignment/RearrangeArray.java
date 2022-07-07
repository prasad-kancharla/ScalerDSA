package com.prasad.assignment;

import java.util.ArrayList;

public class RearrangeArray {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(2);
        list.add(4);
        list.add(1);
        list.add(0);
        System.out.println("Before: " + list);
        arrange(list);
        System.out.println("After: " + list);
    }

    public static void arrange(ArrayList<Integer> A) {
        int n = A.size();
        for (int i = 0; i < n; i++) {
            A.set(i, A.get(i) * n);
        }

        for (int i = 0; i < n; i++) {
            int index = A.get(i)/n;
            int element = A.get(index)/n;
            A.set(i,A.get(i) + element);
        }

        for (int i = 0; i < n; i++) {
            A.set(i, A.get(i) % n);
        }
    }
}
