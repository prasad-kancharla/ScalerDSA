package com.prasad.homework;

public class NumberOfOpenDoors {

    public static void main(String[] args) {
        System.out.println(solve(6));
    }

    public static int solveBruteForce(int A) {

        boolean[] doors = new boolean[A + 1];

        for (int i = 1; i <= A; i++) {
            for (int j = i ; j <= A ; j += i) {
                doors[j] = ! doors[j];
            }
        }

        int count = 0;
        for (int i = 1; i < A + 1; i++) {
            if(doors[i]) {
                count++;
            }
        }

        return count;
    }

    public static int solve(int A) {
        boolean[] doors = new boolean[A];

    }
}
