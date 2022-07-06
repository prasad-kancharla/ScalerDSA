package com.prasad.homework;

public class DivideIntegers {

    public static void main(String[] args) {
        // 3/2 2/3 0/3 3/0 0/0

        System.out.println(divide(-1,6));
    }

    public static int divide(int A, int B) {
        boolean negative = (A > 0 && B < 0) || (A < 0 && B > 0) ? true : false;

    // I am casting A to long before doing abs because if value of A is Integer.MIN_VALUE which is -2 power 31
    // the abs value will be 2 power 31 but max limit of int is 2 power 31 - 1
    // So in this scenario, the abs function will return the same Integer.MIN_VALUE
    long dividend = Math.abs((long)A);
    long divisor = Math.abs((long)B);

    long quotient = 0;
    if (dividend == 0 || dividend < divisor) return 0;

    for (int i = 31; i >= 0 ; i--) {
      if ( dividend >= divisor << i) {
        dividend -= divisor << i;
        quotient = i == 31 ? quotient - (1 << i) : quotient + (1<<i);
      }
    }
    if (negative) quotient = -quotient;
    if (quotient > Integer.MAX_VALUE) return Integer.MAX_VALUE;

    return (int) quotient;
    }
}
