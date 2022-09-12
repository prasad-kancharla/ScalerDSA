package com.prasad.assignment;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class FirstNonRepeatingCharacter {

  public static void main(String[] args) {
    System.out.println(solve("abadbc"));
  }


  public static String solve(String A) {

    int n = A.length();
    HashMap<Character, Integer> characterCountMap = new HashMap<>();
    Queue<Character> characterQueue = new LinkedList<>();

    StringBuilder ans = new StringBuilder();

    for (int i = 0; i < n; i++) {
      char c = A.charAt(i);
      if (characterCountMap.containsKey(c)) {
        characterCountMap.put(c,characterCountMap.get(c) + 1);
      } else {
        characterCountMap.put(c,1);
        characterQueue.offer(c);
      }

      while (!characterQueue.isEmpty() && characterCountMap.get(characterQueue.peek()) > 1) {
        characterQueue.poll();
      }

      char nonRepeatingCharacter = characterQueue.isEmpty() ? '#' : characterQueue.peek();
      ans.append(nonRepeatingCharacter);
    }
    return ans.toString();
  }
}
