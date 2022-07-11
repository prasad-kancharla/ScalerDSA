package com.prasad.assignment;

public class EnumeratingGCD {

  public static void main(String[] args) {
    System.out.println(Long.MAX_VALUE);
//    System.out.println(solve("678728391838182039102","678728391838182039103"));
  }

  public static String solve(String A, String B) {
    int aZeroes = 0;
    int bZeroes = 0;
    int al = A.length();
    int bl = B.length();
    for (int i = al - 1; i >= 0 ; i--) {
      if(A.charAt(i) == '0') {
        aZeroes++;
      } else {
        break;
      }
    }

    for (int i = bl - 1; i >= 0 ; i--) {
      if(B.charAt(i) == '0') {
        bZeroes++;
      } else {
        break;
      }
    }

    long num1 = Long.valueOf(A.substring(0,al - aZeroes));
    long num2 = Long.valueOf(B.substring(0,bl - bZeroes));

    long gcd = getGCD(num1,num2);
    StringBuilder sb = new StringBuilder(String.valueOf(gcd));
    int noOfZeroes = aZeroes > bZeroes ? aZeroes : bZeroes;

    for (int i = 0; i < noOfZeroes; i++) {
      sb.append('0');
    }
    return sb.toString();
  }

  public static long getGCD(long a, long b) {
    if (b == 0) {
      return a;
    }
    return getGCD(b, a % b);
  }

}
