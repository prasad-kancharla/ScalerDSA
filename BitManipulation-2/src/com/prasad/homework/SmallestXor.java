package com.prasad.homework;

public class SmallestXor {
    public static void main(String[] args) {
//        System.out.println(checkBit(15,3));
        System.out.println(solve(9,3));
    }

    public static int solveOld(int A, int B) {
        int num = A;
       int count = 0;
       while (num > 0) {
           if ((num & 1) == 1) {
               count++;
           }
           num = num >> 1;
       }

       int out = 0;
        if (B == count) {
            return A;
        } else if (B < count) {
           for (int i = 30; i >= 0 ; i--) {
               if(checkBit(A,i)) {
                   out += 1<<i;
                   B--;
               }
               if (B <= 0) break;
           }
       } else if (B > count) {
            for (int i = 30; i >= 0 ; i--) {
                if(checkBit(A,i)) {
                    out += 1<<i;
                    B--;
                }
                if (B <= 0) break;
            }

            for (int i = 0; i <= 30 ; i++) {
                if (B <= 0) break;
                if (!checkBit(A,i)) {
                    out += 1 << i;
                    B--;
                }
            }
       }
       return out;
    }

    public static int solve(int A, int B) {
        int num = A;
        int count = 0;
        while (num > 0) {
            if ((num & 1) == 1) {
                count++;
            }
            num = num >> 1;
        }

        int out = 0;
        if (B == count) {
            return A;
        } else {
            for (int i = 30; i >= 0 ; i--) {
                if(checkBit(A,i)) {
                    out += 1<<i;
                    B--;
                }
                if (B <= 0) break;
            }
        }

        if (B > 0) {
            for (int i = 0; i <= 30 ; i++) {
                if (B <= 0) break;
                if (!checkBit(A,i)) {
                    out += 1 << i;
                    B--;
                }
            }
        }
        return out;
    }

    public static boolean checkBit(int n, int i) {
        if (((n >> i) & 1) == 1) {
            return true;
        }
        return false;
    }
}
