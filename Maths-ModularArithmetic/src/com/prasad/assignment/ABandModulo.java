package com.prasad.assignment;

public class ABandModulo {

    public static void main(String[] args) {

    }

    // use formula of (a - b) % m  = (a%m - b%m + m) % m
    public static int solve(int A, int B) {
        return Math.abs(A - B);
    }
}
