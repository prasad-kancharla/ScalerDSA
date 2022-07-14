package com.prasad.homework;

public class NumberOfOpenDoors {

    public static void main(String[] args) {
        System.out.println(solve(10));
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

    public static int solveSomeWhatGood(int A) {
        int count = 0;
        for (int i = 1; i < A + 1; i++) {
            if((getNoOfDivisors(i) & 1) != 0) {
                count++;
            }
        }
        return count;
    }

    // assuming n is > 0
    // TC is O(sqrt(n))
    public static int getNoOfDivisors(int n) {
        int range = (int) Math.sqrt(n);
        int count = 0;
        for (int i = 1; i <= range ; i++) {
            if (n % i == 0) {
                if (i != n/i) {
                    count += 2;
                } else {
                    count++;
                }
            }
        }
        return count;
    }

    public static int solveBetter(int A) {
        int n = A + 1;
        int[] spf = new int[n];
        for (int i = 1; i < n; i++) {
            spf[i] = i;
        }

        int range = (int) Math.sqrt(A);
        for (int i = 2; i <= range; i++) {
            for (int j = i * i; j <= A ; j += i) {
                if (spf[j] == j) {
                    spf[j] = i;
                }
            }
        }

        int[] out = new int[n];

        for (int i = 1; i < n; i++) {
            int num = i;
            int divisorsCount = 1;
            while (num > 1) {
                int  p = spf[num];
                int count = 0;
                while (num % p == 0) {
                    count++;
                    num = num/p;
                }
                divisorsCount = divisorsCount * (count + 1);
            }
            out[i] = divisorsCount;
        }

        int count = 0;

        for (int i = 1; i < A + 1 ; i++) {
            if((out[i] & 1) != 0) {
                count++;
            }
        }
        return count;
    }

    // for all the three above approaches, we are finding divisors of each no
    // if no of divisors for a number is odd, the door will be open at end (false -> true)


    // Only perfect squares will have odd number of divisors
    // The Easiest solution
    // Find no of perfect squares <= A
    public static int solve(int A) {
        return (int) Math.sqrt(A);
    }


}
