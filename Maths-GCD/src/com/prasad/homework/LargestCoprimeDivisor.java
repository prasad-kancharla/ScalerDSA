package com.prasad.homework;

public class LargestCoprimeDivisor {
    public static void main(String[] args) {
        System.out.println(cpFact(30,12));
    }

    public static int cpFact(int A, int B) {
        int n = (int) Math.sqrt(A);
        int ans = Integer.MIN_VALUE;
        for (int i = 1; i <= n; i++) {
            if (A % i == 0) {
                if(areCoPrimes(i,B)) ans = Math.max(ans,i);
                if(areCoPrimes(A/i,B)) ans = Math.max(ans,A/i);
            }
        }
        return ans;
    }

    public static boolean areCoPrimes(int a, int b) {
        if (getGCD(a,b) == 1) {
            return true;
        }
        return false;
    }

    private static int getGCD(int a, int b) {
        if (b == 0) return a;
        return getGCD(b, a % b);
    }
}
