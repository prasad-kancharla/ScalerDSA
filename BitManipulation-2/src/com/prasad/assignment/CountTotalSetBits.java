package com.prasad.assignment;

public class CountTotalSetBits {
    public static void main(String[] args) {
        System.out.println(solve(3));
    }

    public static int solve(int A) {
        int count = 0;
        for (int i = 0; i <= 30 ; i++) {
            for (int j = 1; j <= A; j++) {
                if (checkBit(j,i)) {
                    count = ((count) % (1000000007)) + (1 % (1000000007));
                }
            }
        }
        return count;
    }

    public static boolean checkBit(int n, int i) {
        // n is number i is index of the bit

        if (((n >> i) & 1) == 1) {
            return true;
        }
        return false;
    }
}
