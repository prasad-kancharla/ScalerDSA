package com.prasad.homework;

public class ReverseBits {

  public static void main(String[] args) {
    System.out.println(reverse(3));
  }

  public static long reverse(long A) {
    StringBuilder sb = new StringBuilder(Long.toBinaryString(A));
    StringBuilder sb2 = new StringBuilder();
    int length = sb.length();
    for (int i = 0; i < 32 - length; i++) {
      sb2.append("0");
    }
    sb2.append(sb);
    sb2.reverse();
    return Long.parseLong(sb2.toString(),2);
  }

}
