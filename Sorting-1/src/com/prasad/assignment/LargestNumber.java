package com.prasad.assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LargestNumber {

  public static void main(String[] args) {
    List<Integer> list = new ArrayList<>();
    list.add(3);
    list.add(5);
    list.add(9);
    list.add(34);
    list.add(30);

    System.out.println(largestNumber(list));
  }

  public static String largestNumber(final List<Integer> A) {
    Comparator<String> myComparator = (String x, String y) -> {
      String xy = x + y;
      String yx = y + x;
      return xy.compareTo(yx) > 0 ? -1 : 1;
    };

    List<String> input = new ArrayList<>();
    for (Integer i : A) {
      input.add(String.valueOf(i));
    }
    Collections.sort(input, myComparator);
    StringBuilder output = new StringBuilder();
    for (String s : input) {
      if (Integer.valueOf(s) != 0) {
        output.append(s);
      }
    }
    if (output.length() == 0) {
      output.append(0);
    }
    return output.toString();
  }
}
