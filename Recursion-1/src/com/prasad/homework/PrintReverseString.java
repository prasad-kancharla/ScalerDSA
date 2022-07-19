package com.prasad.homework;

import java.util.Scanner;

public class PrintReverseString {

  public static void main(String[] args) {
    StringBuilder sb = new StringBuilder();
    Scanner input = new Scanner(System.in);
    String s = input.nextLine();
    reversePrint(s);
//    reverseUnnecessary(s,sb);
//    System.out.println(sb.toString());
  }

  public static void reversePrint(String s) {
    int length = s.length();
    if (length == 0) {
      return;
    }
    System.out.print(s.charAt(length - 1));
    reversePrint(s.substring(0,length - 1));
  }

  public static String reverseUnnecessary(String s, StringBuilder sb) {
    if(s.length() == 0) {
      return "";
    }
    sb.append(s.charAt(s.length() - 1));
    return reverseUnnecessary(s.substring(0, s.length() - 1), sb);
  }

}
