package com.prasad.homework;

import java.util.Scanner;

public class PrintReverseString {

  public static void main(String[] args) {
    StringBuilder sb = new StringBuilder();
    Scanner input = new Scanner(System.in);
    String s = input.nextLine();
    reverse(s,sb);
    System.out.println(sb.toString());
  }

  public static String reverse(String s, StringBuilder sb) {
    if(s.length() == 0) {
      return "";
    }
    sb.append(s.charAt(s.length() - 1));
    return reverse(s.substring(0, s.length() - 1), sb);
  }

}
