package com.prasad.homework;

public class DivideIntegers {

    public static void main(String[] args) {
        // 3/2 2/3 0/3 3/0 0/0

        System.out.println(divide(-1,6));
    }

    public static int divide(int A, int B) {
        int ans = 0;
        while (A >= B && A > 0 && B != 0) {
            A = A - B;
            ans++;
        }
        return ans;
    }
}
